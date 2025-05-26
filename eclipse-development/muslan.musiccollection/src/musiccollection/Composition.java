/**
 */
package musiccollection;

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
 *   <li>{@link musiccollection.Composition#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends CategorizedElement {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Track}.
	 * It is bidirectional and its opposite is '{@link musiccollection.Track#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getComposition_Tracks()
	 * @see musiccollection.Track#getCompositions
	 * @model opposite="compositions"
	 * @generated
	 */
	EList<Track> getTracks();

} // Composition
