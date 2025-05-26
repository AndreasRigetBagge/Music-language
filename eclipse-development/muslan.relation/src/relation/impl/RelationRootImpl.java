/**
 */
package relation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import relation.ICollection;
import relation.Link;
import relation.MainCollection;
import relation.RelationPackage;
import relation.RelationRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link relation.impl.RelationRootImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link relation.impl.RelationRootImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link relation.impl.RelationRootImpl#getMaincollection <em>Maincollection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationRootImpl extends MinimalEObjectImpl.Container implements RelationRoot {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<ICollection> providers;

	/**
	 * The cached value of the '{@link #getMaincollection() <em>Maincollection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaincollection()
	 * @generated
	 * @ordered
	 */
	protected MainCollection maincollection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationPackage.Literals.RELATION_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, RelationPackage.RELATION_ROOT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ICollection> getProviders() {
		if (providers == null) {
			providers = new EObjectContainmentEList<ICollection>(ICollection.class, this, RelationPackage.RELATION_ROOT__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainCollection getMaincollection() {
		if (maincollection != null && maincollection.eIsProxy()) {
			InternalEObject oldMaincollection = (InternalEObject)maincollection;
			maincollection = (MainCollection)eResolveProxy(oldMaincollection);
			if (maincollection != oldMaincollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RelationPackage.RELATION_ROOT__MAINCOLLECTION, oldMaincollection, maincollection));
			}
		}
		return maincollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainCollection basicGetMaincollection() {
		return maincollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaincollection(MainCollection newMaincollection) {
		MainCollection oldMaincollection = maincollection;
		maincollection = newMaincollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationPackage.RELATION_ROOT__MAINCOLLECTION, oldMaincollection, maincollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelationPackage.RELATION_ROOT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case RelationPackage.RELATION_ROOT__PROVIDERS:
				return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
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
			case RelationPackage.RELATION_ROOT__LINKS:
				return getLinks();
			case RelationPackage.RELATION_ROOT__PROVIDERS:
				return getProviders();
			case RelationPackage.RELATION_ROOT__MAINCOLLECTION:
				if (resolve) return getMaincollection();
				return basicGetMaincollection();
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
			case RelationPackage.RELATION_ROOT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case RelationPackage.RELATION_ROOT__PROVIDERS:
				getProviders().clear();
				getProviders().addAll((Collection<? extends ICollection>)newValue);
				return;
			case RelationPackage.RELATION_ROOT__MAINCOLLECTION:
				setMaincollection((MainCollection)newValue);
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
			case RelationPackage.RELATION_ROOT__LINKS:
				getLinks().clear();
				return;
			case RelationPackage.RELATION_ROOT__PROVIDERS:
				getProviders().clear();
				return;
			case RelationPackage.RELATION_ROOT__MAINCOLLECTION:
				setMaincollection((MainCollection)null);
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
			case RelationPackage.RELATION_ROOT__LINKS:
				return links != null && !links.isEmpty();
			case RelationPackage.RELATION_ROOT__PROVIDERS:
				return providers != null && !providers.isEmpty();
			case RelationPackage.RELATION_ROOT__MAINCOLLECTION:
				return maincollection != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationRootImpl
