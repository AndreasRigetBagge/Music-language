/**
 */
package muslan.playlist.impl;

import collection.Track;

import muslan.playlist.PlaylistPackage;
import muslan.playlist.TrackReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link muslan.playlist.impl.TrackReferenceImpl#getTrack <em>Track</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackReferenceImpl extends MinimalEObjectImpl.Container implements TrackReference {
	/**
	 * The cached value of the '{@link #getTrack() <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrack()
	 * @generated
	 * @ordered
	 */
	protected Track track;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaylistPackage.Literals.TRACK_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Track getTrack() {
		if (track != null && track.eIsProxy()) {
			InternalEObject oldTrack = (InternalEObject) track;
			track = (Track) eResolveProxy(oldTrack);
			if (track != oldTrack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaylistPackage.TRACK_REFERENCE__TRACK,
							oldTrack, track));
			}
		}
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track basicGetTrack() {
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrack(Track newTrack) {
		Track oldTrack = track;
		track = newTrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.TRACK_REFERENCE__TRACK, oldTrack,
					track));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlaylistPackage.TRACK_REFERENCE__TRACK:
			if (resolve)
				return getTrack();
			return basicGetTrack();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PlaylistPackage.TRACK_REFERENCE__TRACK:
			setTrack((Track) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PlaylistPackage.TRACK_REFERENCE__TRACK:
			setTrack((Track) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PlaylistPackage.TRACK_REFERENCE__TRACK:
			return track != null;
		}
		return super.eIsSet(featureID);
	}

} //TrackReferenceImpl
