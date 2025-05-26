/**
 */
package relation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relation.MainCollection#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see relation.RelationPackage#getMainCollection()
 * @model
 * @generated
 */
public interface MainCollection extends DerivedCollection {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link relation.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see relation.RelationPackage#getMainCollection_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

} // MainCollection
