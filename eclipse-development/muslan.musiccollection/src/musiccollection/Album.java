/**
 */
package musiccollection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.Album#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends CategorizedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getAlbum_Tracks()
	 * @model required="true"
	 * @generated
	 */
	EList<Track> getTracks();

} // Album
