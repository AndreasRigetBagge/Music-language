/**
 */
package pbconfig.impl;

import collection.CollectionPackage;

import collection.impl.CollectionPackageImpl;

import muslan.playlist.PlaylistPackage;

import muslan.playlist.impl.PlaylistPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pbconfig.Configuration;
import pbconfig.FlagOption;
import pbconfig.Option;
import pbconfig.PbconfigFactory;
import pbconfig.PbconfigPackage;
import pbconfig.ValueOption;

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
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueOptionEClass = null;

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
		if (isInited)
			return (PbconfigPackage) EPackage.Registry.INSTANCE.getEPackage(PbconfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPbconfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PbconfigPackageImpl thePbconfigPackage = registeredPbconfigPackage instanceof PbconfigPackageImpl
				? (PbconfigPackageImpl) registeredPbconfigPackage
				: new PbconfigPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlaylistPackage.eNS_URI);
		PlaylistPackageImpl thePlaylistPackage = (PlaylistPackageImpl) (registeredPackage instanceof PlaylistPackageImpl
				? registeredPackage
				: PlaylistPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl) (registeredPackage instanceof CollectionPackageImpl
				? registeredPackage
				: CollectionPackage.eINSTANCE);

		// Create package meta-data objects
		thePbconfigPackage.createPackageContents();
		thePlaylistPackage.createPackageContents();
		theCollectionPackage.createPackageContents();

		// Initialize created meta-data
		thePbconfigPackage.initializePackageContents();
		thePlaylistPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();

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
		return (EReference) configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfiguration_Default() {
		return (EAttribute) configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlagOption() {
		return flagOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueOption() {
		return valueOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PbconfigFactory getPbconfigFactory() {
		return (PbconfigFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__OPTION);
		createEAttribute(configurationEClass, CONFIGURATION__DEFAULT);

		optionEClass = createEClass(OPTION);

		flagOptionEClass = createEClass(FLAG_OPTION);

		valueOptionEClass = createEClass(VALUE_OPTION);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flagOptionEClass.getESuperTypes().add(this.getOption());
		valueOptionEClass.getESuperTypes().add(this.getOption());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Option(), this.getOption(), null, "option", null, 0, -1, Configuration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1,
				Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flagOptionEClass, FlagOption.class, "FlagOption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueOptionEClass, ValueOption.class, "ValueOption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PbconfigPackageImpl
