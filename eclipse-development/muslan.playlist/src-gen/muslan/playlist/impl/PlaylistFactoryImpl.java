/**
 */
package muslan.playlist.impl;

import muslan.playlist.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
		case PlaylistPackage.TRACK_REFERENCE:
			return createTrackReference();
		case PlaylistPackage.QUERY:
			return createQuery();
		case PlaylistPackage.TRACK_LIST:
			return createTrackList();
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
	public TrackReference createTrackReference() {
		TrackReferenceImpl trackReference = new TrackReferenceImpl();
		return trackReference;
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
	public TrackList createTrackList() {
		TrackListImpl trackList = new TrackListImpl();
		return trackList;
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
