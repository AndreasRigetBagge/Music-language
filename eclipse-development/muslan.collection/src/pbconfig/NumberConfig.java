/**
 */
package pbconfig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pbconfig.NumberConfig#getValue <em>Value</em>}</li>
 *   <li>{@link pbconfig.NumberConfig#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see pbconfig.PbconfigPackage#getNumberConfig()
 * @model
 * @generated
 */
public interface NumberConfig extends ConfigItem {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see pbconfig.PbconfigPackage#getNumberConfig_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link pbconfig.NumberConfig#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pbconfig.IntegerConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pbconfig.IntegerConfig
	 * @see #setKind(IntegerConfig)
	 * @see pbconfig.PbconfigPackage#getNumberConfig_Kind()
	 * @model
	 * @generated
	 */
	IntegerConfig getKind();

	/**
	 * Sets the value of the '{@link pbconfig.NumberConfig#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pbconfig.IntegerConfig
	 * @see #getKind()
	 * @generated
	 */
	void setKind(IntegerConfig value);

} // NumberConfig
