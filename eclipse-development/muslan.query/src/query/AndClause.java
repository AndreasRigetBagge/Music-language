/**
 */
package query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.AndClause#getFilterclause <em>Filterclause</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getAndClause()
 * @model
 * @generated
 */
public interface AndClause extends FilterClause {
	/**
	 * Returns the value of the '<em><b>Filterclause</b></em>' containment reference list.
	 * The list contents are of type {@link query.FilterClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filterclause</em>' containment reference list.
	 * @see query.QueryPackage#getAndClause_Filterclause()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<FilterClause> getFilterclause();

} // AndClause
