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
 *   <li>{@link collection.Collection#getCategorizedelements <em>Categorizedelements</em>}</li>
 *   <li>{@link collection.Collection#getName <em>Name</em>}</li>
 *   <li>{@link collection.Collection#getArtist <em>Artist</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getCollection()
 * @model
 * @generated
 */
public interface Collection extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorizedelements</b></em>' containment reference list.
	 * The list contents are of type {@link collection.CategorizedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizedelements</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollection_Categorizedelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategorizedElement> getCategorizedelements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see collection.CollectionPackage#getCollection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collection.Collection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollection_Artist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artist> getArtist();

} // Collection
