/**
 */
package muslan.playlist.impl;

import collection.CollectionPackage;

import collection.impl.CollectionPackageImpl;

import muslan.playlist.Playlist;
import muslan.playlist.PlaylistFactory;
import muslan.playlist.PlaylistPackage;
import muslan.playlist.Query;
import muslan.playlist.TrackList;
import muslan.playlist.TrackReference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass trackReferenceEClass = null;

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
	private EClass queryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackListEClass = null;

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
	 * @see muslan.playlist.PlaylistPackage#eNS_URI
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
		if (isInited)
			return (PlaylistPackage) EPackage.Registry.INSTANCE.getEPackage(PlaylistPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlaylistPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlaylistPackageImpl thePlaylistPackage = registeredPlaylistPackage instanceof PlaylistPackageImpl
				? (PlaylistPackageImpl) registeredPlaylistPackage
				: new PlaylistPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl) (registeredPackage instanceof CollectionPackageImpl
				? registeredPackage
				: CollectionPackage.eINSTANCE);

		// Create package meta-data objects
		thePlaylistPackage.createPackageContents();
		theCollectionPackage.createPackageContents();

		// Initialize created meta-data
		thePlaylistPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();

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
	public EClass getTrackReference() {
		return trackReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrackReference_Track() {
		return (EReference) trackReferenceEClass.getEStructuralFeatures().get(0);
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
	public EClass getQuery() {
		return queryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrackList() {
		return trackListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrackList_Trackreference() {
		return (EReference) trackListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaylistFactory getPlaylistFactory() {
		return (PlaylistFactory) getEFactoryInstance();
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
		trackReferenceEClass = createEClass(TRACK_REFERENCE);
		createEReference(trackReferenceEClass, TRACK_REFERENCE__TRACK);

		playlistEClass = createEClass(PLAYLIST);

		queryEClass = createEClass(QUERY);

		trackListEClass = createEClass(TRACK_LIST);
		createEReference(trackListEClass, TRACK_LIST__TRACKREFERENCE);
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

		// Obtain other dependent packages
		CollectionPackage theCollectionPackage = (CollectionPackage) EPackage.Registry.INSTANCE
				.getEPackage(CollectionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		queryEClass.getESuperTypes().add(this.getPlaylist());
		trackListEClass.getESuperTypes().add(this.getPlaylist());

		// Initialize classes, features, and operations; add parameters
		initEClass(trackReferenceEClass, TrackReference.class, "TrackReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrackReference_Track(), theCollectionPackage.getTrack(), null, "track", null, 1, 1,
				TrackReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playlistEClass, Playlist.class, "Playlist", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trackListEClass, TrackList.class, "TrackList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrackList_Trackreference(), this.getTrackReference(), null, "trackreference", null, 0, -1,
				TrackList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PlaylistPackageImpl
