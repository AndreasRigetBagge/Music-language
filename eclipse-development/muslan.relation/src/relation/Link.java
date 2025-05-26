/**
 */
package relation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relation.Link#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link relation.Link#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see relation.RelationPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference.
	 * @see #setOutgoing(DerivedCollection)
	 * @see relation.RelationPackage#getLink_Outgoing()
	 * @model required="true"
	 * @generated
	 */
	DerivedCollection getOutgoing();

	/**
	 * Sets the value of the '{@link relation.Link#getOutgoing <em>Outgoing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing</em>' reference.
	 * @see #getOutgoing()
	 * @generated
	 */
	void setOutgoing(DerivedCollection value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference.
	 * @see #setIncoming(ICollection)
	 * @see relation.RelationPackage#getLink_Incoming()
	 * @model required="true"
	 * @generated
	 */
	ICollection getIncoming();

	/**
	 * Sets the value of the '{@link relation.Link#getIncoming <em>Incoming</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming</em>' reference.
	 * @see #getIncoming()
	 * @generated
	 */
	void setIncoming(ICollection value);

} // Link
