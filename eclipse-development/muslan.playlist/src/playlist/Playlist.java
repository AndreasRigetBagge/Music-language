/**
 */
package playlist;

import musiccollection.Track;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pbconfig.Configuration;

import query.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link playlist.Playlist#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link playlist.Playlist#getQuery <em>Query</em>}</li>
 *   <li>{@link playlist.Playlist#getTrack <em>Track</em>}</li>
 * </ul>
 *
 * @see playlist.PlaylistPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see playlist.PlaylistPackage#getPlaylist_Configuration()
	 * @model
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link playlist.Playlist#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference list.
	 * The list contents are of type {@link query.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference list.
	 * @see playlist.PlaylistPackage#getPlaylist_Query()
	 * @model
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Track</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' reference list.
	 * @see playlist.PlaylistPackage#getPlaylist_Track()
	 * @model
	 * @generated
	 */
	EList<Track> getTrack();

} // Playlist
