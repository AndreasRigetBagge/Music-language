/**
 */
package pbconfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pbconfig.PbconfigFactory
 * @model kind="package"
 * @generated
 */
public interface PbconfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pbconfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/pbconfig";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pbconfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PbconfigPackage eINSTANCE = pbconfig.impl.PbconfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link pbconfig.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.ConfigurationImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pbconfig.impl.ConfigItemImpl <em>Config Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.ConfigItemImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getConfigItem()
	 * @generated
	 */
	int CONFIG_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Config Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pbconfig.impl.FlagConfigImpl <em>Flag Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.FlagConfigImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getFlagConfig()
	 * @generated
	 */
	int FLAG_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_CONFIG__VALUE = CONFIG_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_CONFIG__KIND = CONFIG_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flag Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_CONFIG_FEATURE_COUNT = CONFIG_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flag Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_CONFIG_OPERATION_COUNT = CONFIG_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pbconfig.impl.NumberConfigImpl <em>Number Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.NumberConfigImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getNumberConfig()
	 * @generated
	 */
	int NUMBER_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONFIG__VALUE = CONFIG_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONFIG__KIND = CONFIG_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONFIG_FEATURE_COUNT = CONFIG_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Number Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_CONFIG_OPERATION_COUNT = CONFIG_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pbconfig.BooleanConfig <em>Boolean Config</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.BooleanConfig
	 * @see pbconfig.impl.PbconfigPackageImpl#getBooleanConfig()
	 * @generated
	 */
	int BOOLEAN_CONFIG = 4;

	/**
	 * The meta object id for the '{@link pbconfig.IntegerConfig <em>Integer Config</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.IntegerConfig
	 * @see pbconfig.impl.PbconfigPackageImpl#getIntegerConfig()
	 * @generated
	 */
	int INTEGER_CONFIG = 5;


	/**
	 * Returns the meta object for class '{@link pbconfig.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see pbconfig.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link pbconfig.Configuration#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see pbconfig.Configuration#getOption()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Option();

	/**
	 * Returns the meta object for the attribute '{@link pbconfig.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pbconfig.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link pbconfig.ConfigItem <em>Config Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Item</em>'.
	 * @see pbconfig.ConfigItem
	 * @generated
	 */
	EClass getConfigItem();

	/**
	 * Returns the meta object for class '{@link pbconfig.FlagConfig <em>Flag Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag Config</em>'.
	 * @see pbconfig.FlagConfig
	 * @generated
	 */
	EClass getFlagConfig();

	/**
	 * Returns the meta object for the attribute '{@link pbconfig.FlagConfig#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pbconfig.FlagConfig#isValue()
	 * @see #getFlagConfig()
	 * @generated
	 */
	EAttribute getFlagConfig_Value();

	/**
	 * Returns the meta object for the attribute '{@link pbconfig.FlagConfig#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pbconfig.FlagConfig#getKind()
	 * @see #getFlagConfig()
	 * @generated
	 */
	EAttribute getFlagConfig_Kind();

	/**
	 * Returns the meta object for class '{@link pbconfig.NumberConfig <em>Number Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Config</em>'.
	 * @see pbconfig.NumberConfig
	 * @generated
	 */
	EClass getNumberConfig();

	/**
	 * Returns the meta object for the attribute '{@link pbconfig.NumberConfig#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pbconfig.NumberConfig#getValue()
	 * @see #getNumberConfig()
	 * @generated
	 */
	EAttribute getNumberConfig_Value();

	/**
	 * Returns the meta object for the attribute '{@link pbconfig.NumberConfig#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see pbconfig.NumberConfig#getKind()
	 * @see #getNumberConfig()
	 * @generated
	 */
	EAttribute getNumberConfig_Kind();

	/**
	 * Returns the meta object for enum '{@link pbconfig.BooleanConfig <em>Boolean Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Config</em>'.
	 * @see pbconfig.BooleanConfig
	 * @generated
	 */
	EEnum getBooleanConfig();

	/**
	 * Returns the meta object for enum '{@link pbconfig.IntegerConfig <em>Integer Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Integer Config</em>'.
	 * @see pbconfig.IntegerConfig
	 * @generated
	 */
	EEnum getIntegerConfig();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PbconfigFactory getPbconfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pbconfig.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.ConfigurationImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__OPTION = eINSTANCE.getConfiguration_Option();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.ConfigItemImpl <em>Config Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.ConfigItemImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getConfigItem()
		 * @generated
		 */
		EClass CONFIG_ITEM = eINSTANCE.getConfigItem();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.FlagConfigImpl <em>Flag Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.FlagConfigImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getFlagConfig()
		 * @generated
		 */
		EClass FLAG_CONFIG = eINSTANCE.getFlagConfig();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG_CONFIG__VALUE = eINSTANCE.getFlagConfig_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG_CONFIG__KIND = eINSTANCE.getFlagConfig_Kind();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.NumberConfigImpl <em>Number Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.NumberConfigImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getNumberConfig()
		 * @generated
		 */
		EClass NUMBER_CONFIG = eINSTANCE.getNumberConfig();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONFIG__VALUE = eINSTANCE.getNumberConfig_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_CONFIG__KIND = eINSTANCE.getNumberConfig_Kind();

		/**
		 * The meta object literal for the '{@link pbconfig.BooleanConfig <em>Boolean Config</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.BooleanConfig
		 * @see pbconfig.impl.PbconfigPackageImpl#getBooleanConfig()
		 * @generated
		 */
		EEnum BOOLEAN_CONFIG = eINSTANCE.getBooleanConfig();

		/**
		 * The meta object literal for the '{@link pbconfig.IntegerConfig <em>Integer Config</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.IntegerConfig
		 * @see pbconfig.impl.PbconfigPackageImpl#getIntegerConfig()
		 * @generated
		 */
		EEnum INTEGER_CONFIG = eINSTANCE.getIntegerConfig();

	}

} //PbconfigPackage
