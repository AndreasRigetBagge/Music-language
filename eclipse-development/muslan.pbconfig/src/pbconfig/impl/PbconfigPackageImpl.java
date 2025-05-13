/**
 */
package pbconfig.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pbconfig.BooleanConfig;
import pbconfig.ConfigItem;
import pbconfig.Configuration;
import pbconfig.FlagConfig;
import pbconfig.IntegerConfig;
import pbconfig.NumberConfig;
import pbconfig.PbconfigFactory;
import pbconfig.PbconfigPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PbconfigPackageImpl extends EPackageImpl implements PbconfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanConfigEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum integerConfigEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pbconfig.PbconfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PbconfigPackageImpl() {
		super(eNS_URI, PbconfigFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PbconfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PbconfigPackage init() {
		if (isInited) return (PbconfigPackage)EPackage.Registry.INSTANCE.getEPackage(PbconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPbconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PbconfigPackageImpl thePbconfigPackage = registeredPbconfigPackage instanceof PbconfigPackageImpl ? (PbconfigPackageImpl)registeredPbconfigPackage : new PbconfigPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePbconfigPackage.createPackageContents();

		// Initialize created meta-data
		thePbconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePbconfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PbconfigPackage.eNS_URI, thePbconfigPackage);
		return thePbconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Option() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguration_Name() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigItem() {
		return configItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlagConfig() {
		return flagConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlagConfig_Value() {
		return (EAttribute)flagConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFlagConfig_Kind() {
		return (EAttribute)flagConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberConfig() {
		return numberConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberConfig_Value() {
		return (EAttribute)numberConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberConfig_Kind() {
		return (EAttribute)numberConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBooleanConfig() {
		return booleanConfigEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIntegerConfig() {
		return integerConfigEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PbconfigFactory getPbconfigFactory() {
		return (PbconfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__OPTION);
		createEAttribute(configurationEClass, CONFIGURATION__NAME);

		configItemEClass = createEClass(CONFIG_ITEM);

		flagConfigEClass = createEClass(FLAG_CONFIG);
		createEAttribute(flagConfigEClass, FLAG_CONFIG__VALUE);
		createEAttribute(flagConfigEClass, FLAG_CONFIG__KIND);

		numberConfigEClass = createEClass(NUMBER_CONFIG);
		createEAttribute(numberConfigEClass, NUMBER_CONFIG__VALUE);
		createEAttribute(numberConfigEClass, NUMBER_CONFIG__KIND);

		// Create enums
		booleanConfigEEnum = createEEnum(BOOLEAN_CONFIG);
		integerConfigEEnum = createEEnum(INTEGER_CONFIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flagConfigEClass.getESuperTypes().add(this.getConfigItem());
		numberConfigEClass.getESuperTypes().add(this.getConfigItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Option(), this.getConfigItem(), null, "option", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configItemEClass, ConfigItem.class, "ConfigItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flagConfigEClass, FlagConfig.class, "FlagConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlagConfig_Value(), ecorePackage.getEBoolean(), "Value", null, 0, 1, FlagConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlagConfig_Kind(), this.getBooleanConfig(), "Kind", null, 0, 1, FlagConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberConfigEClass, NumberConfig.class, "NumberConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberConfig_Value(), ecorePackage.getEInt(), "Value", null, 0, 1, NumberConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberConfig_Kind(), this.getIntegerConfig(), "Kind", null, 0, 1, NumberConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanConfigEEnum, BooleanConfig.class, "BooleanConfig");
		addEEnumLiteral(booleanConfigEEnum, BooleanConfig.SHUFFLE);
		addEEnumLiteral(booleanConfigEEnum, BooleanConfig.SKIP_UNAVAILABLE);

		initEEnum(integerConfigEEnum, IntegerConfig.class, "IntegerConfig");
		addEEnumLiteral(integerConfigEEnum, IntegerConfig.SLEEP_TIMER);

		// Create resource
		createResource(eNS_URI);
	}

} //PbconfigPackageImpl
