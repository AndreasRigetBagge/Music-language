/**
 */
package query;

import musiccollection.MusicCollection;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Query#getCollection <em>Collection</em>}</li>
 *   <li>{@link query.Query#getFilter <em>Filter</em>}</li>
 *   <li>{@link query.Query#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(MusicCollection)
	 * @see query.QueryPackage#getQuery_Collection()
	 * @model required="true"
	 * @generated
	 */
	MusicCollection getCollection();

	/**
	 * Sets the value of the '{@link query.Query#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(MusicCollection value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterClause)
	 * @see query.QueryPackage#getQuery_Filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FilterClause getFilter();

	/**
	 * Sets the value of the '{@link query.Query#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterClause value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link query.CategorizedElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see query.CategorizedElementType
	 * @see #setType(CategorizedElementType)
	 * @see query.QueryPackage#getQuery_Type()
	 * @model required="true"
	 * @generated
	 */
	CategorizedElementType getType();

	/**
	 * Sets the value of the '{@link query.Query#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see query.CategorizedElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(CategorizedElementType value);

} // Query
