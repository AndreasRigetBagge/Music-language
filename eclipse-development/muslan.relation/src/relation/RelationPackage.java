/**
 */
package relation;

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
 * @see relation.RelationFactory
 * @model kind="package"
 * @generated
 */
public interface RelationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "relation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/relation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "relation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationPackage eINSTANCE = relation.impl.RelationPackageImpl.init();

	/**
	 * The meta object id for the '{@link relation.impl.ICollectionImpl <em>ICollection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.ICollectionImpl
	 * @see relation.impl.RelationPackageImpl#getICollection()
	 * @generated
	 */
	int ICOLLECTION = 6;

	/**
	 * The number of structural features of the '<em>ICollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOLLECTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ICollection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relation.impl.DerivedCollectionImpl <em>Derived Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.DerivedCollectionImpl
	 * @see relation.impl.RelationPackageImpl#getDerivedCollection()
	 * @generated
	 */
	int DERIVED_COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLLECTION__NAME = ICOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLLECTION_FEATURE_COUNT = ICOLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Derived Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_COLLECTION_OPERATION_COUNT = ICOLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link relation.impl.MainCollectionImpl <em>Main Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.MainCollectionImpl
	 * @see relation.impl.RelationPackageImpl#getMainCollection()
	 * @generated
	 */
	int MAIN_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COLLECTION__NAME = DERIVED_COLLECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COLLECTION__SOURCES = DERIVED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COLLECTION_FEATURE_COUNT = DERIVED_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Main Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_COLLECTION_OPERATION_COUNT = DERIVED_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link relation.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.SourceImpl
	 * @see relation.impl.RelationPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relation.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.LocationImpl
	 * @see relation.impl.RelationPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TRACK = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relation.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.LinkImpl
	 * @see relation.impl.RelationPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__OUTGOING = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__INCOMING = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link relation.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.CollectionReferenceImpl
	 * @see relation.impl.RelationPackageImpl#getCollectionReference()
	 * @generated
	 */
	int COLLECTION_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE__POINTS_TO = ICOLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE_FEATURE_COUNT = ICOLLECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_REFERENCE_OPERATION_COUNT = ICOLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link relation.impl.RelationRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see relation.impl.RelationRootImpl
	 * @see relation.impl.RelationPackageImpl#getRelationRoot()
	 * @generated
	 */
	int RELATION_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ROOT__LINKS = 0;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ROOT__PROVIDERS = 1;

	/**
	 * The feature id for the '<em><b>Maincollection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ROOT__MAINCOLLECTION = 2;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link relation.MainCollection <em>Main Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Collection</em>'.
	 * @see relation.MainCollection
	 * @generated
	 */
	EClass getMainCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link relation.MainCollection#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see relation.MainCollection#getSources()
	 * @see #getMainCollection()
	 * @generated
	 */
	EReference getMainCollection_Sources();

	/**
	 * Returns the meta object for class '{@link relation.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see relation.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference list '{@link relation.Source#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see relation.Source#getLocations()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Locations();

	/**
	 * Returns the meta object for the attribute '{@link relation.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relation.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for class '{@link relation.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see relation.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link relation.Location#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see relation.Location#getLocation()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Location();

	/**
	 * Returns the meta object for the reference '{@link relation.Location#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track</em>'.
	 * @see relation.Location#getTrack()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Track();

	/**
	 * Returns the meta object for class '{@link relation.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see relation.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link relation.Link#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outgoing</em>'.
	 * @see relation.Link#getOutgoing()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Outgoing();

	/**
	 * Returns the meta object for the reference '{@link relation.Link#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Incoming</em>'.
	 * @see relation.Link#getIncoming()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Incoming();

	/**
	 * Returns the meta object for class '{@link relation.DerivedCollection <em>Derived Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Collection</em>'.
	 * @see relation.DerivedCollection
	 * @generated
	 */
	EClass getDerivedCollection();

	/**
	 * Returns the meta object for the attribute '{@link relation.DerivedCollection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see relation.DerivedCollection#getName()
	 * @see #getDerivedCollection()
	 * @generated
	 */
	EAttribute getDerivedCollection_Name();

	/**
	 * Returns the meta object for class '{@link relation.CollectionReference <em>Collection Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Reference</em>'.
	 * @see relation.CollectionReference
	 * @generated
	 */
	EClass getCollectionReference();

	/**
	 * Returns the meta object for the reference '{@link relation.CollectionReference#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see relation.CollectionReference#getPointsTo()
	 * @see #getCollectionReference()
	 * @generated
	 */
	EReference getCollectionReference_PointsTo();

	/**
	 * Returns the meta object for class '{@link relation.ICollection <em>ICollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICollection</em>'.
	 * @see relation.ICollection
	 * @generated
	 */
	EClass getICollection();

	/**
	 * Returns the meta object for class '{@link relation.RelationRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see relation.RelationRoot
	 * @generated
	 */
	EClass getRelationRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link relation.RelationRoot#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see relation.RelationRoot#getLinks()
	 * @see #getRelationRoot()
	 * @generated
	 */
	EReference getRelationRoot_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link relation.RelationRoot#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Providers</em>'.
	 * @see relation.RelationRoot#getProviders()
	 * @see #getRelationRoot()
	 * @generated
	 */
	EReference getRelationRoot_Providers();

	/**
	 * Returns the meta object for the reference '{@link relation.RelationRoot#getMaincollection <em>Maincollection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maincollection</em>'.
	 * @see relation.RelationRoot#getMaincollection()
	 * @see #getRelationRoot()
	 * @generated
	 */
	EReference getRelationRoot_Maincollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationFactory getRelationFactory();

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
		 * The meta object literal for the '{@link relation.impl.MainCollectionImpl <em>Main Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.MainCollectionImpl
		 * @see relation.impl.RelationPackageImpl#getMainCollection()
		 * @generated
		 */
		EClass MAIN_COLLECTION = eINSTANCE.getMainCollection();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_COLLECTION__SOURCES = eINSTANCE.getMainCollection_Sources();

		/**
		 * The meta object literal for the '{@link relation.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.SourceImpl
		 * @see relation.impl.RelationPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__LOCATIONS = eINSTANCE.getSource_Locations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '{@link relation.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.LocationImpl
		 * @see relation.impl.RelationPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LOCATION = eINSTANCE.getLocation_Location();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__TRACK = eINSTANCE.getLocation_Track();

		/**
		 * The meta object literal for the '{@link relation.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.LinkImpl
		 * @see relation.impl.RelationPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__OUTGOING = eINSTANCE.getLink_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__INCOMING = eINSTANCE.getLink_Incoming();

		/**
		 * The meta object literal for the '{@link relation.impl.DerivedCollectionImpl <em>Derived Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.DerivedCollectionImpl
		 * @see relation.impl.RelationPackageImpl#getDerivedCollection()
		 * @generated
		 */
		EClass DERIVED_COLLECTION = eINSTANCE.getDerivedCollection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_COLLECTION__NAME = eINSTANCE.getDerivedCollection_Name();

		/**
		 * The meta object literal for the '{@link relation.impl.CollectionReferenceImpl <em>Collection Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.CollectionReferenceImpl
		 * @see relation.impl.RelationPackageImpl#getCollectionReference()
		 * @generated
		 */
		EClass COLLECTION_REFERENCE = eINSTANCE.getCollectionReference();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_REFERENCE__POINTS_TO = eINSTANCE.getCollectionReference_PointsTo();

		/**
		 * The meta object literal for the '{@link relation.impl.ICollectionImpl <em>ICollection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.ICollectionImpl
		 * @see relation.impl.RelationPackageImpl#getICollection()
		 * @generated
		 */
		EClass ICOLLECTION = eINSTANCE.getICollection();

		/**
		 * The meta object literal for the '{@link relation.impl.RelationRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see relation.impl.RelationRootImpl
		 * @see relation.impl.RelationPackageImpl#getRelationRoot()
		 * @generated
		 */
		EClass RELATION_ROOT = eINSTANCE.getRelationRoot();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ROOT__LINKS = eINSTANCE.getRelationRoot_Links();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ROOT__PROVIDERS = eINSTANCE.getRelationRoot_Providers();

		/**
		 * The meta object literal for the '<em><b>Maincollection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ROOT__MAINCOLLECTION = eINSTANCE.getRelationRoot_Maincollection();

	}

} //RelationPackage
