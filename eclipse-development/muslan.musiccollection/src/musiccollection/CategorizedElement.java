/**
 */
package musiccollection;

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
 *   <li>{@link musiccollection.CategorizedElement#getArtists <em>Artists</em>}</li>
 *   <li>{@link musiccollection.CategorizedElement#getName <em>Name</em>}</li>
 *   <li>{@link musiccollection.CategorizedElement#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getCategorizedElement()
 * @model abstract="true"
 * @generated
 */
public interface CategorizedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Artists</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getCategorizedElement_Artists()
	 * @model
	 * @generated
	 */
	EList<Artist> getArtists();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musiccollection.MusiccollectionPackage#getCategorizedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musiccollection.CategorizedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getCategorizedElement_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

} // CategorizedElement
