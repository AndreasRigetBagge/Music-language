/**
 */
package relation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relation.DerivedCollection#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see relation.RelationPackage#getDerivedCollection()
 * @model
 * @generated
 */
public interface DerivedCollection extends ICollection {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see relation.RelationPackage#getDerivedCollection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link relation.DerivedCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DerivedCollection
