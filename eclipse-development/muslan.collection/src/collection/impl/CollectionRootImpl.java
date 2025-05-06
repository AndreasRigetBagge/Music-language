/**
 */
package collection.impl;

import collection.Artist;
import collection.Category;
import collection.Collection;
import collection.CollectionPackage;
import collection.CollectionRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pbconfig.Configuration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link collection.impl.CollectionRootImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link collection.impl.CollectionRootImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link collection.impl.CollectionRootImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link collection.impl.CollectionRootImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link collection.impl.CollectionRootImpl#getDefaultConfig <em>Default Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionRootImpl extends MinimalEObjectImpl.Container implements CollectionRoot {
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> collection;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected EList<Artist> artist;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configuration;

	/**
	 * The cached value of the '{@link #getDefaultConfig() <em>Default Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfig()
	 * @generated
	 * @ordered
	 */
	protected Configuration defaultConfig;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.COLLECTION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Collection> getCollection() {
		if (collection == null) {
			collection = new EObjectContainmentEList<Collection>(Collection.class, this, CollectionPackage.COLLECTION_ROOT__COLLECTION);
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artist> getArtist() {
		if (artist == null) {
			artist = new EObjectContainmentEList<Artist>(Artist.class, this, CollectionPackage.COLLECTION_ROOT__ARTIST);
		}
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList<Category>(Category.class, this, CollectionPackage.COLLECTION_ROOT__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<Configuration>(Configuration.class, this, CollectionPackage.COLLECTION_ROOT__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getDefaultConfig() {
		if (defaultConfig != null && defaultConfig.eIsProxy()) {
			InternalEObject oldDefaultConfig = (InternalEObject)defaultConfig;
			defaultConfig = (Configuration)eResolveProxy(oldDefaultConfig);
			if (defaultConfig != oldDefaultConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG, oldDefaultConfig, defaultConfig));
			}
		}
		return defaultConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetDefaultConfig() {
		return defaultConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultConfig(Configuration newDefaultConfig) {
		Configuration oldDefaultConfig = defaultConfig;
		defaultConfig = newDefaultConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG, oldDefaultConfig, defaultConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollectionPackage.COLLECTION_ROOT__COLLECTION:
				return ((InternalEList<?>)getCollection()).basicRemove(otherEnd, msgs);
			case CollectionPackage.COLLECTION_ROOT__ARTIST:
				return ((InternalEList<?>)getArtist()).basicRemove(otherEnd, msgs);
			case CollectionPackage.COLLECTION_ROOT__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case CollectionPackage.COLLECTION_ROOT__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case CollectionPackage.COLLECTION_ROOT__COLLECTION:
				return getCollection();
			case CollectionPackage.COLLECTION_ROOT__ARTIST:
				return getArtist();
			case CollectionPackage.COLLECTION_ROOT__CATEGORIES:
				return getCategories();
			case CollectionPackage.COLLECTION_ROOT__CONFIGURATION:
				return getConfiguration();
			case CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG:
				if (resolve) return getDefaultConfig();
				return basicGetDefaultConfig();
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
			case CollectionPackage.COLLECTION_ROOT__COLLECTION:
				getCollection().clear();
				getCollection().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case CollectionPackage.COLLECTION_ROOT__ARTIST:
				getArtist().clear();
				getArtist().addAll((java.util.Collection<? extends Artist>)newValue);
				return;
			case CollectionPackage.COLLECTION_ROOT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((java.util.Collection<? extends Category>)newValue);
				return;
			case CollectionPackage.COLLECTION_ROOT__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((java.util.Collection<? extends Configuration>)newValue);
				return;
			case CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG:
				setDefaultConfig((Configuration)newValue);
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
			case CollectionPackage.COLLECTION_ROOT__COLLECTION:
				getCollection().clear();
				return;
			case CollectionPackage.COLLECTION_ROOT__ARTIST:
				getArtist().clear();
				return;
			case CollectionPackage.COLLECTION_ROOT__CATEGORIES:
				getCategories().clear();
				return;
			case CollectionPackage.COLLECTION_ROOT__CONFIGURATION:
				getConfiguration().clear();
				return;
			case CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG:
				setDefaultConfig((Configuration)null);
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
			case CollectionPackage.COLLECTION_ROOT__COLLECTION:
				return collection != null && !collection.isEmpty();
			case CollectionPackage.COLLECTION_ROOT__ARTIST:
				return artist != null && !artist.isEmpty();
			case CollectionPackage.COLLECTION_ROOT__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case CollectionPackage.COLLECTION_ROOT__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
			case CollectionPackage.COLLECTION_ROOT__DEFAULT_CONFIG:
				return defaultConfig != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionRootImpl
