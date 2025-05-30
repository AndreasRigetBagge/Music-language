/**
 */
package musiccollection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.Category#getCategoryType <em>Category Type</em>}</li>
 *   <li>{@link musiccollection.Category#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Category Type</b></em>' attribute.
	 * The default value is <code>"Genre"</code>.
	 * The literals are from the enumeration {@link musiccollection.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Type</em>' attribute.
	 * @see musiccollection.CategoryType
	 * @see #setCategoryType(CategoryType)
	 * @see musiccollection.MusiccollectionPackage#getCategory_CategoryType()
	 * @model default="Genre" required="true"
	 * @generated
	 */
	CategoryType getCategoryType();

	/**
	 * Sets the value of the '{@link musiccollection.Category#getCategoryType <em>Category Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Type</em>' attribute.
	 * @see musiccollection.CategoryType
	 * @see #getCategoryType()
	 * @generated
	 */
	void setCategoryType(CategoryType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see musiccollection.MusiccollectionPackage#getCategory_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link musiccollection.Category#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Category
