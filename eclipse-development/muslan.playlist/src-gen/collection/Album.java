/**
 */
package collection;

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
 *   <li>{@link collection.Album#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends CategorizedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link collection.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see collection.CollectionPackage#getAlbum_Tracks()
	 * @model required="true"
	 * @generated
	 */
	EList<Track> getTracks();

} // Album
