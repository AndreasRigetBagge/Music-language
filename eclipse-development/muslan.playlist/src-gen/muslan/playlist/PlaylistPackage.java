/**
 */
package muslan.playlist;

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
 * @see muslan.playlist.PlaylistFactory
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
	PlaylistPackage eINSTANCE = muslan.playlist.impl.PlaylistPackageImpl.init();

	/**
	 * The meta object id for the '{@link muslan.playlist.impl.TrackReferenceImpl <em>Track Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see muslan.playlist.impl.TrackReferenceImpl
	 * @see muslan.playlist.impl.PlaylistPackageImpl#getTrackReference()
	 * @generated
	 */
	int TRACK_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_REFERENCE__TRACK = 0;

	/**
	 * The number of structural features of the '<em>Track Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Track Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link muslan.playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see muslan.playlist.impl.PlaylistImpl
	 * @see muslan.playlist.impl.PlaylistPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 1;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link muslan.playlist.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see muslan.playlist.impl.QueryImpl
	 * @see muslan.playlist.impl.PlaylistPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = PLAYLIST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = PLAYLIST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link muslan.playlist.impl.TrackListImpl <em>Track List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see muslan.playlist.impl.TrackListImpl
	 * @see muslan.playlist.impl.PlaylistPackageImpl#getTrackList()
	 * @generated
	 */
	int TRACK_LIST = 3;

	/**
	 * The feature id for the '<em><b>Trackreference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_LIST__TRACKREFERENCE = PLAYLIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_LIST_FEATURE_COUNT = PLAYLIST_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Track List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_LIST_OPERATION_COUNT = PLAYLIST_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link muslan.playlist.TrackReference <em>Track Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track Reference</em>'.
	 * @see muslan.playlist.TrackReference
	 * @generated
	 */
	EClass getTrackReference();

	/**
	 * Returns the meta object for the reference '{@link muslan.playlist.TrackReference#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track</em>'.
	 * @see muslan.playlist.TrackReference#getTrack()
	 * @see #getTrackReference()
	 * @generated
	 */
	EReference getTrackReference_Track();

	/**
	 * Returns the meta object for class '{@link muslan.playlist.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see muslan.playlist.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for class '{@link muslan.playlist.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see muslan.playlist.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for class '{@link muslan.playlist.TrackList <em>Track List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track List</em>'.
	 * @see muslan.playlist.TrackList
	 * @generated
	 */
	EClass getTrackList();

	/**
	 * Returns the meta object for the reference list '{@link muslan.playlist.TrackList#getTrackreference <em>Trackreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trackreference</em>'.
	 * @see muslan.playlist.TrackList#getTrackreference()
	 * @see #getTrackList()
	 * @generated
	 */
	EReference getTrackList_Trackreference();

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
		 * The meta object literal for the '{@link muslan.playlist.impl.TrackReferenceImpl <em>Track Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see muslan.playlist.impl.TrackReferenceImpl
		 * @see muslan.playlist.impl.PlaylistPackageImpl#getTrackReference()
		 * @generated
		 */
		EClass TRACK_REFERENCE = eINSTANCE.getTrackReference();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_REFERENCE__TRACK = eINSTANCE.getTrackReference_Track();

		/**
		 * The meta object literal for the '{@link muslan.playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see muslan.playlist.impl.PlaylistImpl
		 * @see muslan.playlist.impl.PlaylistPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '{@link muslan.playlist.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see muslan.playlist.impl.QueryImpl
		 * @see muslan.playlist.impl.PlaylistPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '{@link muslan.playlist.impl.TrackListImpl <em>Track List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see muslan.playlist.impl.TrackListImpl
		 * @see muslan.playlist.impl.PlaylistPackageImpl#getTrackList()
		 * @generated
		 */
		EClass TRACK_LIST = eINSTANCE.getTrackList();

		/**
		 * The meta object literal for the '<em><b>Trackreference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK_LIST__TRACKREFERENCE = eINSTANCE.getTrackList_Trackreference();

	}

} //PlaylistPackage
