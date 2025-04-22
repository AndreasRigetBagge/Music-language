/**
 */
package muslan.playlist;

import collection.Track;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link muslan.playlist.TrackReference#getTrack <em>Track</em>}</li>
 * </ul>
 *
 * @see muslan.playlist.PlaylistPackage#getTrackReference()
 * @model
 * @generated
 */
public interface TrackReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' reference.
	 * @see #setTrack(Track)
	 * @see muslan.playlist.PlaylistPackage#getTrackReference_Track()
	 * @model required="true"
	 * @generated
	 */
	Track getTrack();

	/**
	 * Sets the value of the '{@link muslan.playlist.TrackReference#getTrack <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(Track value);

} // TrackReference
