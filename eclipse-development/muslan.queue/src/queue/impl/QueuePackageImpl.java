/**
 */
package queue.impl;

import musiccollection.MusiccollectionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pbconfig.PbconfigPackage;

import query.QueryPackage;

import queue.Queue;
import queue.QueueFactory;
import queue.QueuePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueuePackageImpl extends EPackageImpl implements QueuePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueEClass = null;

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
	 * @see queue.QueuePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueuePackageImpl() {
		super(eNS_URI, QueueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QueuePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueuePackage init() {
		if (isInited) return (QueuePackage)EPackage.Registry.INSTANCE.getEPackage(QueuePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQueuePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QueuePackageImpl theQueuePackage = registeredQueuePackage instanceof QueuePackageImpl ? (QueuePackageImpl)registeredQueuePackage : new QueuePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MusiccollectionPackage.eINSTANCE.eClass();
		PbconfigPackage.eINSTANCE.eClass();
		QueryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQueuePackage.createPackageContents();

		// Initialize created meta-data
		theQueuePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueuePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueuePackage.eNS_URI, theQueuePackage);
		return theQueuePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueue() {
		return queueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueue_Tracks() {
		return (EReference)queueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueueFactory getQueueFactory() {
		return (QueueFactory)getEFactoryInstance();
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
		queueEClass = createEClass(QUEUE);
		createEReference(queueEClass, QUEUE__TRACKS);
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
		MusiccollectionPackage theMusiccollectionPackage = (MusiccollectionPackage)EPackage.Registry.INSTANCE.getEPackage(MusiccollectionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(queueEClass, Queue.class, "Queue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueue_Tracks(), theMusiccollectionPackage.getTrack(), null, "tracks", null, 0, -1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QueuePackageImpl
