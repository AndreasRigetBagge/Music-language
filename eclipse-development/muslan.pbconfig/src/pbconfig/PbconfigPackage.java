/**
 */
package pbconfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	String eNS_URI = "http://example.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "muslan";

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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DEFAULT = 1;

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
	 * The meta object id for the '{@link pbconfig.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.OptionImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pbconfig.impl.FlagOptionImpl <em>Flag Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.FlagOptionImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getFlagOption()
	 * @generated
	 */
	int FLAG_OPTION = 2;

	/**
	 * The number of structural features of the '<em>Flag Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Flag Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pbconfig.impl.ValueOptionImpl <em>Value Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pbconfig.impl.ValueOptionImpl
	 * @see pbconfig.impl.PbconfigPackageImpl#getValueOption()
	 * @generated
	 */
	int VALUE_OPTION = 3;

	/**
	 * The number of structural features of the '<em>Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION_FEATURE_COUNT = OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPTION_OPERATION_COUNT = OPTION_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the attribute '{@link pbconfig.Configuration#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see pbconfig.Configuration#isDefault()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Default();

	/**
	 * Returns the meta object for class '{@link pbconfig.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see pbconfig.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for class '{@link pbconfig.FlagOption <em>Flag Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag Option</em>'.
	 * @see pbconfig.FlagOption
	 * @generated
	 */
	EClass getFlagOption();

	/**
	 * Returns the meta object for class '{@link pbconfig.ValueOption <em>Value Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Option</em>'.
	 * @see pbconfig.ValueOption
	 * @generated
	 */
	EClass getValueOption();

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
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DEFAULT = eINSTANCE.getConfiguration_Default();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.OptionImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.FlagOptionImpl <em>Flag Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.FlagOptionImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getFlagOption()
		 * @generated
		 */
		EClass FLAG_OPTION = eINSTANCE.getFlagOption();

		/**
		 * The meta object literal for the '{@link pbconfig.impl.ValueOptionImpl <em>Value Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pbconfig.impl.ValueOptionImpl
		 * @see pbconfig.impl.PbconfigPackageImpl#getValueOption()
		 * @generated
		 */
		EClass VALUE_OPTION = eINSTANCE.getValueOption();

	}

} //PbconfigPackage
