package muslan.query.interpreter;

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
import musiccollection.Category;
import musiccollection.CategoryType;
import musiccollection.Track;
import musiccollection.Album;
import musiccollection.CategorizedElement;

public class QueryInterpreter {
	public static Queue interpret(Query query) throws QueryInterpreterException {
		FilterClause filter = query.getFilter();
		MusicCollection musiccollection = query.getMusiccollection();
		Queue q = QueueFactory.eINSTANCE.createQueue();
		List<Track> tracks = q.getTracks();

		if (query.getType() == CategorizedElementType.ALBUM)
			filterAlbums(musiccollection, filter, tracks);
		else if (query.getType() == CategorizedElementType.TRACK)
			filterTracks(musiccollection, filter, tracks);
		return q;
	}

	public static void filterTracks(MusicCollection c, FilterClause f, List<Track> output) {
		List<Track> tracks = c.getCategorizedelements().stream()
				.filter(e -> (e instanceof Track) && filterElement(e, f))
				.map(e -> (Track) e)
				.toList();
		output.addAll(tracks);
	}

	public static void filterAlbums(MusicCollection c, FilterClause f, List<Track> output) {
		List<Track> tracks = c.getCategorizedelements().stream()
				.filter(e -> (e instanceof Album) && filterElement(e, f))
				.map(e -> (Album) e)
				.flatMap(a -> a.getTracks().stream())
				.toList();
		output.addAll(tracks);
	}

	public static boolean filterElement(CategorizedElement e, FilterClause f) {
		if (f instanceof Clause c) {
			List<String> values = Collections.emptyList();
			String u = c.getValue();

			if (f instanceof CategoryClause cc) {
				values = e.getCategory().stream()
						.filter(elem -> elem.getCategoryType() == cc.getCategory())
						.map(elem -> elem.getValue()).toList();
			} else if (f instanceof ArtistClause) {
				values = e.getArtists().stream().map(elem -> elem.getName()).toList();
			} else if (f instanceof TitleClause) {
				values = new ArrayList<String>();
				values.add(e.getName());
			}
			for (String t : values) {
				switch (c.getOperator()) {
					case OperatorType.SAME_AS:
						if (t.equals(u))
							return true;
						break;
					case OperatorType.DIFFERENT_FROM:
						if (!t.equals(u))
							return true;
						break;
					case OperatorType.GREATER_THAN:
						if (t.compareToIgnoreCase(u) > 0)
							return true;
						break;
					case OperatorType.LESS_THAN:
						if (t.compareToIgnoreCase(u) < 0)
							return true;
						break;
				}
			}
			return false;

		} else if (f instanceof AndClause andclause) { 
			return andclause.getFilterclause().stream().allMatch(clause -> filterElement(e, clause));
		} else if (f instanceof OrClause orclause) {
			return orclause.getFilterclause().stream().anyMatch(clause -> filterElement(e, clause));
		}
		return false;
	}
}
