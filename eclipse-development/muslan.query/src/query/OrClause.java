/**
 */
package query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.OrClause#getFilterclause <em>Filterclause</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getOrClause()
 * @model
 * @generated
 */
public interface OrClause extends FilterClause {
	/**
	 * Returns the value of the '<em><b>Filterclause</b></em>' containment reference list.
	 * The list contents are of type {@link query.FilterClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filterclause</em>' containment reference list.
	 * @see query.QueryPackage#getOrClause_Filterclause()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<FilterClause> getFilterclause();

} // OrClause
