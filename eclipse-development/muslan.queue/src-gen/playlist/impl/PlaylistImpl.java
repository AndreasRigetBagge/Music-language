/**
 */
package playlist.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import playlist.Collection;
import playlist.ConfigurationReference;
import playlist.PlayItem;
import playlist.Playlist;
import playlist.PlaylistPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link playlist.impl.PlaylistImpl#getPlayitem <em>Playitem</em>}</li>
 *   <li>{@link playlist.impl.PlaylistImpl#getConfigurationreference <em>Configurationreference</em>}</li>
 *   <li>{@link playlist.impl.PlaylistImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PlaylistImpl extends MinimalEObjectImpl.Container implements Playlist {
	/**
	 * The cached value of the '{@link #getPlayitem() <em>Playitem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayitem()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayItem> playitem;

	/**
	 * The cached value of the '{@link #getConfigurationreference() <em>Configurationreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationreference()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationReference configurationreference;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected Collection collection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaylistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaylistPackage.Literals.PLAYLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlayItem> getPlayitem() {
		if (playitem == null) {
			playitem = new EObjectContainmentEList<PlayItem>(PlayItem.class, this, PlaylistPackage.PLAYLIST__PLAYITEM);
		}
		return playitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationReference getConfigurationreference() {
		return configurationreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationreference(ConfigurationReference newConfigurationreference,
			NotificationChain msgs) {
		ConfigurationReference oldConfigurationreference = configurationreference;
		configurationreference = newConfigurationreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE, oldConfigurationreference,
					newConfigurationreference);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationreference(ConfigurationReference newConfigurationreference) {
		if (newConfigurationreference != configurationreference) {
			NotificationChain msgs = null;
			if (configurationreference != null)
				msgs = ((InternalEObject) configurationreference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE, null, msgs);
			if (newConfigurationreference != null)
				msgs = ((InternalEObject) newConfigurationreference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE, null, msgs);
			msgs = basicSetConfigurationreference(newConfigurationreference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE,
					newConfigurationreference, newConfigurationreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject) collection;
			collection = (Collection) eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlaylistPackage.PLAYLIST__COLLECTION,
							oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollection(Collection newCollection) {
		Collection oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.PLAYLIST__COLLECTION, oldCollection,
					collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PlaylistPackage.PLAYLIST__PLAYITEM:
			return ((InternalEList<?>) getPlayitem()).basicRemove(otherEnd, msgs);
		case PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE:
			return basicSetConfigurationreference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PlaylistPackage.PLAYLIST__PLAYITEM:
			return getPlayitem();
		case PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE:
			return getConfigurationreference();
		case PlaylistPackage.PLAYLIST__COLLECTION:
			if (resolve)
				return getCollection();
			return basicGetCollection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PlaylistPackage.PLAYLIST__PLAYITEM:
			getPlayitem().clear();
			getPlayitem().addAll((java.util.Collection<? extends PlayItem>) newValue);
			return;
		case PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE:
			setConfigurationreference((ConfigurationReference) newValue);
			return;
		case PlaylistPackage.PLAYLIST__COLLECTION:
			setCollection((Collection) newValue);
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
		case PlaylistPackage.PLAYLIST__PLAYITEM:
			getPlayitem().clear();
			return;
		case PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE:
			setConfigurationreference((ConfigurationReference) null);
			return;
		case PlaylistPackage.PLAYLIST__COLLECTION:
			setCollection((Collection) null);
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
		case PlaylistPackage.PLAYLIST__PLAYITEM:
			return playitem != null && !playitem.isEmpty();
		case PlaylistPackage.PLAYLIST__CONFIGURATIONREFERENCE:
			return configurationreference != null;
		case PlaylistPackage.PLAYLIST__COLLECTION:
			return collection != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaylistImpl
