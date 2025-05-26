/**
 */
package relation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import relation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationFactoryImpl extends EFactoryImpl implements RelationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationFactory init() {
		try {
			RelationFactory theRelationFactory = (RelationFactory)EPackage.Registry.INSTANCE.getEFactory(RelationPackage.eNS_URI);
			if (theRelationFactory != null) {
				return theRelationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RelationPackage.MAIN_COLLECTION: return createMainCollection();
			case RelationPackage.SOURCE: return createSource();
			case RelationPackage.LOCATION: return createLocation();
			case RelationPackage.LINK: return createLink();
			case RelationPackage.DERIVED_COLLECTION: return createDerivedCollection();
			case RelationPackage.COLLECTION_REFERENCE: return createCollectionReference();
			case RelationPackage.RELATION_ROOT: return createRelationRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainCollection createMainCollection() {
		MainCollectionImpl mainCollection = new MainCollectionImpl();
		return mainCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCollection createDerivedCollection() {
		DerivedCollectionImpl derivedCollection = new DerivedCollectionImpl();
		return derivedCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionReference createCollectionReference() {
		CollectionReferenceImpl collectionReference = new CollectionReferenceImpl();
		return collectionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationRoot createRelationRoot() {
		RelationRootImpl relationRoot = new RelationRootImpl();
		return relationRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationPackage getRelationPackage() {
		return (RelationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationPackage getPackage() {
		return RelationPackage.eINSTANCE;
	}

} //RelationFactoryImpl
