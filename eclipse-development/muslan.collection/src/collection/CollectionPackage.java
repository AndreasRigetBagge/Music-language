/**
 */
package collection;

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
 * @see collection.CollectionFactory
 * @model kind="package"
 * @generated
 */
public interface CollectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/collection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectionPackage eINSTANCE = collection.impl.CollectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link collection.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.CollectionImpl
	 * @see collection.impl.CollectionPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Categorizedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CATEGORIZEDELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link collection.impl.CategorizedElementImpl <em>Categorized Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.CategorizedElementImpl
	 * @see collection.impl.CollectionPackageImpl#getCategorizedElement()
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
	 * The meta object id for the '{@link collection.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.TrackImpl
	 * @see collection.impl.CollectionPackageImpl#getTrack()
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
	 * The meta object id for the '{@link collection.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.AlbumImpl
	 * @see collection.impl.CollectionPackageImpl#getAlbum()
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
	 * The meta object id for the '{@link collection.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.CompositionImpl
	 * @see collection.impl.CollectionPackageImpl#getComposition()
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
	 * The meta object id for the '{@link collection.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.ArtistImpl
	 * @see collection.impl.CollectionPackageImpl#getArtist()
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
	 * The meta object id for the '{@link collection.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.CategoryImpl
	 * @see collection.impl.CollectionPackageImpl#getCategory()
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
	 * The meta object id for the '{@link collection.impl.CollectionRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.impl.CollectionRootImpl
	 * @see collection.impl.CollectionPackageImpl#getCollectionRoot()
	 * @generated
	 */
	int COLLECTION_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT__COLLECTION = 0;

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
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link collection.CategoryType <em>Category Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see collection.CategoryType
	 * @see collection.impl.CollectionPackageImpl#getCategoryType()
	 * @generated
	 */
	int CATEGORY_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link collection.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see collection.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link collection.Collection#getCategorizedelements <em>Categorizedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categorizedelements</em>'.
	 * @see collection.Collection#getCategorizedelements()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Categorizedelements();

	/**
	 * Returns the meta object for the attribute '{@link collection.Collection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collection.Collection#getName()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Name();

	/**
	 * Returns the meta object for class '{@link collection.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see collection.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the reference list '{@link collection.Track#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see collection.Track#getCompositions()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Compositions();

	/**
	 * Returns the meta object for class '{@link collection.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see collection.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the reference list '{@link collection.Album#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see collection.Album#getTracks()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Tracks();

	/**
	 * Returns the meta object for class '{@link collection.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see collection.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference list '{@link collection.Composition#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see collection.Composition#getTracks()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_Tracks();

	/**
	 * Returns the meta object for class '{@link collection.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see collection.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link collection.Artist#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collection.Artist#getName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_Name();

	/**
	 * Returns the meta object for class '{@link collection.CategorizedElement <em>Categorized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Categorized Element</em>'.
	 * @see collection.CategorizedElement
	 * @generated
	 */
	EClass getCategorizedElement();

	/**
	 * Returns the meta object for the reference list '{@link collection.CategorizedElement#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artists</em>'.
	 * @see collection.CategorizedElement#getArtists()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EReference getCategorizedElement_Artists();

	/**
	 * Returns the meta object for the attribute '{@link collection.CategorizedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see collection.CategorizedElement#getName()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EAttribute getCategorizedElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link collection.CategorizedElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see collection.CategorizedElement#getCategory()
	 * @see #getCategorizedElement()
	 * @generated
	 */
	EReference getCategorizedElement_Category();

	/**
	 * Returns the meta object for class '{@link collection.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see collection.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link collection.Category#getCategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Type</em>'.
	 * @see collection.Category#getCategoryType()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryType();

	/**
	 * Returns the meta object for the attribute '{@link collection.Category#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see collection.Category#getValue()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Value();

	/**
	 * Returns the meta object for class '{@link collection.CollectionRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see collection.CollectionRoot
	 * @generated
	 */
	EClass getCollectionRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link collection.CollectionRoot#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see collection.CollectionRoot#getCollection()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link collection.CollectionRoot#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artist</em>'.
	 * @see collection.CollectionRoot#getArtist()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Artist();

	/**
	 * Returns the meta object for the containment reference list '{@link collection.CollectionRoot#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see collection.CollectionRoot#getCategories()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link collection.CollectionRoot#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see collection.CollectionRoot#getConfiguration()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_Configuration();

	/**
	 * Returns the meta object for the reference '{@link collection.CollectionRoot#getDefaultConfig <em>Default Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Config</em>'.
	 * @see collection.CollectionRoot#getDefaultConfig()
	 * @see #getCollectionRoot()
	 * @generated
	 */
	EReference getCollectionRoot_DefaultConfig();

	/**
	 * Returns the meta object for enum '{@link collection.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category Type</em>'.
	 * @see collection.CategoryType
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
	CollectionFactory getCollectionFactory();

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
		 * The meta object literal for the '{@link collection.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.CollectionImpl
		 * @see collection.impl.CollectionPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Categorizedelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__CATEGORIZEDELEMENTS = eINSTANCE.getCollection_Categorizedelements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__NAME = eINSTANCE.getCollection_Name();

		/**
		 * The meta object literal for the '{@link collection.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.TrackImpl
		 * @see collection.impl.CollectionPackageImpl#getTrack()
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
		 * The meta object literal for the '{@link collection.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.AlbumImpl
		 * @see collection.impl.CollectionPackageImpl#getAlbum()
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
		 * The meta object literal for the '{@link collection.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.CompositionImpl
		 * @see collection.impl.CollectionPackageImpl#getComposition()
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
		 * The meta object literal for the '{@link collection.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.ArtistImpl
		 * @see collection.impl.CollectionPackageImpl#getArtist()
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
		 * The meta object literal for the '{@link collection.impl.CategorizedElementImpl <em>Categorized Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.CategorizedElementImpl
		 * @see collection.impl.CollectionPackageImpl#getCategorizedElement()
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
		 * The meta object literal for the '{@link collection.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.CategoryImpl
		 * @see collection.impl.CollectionPackageImpl#getCategory()
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
		 * The meta object literal for the '{@link collection.impl.CollectionRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.impl.CollectionRootImpl
		 * @see collection.impl.CollectionPackageImpl#getCollectionRoot()
		 * @generated
		 */
		EClass COLLECTION_ROOT = eINSTANCE.getCollectionRoot();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_ROOT__COLLECTION = eINSTANCE.getCollectionRoot_Collection();

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
		 * The meta object literal for the '{@link collection.CategoryType <em>Category Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see collection.CategoryType
		 * @see collection.impl.CollectionPackageImpl#getCategoryType()
		 * @generated
		 */
		EEnum CATEGORY_TYPE = eINSTANCE.getCategoryType();

	}

} //CollectionPackage
