/**
 */
package playlist.impl;

import collection.CollectionPackage;

import collection.impl.CollectionPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pbconfig.PbconfigPackage;

import pbconfig.impl.PbconfigPackageImpl;

import playlist.PlayItem;
import playlist.Playlist;
import playlist.PlaylistFactory;
import playlist.PlaylistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaylistPackageImpl extends EPackageImpl implements PlaylistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playItemEClass = null;

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
	 * @see playlist.PlaylistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlaylistPackageImpl() {
		super(eNS_URI, PlaylistFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PlaylistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlaylistPackage init() {
		if (isInited) return (PlaylistPackage)EPackage.Registry.INSTANCE.getEPackage(PlaylistPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlaylistPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlaylistPackageImpl thePlaylistPackage = registeredPlaylistPackage instanceof PlaylistPackageImpl ? (PlaylistPackageImpl)registeredPlaylistPackage : new PlaylistPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(registeredPackage instanceof CollectionPackageImpl ? registeredPackage : CollectionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PbconfigPackage.eNS_URI);
		PbconfigPackageImpl thePbconfigPackage = (PbconfigPackageImpl)(registeredPackage instanceof PbconfigPackageImpl ? registeredPackage : PbconfigPackage.eINSTANCE);

		// Create package meta-data objects
		thePlaylistPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		thePbconfigPackage.createPackageContents();

		// Initialize created meta-data
		thePlaylistPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		thePbconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlaylistPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlaylistPackage.eNS_URI, thePlaylistPackage);
		return thePlaylistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaylist() {
		return playlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Playitem() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Configuration() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaylist_Collection() {
		return (EReference)playlistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayItem() {
		return playItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaylistFactory getPlaylistFactory() {
		return (PlaylistFactory)getEFactoryInstance();
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
		playlistEClass = createEClass(PLAYLIST);
		createEReference(playlistEClass, PLAYLIST__PLAYITEM);
		createEReference(playlistEClass, PLAYLIST__CONFIGURATION);
		createEReference(playlistEClass, PLAYLIST__COLLECTION);

		playItemEClass = createEClass(PLAY_ITEM);
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

		// Obtain other dependent packages
		PbconfigPackage thePbconfigPackage = (PbconfigPackage)EPackage.Registry.INSTANCE.getEPackage(PbconfigPackage.eNS_URI);
		CollectionPackage theCollectionPackage = (CollectionPackage)EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(playlistEClass, Playlist.class, "Playlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaylist_Playitem(), this.getPlayItem(), null, "playitem", null, 0, -1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaylist_Configuration(), thePbconfigPackage.getConfiguration(), null, "configuration", null, 0, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaylist_Collection(), theCollectionPackage.getCollection(), null, "collection", null, 1, 1, Playlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playItemEClass, PlayItem.class, "PlayItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PlaylistPackageImpl
