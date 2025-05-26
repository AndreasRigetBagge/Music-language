/**
 */
package musiccollection.impl;

import java.util.Collection;

import musiccollection.CategorizedElement;
import musiccollection.MusicCollection;
import musiccollection.MusiccollectionPackage;
import musiccollection.Playlist;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Music Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.impl.MusicCollectionImpl#getCategorizedelements <em>Categorizedelements</em>}</li>
 *   <li>{@link musiccollection.impl.MusicCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link musiccollection.impl.MusicCollectionImpl#getPlaylist <em>Playlist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MusicCollectionImpl extends MinimalEObjectImpl.Container implements MusicCollection {
	/**
	 * The cached value of the '{@link #getCategorizedelements() <em>Categorizedelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorizedelements()
	 * @generated
	 * @ordered
	 */
	protected EList<CategorizedElement> categorizedelements;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlaylist() <em>Playlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaylist()
	 * @generated
	 * @ordered
	 */
	protected EList<Playlist> playlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MusicCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusiccollectionPackage.Literals.MUSIC_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategorizedElement> getCategorizedelements() {
		if (categorizedelements == null) {
			categorizedelements = new EObjectContainmentEList<CategorizedElement>(CategorizedElement.class, this, MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS);
		}
		return categorizedelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusiccollectionPackage.MUSIC_COLLECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Playlist> getPlaylist() {
		if (playlist == null) {
			playlist = new EObjectContainmentEList<Playlist>(Playlist.class, this, MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST);
		}
		return playlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS:
				return ((InternalEList<?>)getCategorizedelements()).basicRemove(otherEnd, msgs);
			case MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST:
				return ((InternalEList<?>)getPlaylist()).basicRemove(otherEnd, msgs);
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
			case MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS:
				return getCategorizedelements();
			case MusiccollectionPackage.MUSIC_COLLECTION__NAME:
				return getName();
			case MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST:
				return getPlaylist();
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
			case MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS:
				getCategorizedelements().clear();
				getCategorizedelements().addAll((Collection<? extends CategorizedElement>)newValue);
				return;
			case MusiccollectionPackage.MUSIC_COLLECTION__NAME:
				setName((String)newValue);
				return;
			case MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST:
				getPlaylist().clear();
				getPlaylist().addAll((Collection<? extends Playlist>)newValue);
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
			case MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS:
				getCategorizedelements().clear();
				return;
			case MusiccollectionPackage.MUSIC_COLLECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST:
				getPlaylist().clear();
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
			case MusiccollectionPackage.MUSIC_COLLECTION__CATEGORIZEDELEMENTS:
				return categorizedelements != null && !categorizedelements.isEmpty();
			case MusiccollectionPackage.MUSIC_COLLECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MusiccollectionPackage.MUSIC_COLLECTION__PLAYLIST:
				return playlist != null && !playlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MusicCollectionImpl
