/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Clause#getValue <em>Value</em>}</li>
 *   <li>{@link query.Clause#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getClause()
 * @model abstract="true"
 * @generated
 */
public interface Clause extends FilterClause {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see query.QueryPackage#getClause_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link query.Clause#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link query.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see query.OperatorType
	 * @see #setOperator(OperatorType)
	 * @see query.QueryPackage#getClause_Operator()
	 * @model required="true"
	 * @generated
	 */
	OperatorType getOperator();

	/**
	 * Sets the value of the '{@link query.Clause#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see query.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorType value);

} // Clause
