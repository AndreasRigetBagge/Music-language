/**
 */
package query;

import collection.Collection;

import playlist.PlayItem;

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
 *   <li>{@link query.Query#getTyppe <em>Typpe</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends PlayItem {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Collection)
	 * @see query.QueryPackage#getQuery_Collection()
	 * @model required="true"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link query.Query#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

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
	 * Returns the value of the '<em><b>Typpe</b></em>' attribute.
	 * The literals are from the enumeration {@link query.PlayItemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typpe</em>' attribute.
	 * @see query.PlayItemType
	 * @see #setTyppe(PlayItemType)
	 * @see query.QueryPackage#getQuery_Typpe()
	 * @model
	 * @generated
	 */
	PlayItemType getTyppe();

	/**
	 * Sets the value of the '{@link query.Query#getTyppe <em>Typpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typpe</em>' attribute.
	 * @see query.PlayItemType
	 * @see #getTyppe()
	 * @generated
	 */
	void setTyppe(PlayItemType value);

} // Query
