/**
 */
package collection;

import org.eclipse.emf.common.util.EList;
import playlist.PlayItem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collection.Track#getCompositions <em>Compositions</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends CategorizedElement, PlayItem {

	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link collection.Composition}.
	 * It is bidirectional and its opposite is '{@link collection.Composition#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see collection.CollectionPackage#getTrack_Compositions()
	 * @see collection.Composition#getTracks
	 * @model opposite="tracks" required="true"
	 * @generated
	 */
	EList<Composition> getCompositions();
} // Track
