/**
 */
package playlist.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import playlist.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaylistFactoryImpl extends EFactoryImpl implements PlaylistFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaylistFactory init() {
		try {
			PlaylistFactory thePlaylistFactory = (PlaylistFactory) EPackage.Registry.INSTANCE
					.getEFactory(PlaylistPackage.eNS_URI);
			if (thePlaylistFactory != null) {
				return thePlaylistFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlaylistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaylistFactoryImpl() {
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
		case PlaylistPackage.QUERY:
			return createQuery();
		case PlaylistPackage.PLAY_ITEM:
			return createPlayItem();
		case PlaylistPackage.CONFIGURATION_REFERENCE:
			return createConfigurationReference();
		case PlaylistPackage.COLLECTION:
			return createCollection();
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
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayItem createPlayItem() {
		PlayItemImpl playItem = new PlayItemImpl();
		return playItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationReference createConfigurationReference() {
		ConfigurationReferenceImpl configurationReference = new ConfigurationReferenceImpl();
		return configurationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaylistPackage getPlaylistPackage() {
		return (PlaylistPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlaylistPackage getPackage() {
		return PlaylistPackage.eINSTANCE;
	}

} //PlaylistFactoryImpl
