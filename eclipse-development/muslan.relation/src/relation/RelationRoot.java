/**
 */
package relation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relation.RelationRoot#getLinks <em>Links</em>}</li>
 *   <li>{@link relation.RelationRoot#getProviders <em>Providers</em>}</li>
 *   <li>{@link relation.RelationRoot#getMaincollection <em>Maincollection</em>}</li>
 * </ul>
 *
 * @see relation.RelationPackage#getRelationRoot()
 * @model
 * @generated
 */
public interface RelationRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link relation.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see relation.RelationPackage#getRelationRoot_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link relation.ICollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see relation.RelationPackage#getRelationRoot_Providers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ICollection> getProviders();

	/**
	 * Returns the value of the '<em><b>Maincollection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maincollection</em>' reference.
	 * @see #setMaincollection(MainCollection)
	 * @see relation.RelationPackage#getRelationRoot_Maincollection()
	 * @model required="true"
	 * @generated
	 */
	MainCollection getMaincollection();

	/**
	 * Sets the value of the '{@link relation.RelationRoot#getMaincollection <em>Maincollection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maincollection</em>' reference.
	 * @see #getMaincollection()
	 * @generated
	 */
	void setMaincollection(MainCollection value);

} // RelationRoot
