/**
 */
package collection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collection.Composition#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends CategorizedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link collection.Track}.
	 * It is bidirectional and its opposite is '{@link collection.Track#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see collection.CollectionPackage#getComposition_Tracks()
	 * @see collection.Track#getCompositions
	 * @model opposite="compositions"
	 * @generated
	 */
	EList<Track> getTracks();

} // Composition
