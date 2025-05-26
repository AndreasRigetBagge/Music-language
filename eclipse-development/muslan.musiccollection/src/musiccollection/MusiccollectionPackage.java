/**
 */
package musiccollection;

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
 * @see musiccollection.MusiccollectionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface MusiccollectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "musiccollection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/musiccollection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "musiccollection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusiccollectionPackage eINSTANCE = musiccollection.impl.MusiccollectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link musiccollection.impl.MusicCollectionImpl <em>Music Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.MusicCollectionImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getMusicCollection()
	 * @generated
	 */
	int MUSIC_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Categorizedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_COLLECTION__CATEGORIZEDELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_COLLECTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Playlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_COLLECTION__PLAYLIST = 2;

	/**
	 * The number of structural features of the '<em>Music Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_COLLECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Music Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUSIC_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.CategorizedElementImpl <em>Categorized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.CategorizedElementImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategorizedElement()
	 * @generated
	 */
	int CATEGORIZED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_ELEMENT__ARTISTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_ELEMENT__CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Categorized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Categorized Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORIZED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.TrackImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 1;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ARTISTS = CATEGORIZED_ELEMENT__ARTISTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = CATEGORIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__CATEGORY = CATEGORIZED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__COMPOSITIONS = CATEGORIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = CATEGORIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_OPERATION_COUNT = CATEGORIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.AlbumImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 2;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ARTISTS = CATEGORIZED_ELEMENT__ARTISTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = CATEGORIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__CATEGORY = CATEGORIZED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__TRACKS = CATEGORIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = CATEGORIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_OPERATION_COUNT = CATEGORIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.CompositionImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__ARTISTS = CATEGORIZED_ELEMENT__ARTISTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = CATEGORIZED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__CATEGORY = CATEGORIZED_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TRACKS = CATEGORIZED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = CATEGORIZED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = CATEGORIZED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.ArtistImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__NAME = 0;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.CategoryImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 6;

	/**
	 * The feature id for the '<em><b>Category Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.CollectionRootImpl <em>Collection Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.CollectionRootImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getCollectionRoot()
	 * @generated
	 */
	int COLLECTION_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Musiccollection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__MUSICCOLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__ARTIST = 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__CATEGORIES = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Default Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__DEFAULT_CONFIG = 4;

	/**
	 * The number of structural features of the '<em>Collection Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Collection Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.impl.PlaylistImpl
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__TRACK = 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__CONFIGURATION = 3;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link musiccollection.CategoryType <em>Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see musiccollection.CategoryType
	 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link musiccollection.MusicCollection <em>Music Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Music Collection</em>'.
	 * @see musiccollection.MusicCollection
	 * @generated
	 */
	EClass getMusicCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.MusicCollection#getCategorizedelements <em>Categorizedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorizedelements</em>'.
	 * @see musiccollection.MusicCollection#getCategorizedelements()
	 * @see #getMusicCollection()
	 * @generated
	 */
	EReference getMusicCollection_Categorizedelements();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.MusicCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musiccollection.MusicCollection#getName()
	 * @see #getMusicCollection()
	 * @generated
	 */
	EAttribute getMusicCollection_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.MusicCollection#getPlaylist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playlist</em>'.
	 * @see musiccollection.MusicCollection#getPlaylist()
	 * @see #getMusicCollection()
	 * @generated
	 */
	EReference getMusicCollection_Playlist();

	/**
	 * Returns the meta object for class '{@link musiccollection.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see musiccollection.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.Track#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see musiccollection.Track#getCompositions()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Compositions();

	/**
	 * Returns the meta object for class '{@link musiccollection.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see musiccollection.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see musiccollection.Album#getTracks()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Tracks();

	/**
	 * Returns the meta object for class '{@link musiccollection.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see musiccollection.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.Composition#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see musiccollection.Composition#getTracks()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Tracks();

	/**
	 * Returns the meta object for class '{@link musiccollection.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see musiccollection.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musiccollection.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for class '{@link musiccollection.CategorizedElement <em>Categorized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorized Element</em>'.
	 * @see musiccollection.CategorizedElement
	 * @generated
	 */
	EClass getCategorizedElement();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.CategorizedElement#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artists</em>'.
	 * @see musiccollection.CategorizedElement#getArtists()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EReference getCategorizedElement_Artists();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.CategorizedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musiccollection.CategorizedElement#getName()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EAttribute getCategorizedElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.CategorizedElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see musiccollection.CategorizedElement#getCategory()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EReference getCategorizedElement_Category();

	/**
	 * Returns the meta object for class '{@link musiccollection.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see musiccollection.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.Category#getCategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Type</em>'.
	 * @see musiccollection.Category#getCategoryType()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryType();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.Category#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see musiccollection.Category#getValue()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Value();

	/**
	 * Returns the meta object for class '{@link musiccollection.CollectionRoot <em>Collection Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Root</em>'.
	 * @see musiccollection.CollectionRoot
	 * @generated
	 */
	EClass getCollectionRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.CollectionRoot#getMusiccollection <em>Musiccollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Musiccollection</em>'.
	 * @see musiccollection.CollectionRoot#getMusiccollection()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Musiccollection();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.CollectionRoot#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artist</em>'.
	 * @see musiccollection.CollectionRoot#getArtist()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Artist();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.CollectionRoot#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see musiccollection.CollectionRoot#getCategories()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.CollectionRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see musiccollection.CollectionRoot#getConfiguration()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Configuration();

	/**
	 * Returns the meta object for the reference '{@link musiccollection.CollectionRoot#getDefaultConfig <em>Default Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Config</em>'.
	 * @see musiccollection.CollectionRoot#getDefaultConfig()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_DefaultConfig();

	/**
	 * Returns the meta object for class '{@link musiccollection.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see musiccollection.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link musiccollection.Playlist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see musiccollection.Playlist#getName()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link musiccollection.Playlist#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see musiccollection.Playlist#getQuery()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Query();

	/**
	 * Returns the meta object for the reference list '{@link musiccollection.Playlist#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Track</em>'.
	 * @see musiccollection.Playlist#getTrack()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Track();

	/**
	 * Returns the meta object for the reference '{@link musiccollection.Playlist#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see musiccollection.Playlist#getConfiguration()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Configuration();

	/**
	 * Returns the meta object for enum '{@link musiccollection.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category Type</em>'.
	 * @see musiccollection.CategoryType
	 * @generated
	 */
	EEnum getCategoryType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusiccollectionFactory getMusiccollectionFactory();

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
		 * The meta object literal for the '{@link musiccollection.impl.MusicCollectionImpl <em>Music Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.MusicCollectionImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getMusicCollection()
		 * @generated
		 */
		EClass MUSIC_COLLECTION = eINSTANCE.getMusicCollection();

		/**
		 * The meta object literal for the '<em><b>Categorizedelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC_COLLECTION__CATEGORIZEDELEMENTS = eINSTANCE.getMusicCollection_Categorizedelements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MUSIC_COLLECTION__NAME = eINSTANCE.getMusicCollection_Name();

		/**
		 * The meta object literal for the '<em><b>Playlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MUSIC_COLLECTION__PLAYLIST = eINSTANCE.getMusicCollection_Playlist();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.TrackImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Compositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__COMPOSITIONS = eINSTANCE.getTrack_Compositions();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.AlbumImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__TRACKS = eINSTANCE.getAlbum_Tracks();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.CompositionImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__TRACKS = eINSTANCE.getComposition_Tracks();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.ArtistImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__NAME = eINSTANCE.getArtist_Name();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.CategorizedElementImpl <em>Categorized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.CategorizedElementImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategorizedElement()
		 * @generated
		 */
		EClass CATEGORIZED_ELEMENT = eINSTANCE.getCategorizedElement();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZED_ELEMENT__ARTISTS = eINSTANCE.getCategorizedElement_Artists();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORIZED_ELEMENT__NAME = eINSTANCE.getCategorizedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORIZED_ELEMENT__CATEGORY = eINSTANCE.getCategorizedElement_Category();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.CategoryImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_TYPE = eINSTANCE.getCategory_CategoryType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__VALUE = eINSTANCE.getCategory_Value();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.CollectionRootImpl <em>Collection Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.CollectionRootImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getCollectionRoot()
		 * @generated
		 */
		EClass COLLECTION_ROOT = eINSTANCE.getCollectionRoot();

		/**
		 * The meta object literal for the '<em><b>Musiccollection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__MUSICCOLLECTION = eINSTANCE.getCollectionRoot_Musiccollection();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__ARTIST = eINSTANCE.getCollectionRoot_Artist();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__CATEGORIES = eINSTANCE.getCollectionRoot_Categories();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__CONFIGURATION = eINSTANCE.getCollectionRoot_Configuration();

		/**
		 * The meta object literal for the '<em><b>Default Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__DEFAULT_CONFIG = eINSTANCE.getCollectionRoot_DefaultConfig();

		/**
		 * The meta object literal for the '{@link musiccollection.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.impl.PlaylistImpl
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__NAME = eINSTANCE.getPlaylist_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__QUERY = eINSTANCE.getPlaylist_Query();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__TRACK = eINSTANCE.getPlaylist_Track();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__CONFIGURATION = eINSTANCE.getPlaylist_Configuration();

		/**
		 * The meta object literal for the '{@link musiccollection.CategoryType <em>Category Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see musiccollection.CategoryType
		 * @see musiccollection.impl.MusiccollectionPackageImpl#getCategoryType()
		 * @generated
		 */
		EEnum CATEGORY_TYPE = eINSTANCE.getCategoryType();

	}

} //MusiccollectionPackage
