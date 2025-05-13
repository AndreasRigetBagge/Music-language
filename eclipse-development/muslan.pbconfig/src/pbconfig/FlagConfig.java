/**
 */
package pbconfig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flag Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pbconfig.FlagConfig#isValue <em>Value</em>}</li>
 *   <li>{@link pbconfig.FlagConfig#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see pbconfig.PbconfigPackage#getFlagConfig()
 * @model
 * @generated
 */
public interface FlagConfig extends ConfigItem {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see pbconfig.PbconfigPackage#getFlagConfig_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link pbconfig.FlagConfig#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link pbconfig.BooleanConfig}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see pbconfig.BooleanConfig
	 * @see #setKind(BooleanConfig)
	 * @see pbconfig.PbconfigPackage#getFlagConfig_Kind()
	 * @model
	 * @generated
	 */
	BooleanConfig getKind();

	/**
	 * Sets the value of the '{@link pbconfig.FlagConfig#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see pbconfig.BooleanConfig
	 * @see #getKind()
	 * @generated
	 */
	void setKind(BooleanConfig value);

} // FlagConfig
