package muslan.playlist.interpreter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import queue.QueueFactory;
import queue.Queue;
import query.Query;
import query.Clause;
import query.TitleClause;
import query.FilterClause;
import query.AndClause;
import query.ArtistClause;
import query.CategorizedElementType;
import query.CategoryClause;
import query.OperatorType;
import query.OrClause;
import musiccollection.MusicCollection;
import musiccollection.Track;
import musiccollection.Album;
import musiccollection.CategorizedElement;
import musiccollection.CollectionRoot;
import musiccollection.Playlist;
import pbconfig.ConfigItem;
import pbconfig.Configuration;
import pbconfig.FlagConfig;
import pbconfig.IntegerConfig;
import pbconfig.NumberConfig;
import pbconfig.BooleanConfig;
import muslan.query.interpreter.QueryInterpreter;
import muslan.query.interpreter.QueryInterpreterException;

public class PlaylistInterpreter {
	public static Queue interpret(MusicCollection collection, String playlistname) throws PlaylistInterpreterException {
		List<Playlist> playlists = collection.getPlaylist();
		Playlist playlist = null;
		
		for (Playlist p : playlists) {
			if (p.getName().equals(playlistname)) { playlist = p; break; }
		}
		if (playlist == null) throw new PlaylistInterpreterException("No such playlist exists in the collection");
		return interpret(playlist);
	}
	
	public static Queue interpret(Playlist playlist) throws PlaylistInterpreterException {
		List<Query> qs = playlist.getQuery();
		List<Track> ts = playlist.getTrack();

		Queue output = QueueFactory.eINSTANCE.createQueue();
		List<Track> tracks = new ArrayList<Track>();
		tracks.addAll(ts);
		for (Query q : qs) {
			try {
				tracks.addAll(QueryInterpreter.interpret(q).getTracks());
			} catch (QueryInterpreterException e) {
				e.printStackTrace();
				throw new PlaylistInterpreterException("Error while interpreting a query");
			}
		}
		
		Configuration config = playlist.getConfiguration();
		if (!(config instanceof Configuration)) { 
			if (playlist.eContainer() instanceof MusicCollection collection) config = ((CollectionRoot) collection.eContainer()).getDefaultConfig();
		}
		if (config instanceof Configuration) configureQueue(tracks, config);

		output.getTracks().addAll(tracks);
		return output; 
	}
	
	public static void configureQueue(List<Track> tracks, Configuration config) {
		List<ConfigItem> configs = config.getOption();
		int maxtracks = -1;
		for (ConfigItem c : configs) {
			if (c instanceof FlagConfig fc) {
				switch (fc.getKind()) {
				case BooleanConfig.SHUFFLE:
					if (fc.isValue()) shuffleTracks(tracks);
					break;
				case BooleanConfig.SKIP_UNAVAILABLE:
					// Out of scope
					break;
				}
			} else if (c instanceof NumberConfig ic) {
				switch (ic.getKind()) {
				case IntegerConfig.SLEEP_TIMER:
					maxtracks = ic.getValue();
					// Out of scope
					break;
					
				}
			}
		}
		concatTracks(tracks, maxtracks);
	}
	
	public static void shuffleTracks(List<Track> tracks) {
		Collections.shuffle(tracks);
	}
	
	public static void concatTracks(List<Track> tracks, int limit) {
		limit = limit > tracks.size() ? tracks.size() : limit;
		tracks.retainAll(tracks.subList(0, limit));
	}

}
