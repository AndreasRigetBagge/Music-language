/**
 */
package muslan.playlist;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link muslan.playlist.TrackList#getTrackreference <em>Trackreference</em>}</li>
 * </ul>
 *
 * @see muslan.playlist.PlaylistPackage#getTrackList()
 * @model
 * @generated
 */
public interface TrackList extends Playlist {
	/**
	 * Returns the value of the '<em><b>Trackreference</b></em>' reference list.
	 * The list contents are of type {@link muslan.playlist.TrackReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trackreference</em>' reference list.
	 * @see muslan.playlist.PlaylistPackage#getTrackList_Trackreference()
	 * @model
	 * @generated
	 */
	EList<TrackReference> getTrackreference();

} // TrackList
