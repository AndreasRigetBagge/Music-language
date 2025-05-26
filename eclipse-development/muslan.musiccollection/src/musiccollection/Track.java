/**
 */
package musiccollection;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.Track#getCompositions <em>Compositions</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends CategorizedElement {
	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Composition}.
	 * It is bidirectional and its opposite is '{@link musiccollection.Composition#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getTrack_Compositions()
	 * @see musiccollection.Composition#getTracks
	 * @model opposite="tracks"
	 * @generated
	 */
	EList<Composition> getCompositions();

} // Track
