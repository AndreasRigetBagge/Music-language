/**
 */
package playlist;

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
 * @see playlist.PlaylistFactory
 * @model kind="package"
 * @generated
 */
public interface PlaylistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "playlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/playlist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "playlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaylistPackage eINSTANCE = playlist.impl.PlaylistPackageImpl.init();

	/**
	 * The meta object id for the '{@link playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.PlaylistImpl
	 * @see playlist.impl.PlaylistPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 0;

	/**
	 * The feature id for the '<em><b>Playitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__PLAYITEM = 0;

	/**
	 * The feature id for the '<em><b>Configurationreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__CONFIGURATIONREFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__COLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link playlist.impl.PlayItemImpl <em>Play Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.PlayItemImpl
	 * @see playlist.impl.PlaylistPackageImpl#getPlayItem()
	 * @generated
	 */
	int PLAY_ITEM = 2;

	/**
	 * The number of structural features of the '<em>Play Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Play Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link playlist.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.QueryImpl
	 * @see playlist.impl.PlaylistPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 1;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = PLAY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = PLAY_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link playlist.impl.ConfigurationReferenceImpl <em>Configuration Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.ConfigurationReferenceImpl
	 * @see playlist.impl.PlaylistPackageImpl#getConfigurationReference()
	 * @generated
	 */
	int CONFIGURATION_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Configuration Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Configuration Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link playlist.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.CollectionImpl
	 * @see playlist.impl.PlaylistPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 4;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link playlist.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see playlist.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the containment reference list '{@link playlist.Playlist#getPlayitem <em>Playitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playitem</em>'.
	 * @see playlist.Playlist#getPlayitem()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Playitem();

	/**
	 * Returns the meta object for the containment reference '{@link playlist.Playlist#getConfigurationreference <em>Configurationreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurationreference</em>'.
	 * @see playlist.Playlist#getConfigurationreference()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Configurationreference();

	/**
	 * Returns the meta object for the reference '{@link playlist.Playlist#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see playlist.Playlist#getCollection()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Collection();

	/**
	 * Returns the meta object for class '{@link playlist.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see playlist.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link playlist.PlayItem <em>Play Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Item</em>'.
	 * @see playlist.PlayItem
	 * @generated
	 */
	EClass getPlayItem();

	/**
	 * Returns the meta object for class '{@link playlist.ConfigurationReference <em>Configuration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Reference</em>'.
	 * @see playlist.ConfigurationReference
	 * @generated
	 */
	EClass getConfigurationReference();

	/**
	 * Returns the meta object for class '{@link playlist.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see playlist.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlaylistFactory getPlaylistFactory();

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
		 * The meta object literal for the '{@link playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.PlaylistImpl
		 * @see playlist.impl.PlaylistPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Playitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__PLAYITEM = eINSTANCE.getPlaylist_Playitem();

		/**
		 * The meta object literal for the '<em><b>Configurationreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__CONFIGURATIONREFERENCE = eINSTANCE.getPlaylist_Configurationreference();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__COLLECTION = eINSTANCE.getPlaylist_Collection();

		/**
		 * The meta object literal for the '{@link playlist.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.QueryImpl
		 * @see playlist.impl.PlaylistPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link playlist.impl.PlayItemImpl <em>Play Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.PlayItemImpl
		 * @see playlist.impl.PlaylistPackageImpl#getPlayItem()
		 * @generated
		 */
		EClass PLAY_ITEM = eINSTANCE.getPlayItem();

		/**
		 * The meta object literal for the '{@link playlist.impl.ConfigurationReferenceImpl <em>Configuration Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.ConfigurationReferenceImpl
		 * @see playlist.impl.PlaylistPackageImpl#getConfigurationReference()
		 * @generated
		 */
		EClass CONFIGURATION_REFERENCE = eINSTANCE.getConfigurationReference();

		/**
		 * The meta object literal for the '{@link playlist.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.CollectionImpl
		 * @see playlist.impl.PlaylistPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

	}

} //PlaylistPackage
