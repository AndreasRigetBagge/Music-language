/**
 */
package collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categorized Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collection.CategorizedElement#getArtists <em>Artists</em>}</li>
 *   <li>{@link collection.CategorizedElement#getCategories <em>Categories</em>}</li>
 *   <li>{@link collection.CategorizedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getCategorizedElement()
 * @model abstract="true"
 * @generated
 */
public interface CategorizedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Artists</b></em>' reference list.
	 * The list contents are of type {@link collection.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' reference list.
	 * @see collection.CollectionPackage#getCategorizedElement_Artists()
	 * @model
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see collection.CollectionPackage#getCategorizedElement_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see collection.CollectionPackage#getCategorizedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link collection.CategorizedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CategorizedElement
