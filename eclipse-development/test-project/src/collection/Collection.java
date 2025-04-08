/**
 */
package collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collection.Collection#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollection_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItem();

} // Collection
