/**
 */
package query;

import musiccollection.CategoryType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.CategoryClause#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getCategoryClause()
 * @model
 * @generated
 */
public interface CategoryClause extends Clause {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link musiccollection.CategoryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see musiccollection.CategoryType
	 * @see #setCategory(CategoryType)
	 * @see query.QueryPackage#getCategoryClause_Category()
	 * @model required="true"
	 * @generated
	 */
	CategoryType getCategory();

	/**
	 * Sets the value of the '{@link query.CategoryClause#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see musiccollection.CategoryType
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CategoryType value);

} // CategoryClause
