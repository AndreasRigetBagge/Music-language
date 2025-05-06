/**
 */
package query;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import playlist.PlaylistPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.example.org/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link query.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.QueryImpl
	 * @see query.impl.QueryPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__COLLECTION = PlaylistPackage.PLAY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__FILTER = PlaylistPackage.PLAY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TYPE = PlaylistPackage.PLAY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = PlaylistPackage.PLAY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = PlaylistPackage.PLAY_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.FilterClauseImpl <em>Filter Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.FilterClauseImpl
	 * @see query.impl.QueryPackageImpl#getFilterClause()
	 * @generated
	 */
	int FILTER_CLAUSE = 1;

	/**
	 * The number of structural features of the '<em>Filter Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLAUSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Filter Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.AndClauseImpl <em>And Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.AndClauseImpl
	 * @see query.impl.QueryPackageImpl#getAndClause()
	 * @generated
	 */
	int AND_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Filterclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE__FILTERCLAUSE = FILTER_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE_FEATURE_COUNT = FILTER_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_CLAUSE_OPERATION_COUNT = FILTER_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.TypeImpl
	 * @see query.impl.QueryPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.OrClauseImpl <em>Or Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.OrClauseImpl
	 * @see query.impl.QueryPackageImpl#getOrClause()
	 * @generated
	 */
	int OR_CLAUSE = 4;

	/**
	 * The feature id for the '<em><b>Filterclause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE__FILTERCLAUSE = FILTER_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE_FEATURE_COUNT = FILTER_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_CLAUSE_OPERATION_COUNT = FILTER_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ClauseImpl
	 * @see query.impl.QueryPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__ATTRIBUTE = FILTER_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__VALUE = FILTER_CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__OPERATOR = FILTER_CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = FILTER_CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_OPERATION_COUNT = FILTER_CLAUSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link query.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.AttributeImpl
	 * @see query.impl.QueryPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.ValueImpl
	 * @see query.impl.QueryPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 7;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query.impl.OperatorImpl
	 * @see query.impl.QueryPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 8;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link query.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see query.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the reference '{@link query.Query#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see query.Query#getCollection()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link query.Query#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see query.Query#getFilter()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link query.Query#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see query.Query#getType()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Type();

	/**
	 * Returns the meta object for class '{@link query.FilterClause <em>Filter Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Clause</em>'.
	 * @see query.FilterClause
	 * @generated
	 */
	EClass getFilterClause();

	/**
	 * Returns the meta object for class '{@link query.AndClause <em>And Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Clause</em>'.
	 * @see query.AndClause
	 * @generated
	 */
	EClass getAndClause();

	/**
	 * Returns the meta object for the containment reference list '{@link query.AndClause#getFilterclause <em>Filterclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filterclause</em>'.
	 * @see query.AndClause#getFilterclause()
	 * @see #getAndClause()
	 * @generated
	 */
	EReference getAndClause_Filterclause();

	/**
	 * Returns the meta object for class '{@link query.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see query.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link query.OrClause <em>Or Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Clause</em>'.
	 * @see query.OrClause
	 * @generated
	 */
	EClass getOrClause();

	/**
	 * Returns the meta object for the containment reference list '{@link query.OrClause#getFilterclause <em>Filterclause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filterclause</em>'.
	 * @see query.OrClause#getFilterclause()
	 * @see #getOrClause()
	 * @generated
	 */
	EReference getOrClause_Filterclause();

	/**
	 * Returns the meta object for class '{@link query.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see query.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference '{@link query.Clause#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see query.Clause#getAttribute()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link query.Clause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see query.Clause#getValue()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Value();

	/**
	 * Returns the meta object for the containment reference '{@link query.Clause#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see query.Clause#getOperator()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Operator();

	/**
	 * Returns the meta object for class '{@link query.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see query.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link query.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see query.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link query.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see query.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link query.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.QueryImpl
		 * @see query.impl.QueryPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__COLLECTION = eINSTANCE.getQuery_Collection();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__FILTER = eINSTANCE.getQuery_Filter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__TYPE = eINSTANCE.getQuery_Type();

		/**
		 * The meta object literal for the '{@link query.impl.FilterClauseImpl <em>Filter Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.FilterClauseImpl
		 * @see query.impl.QueryPackageImpl#getFilterClause()
		 * @generated
		 */
		EClass FILTER_CLAUSE = eINSTANCE.getFilterClause();

		/**
		 * The meta object literal for the '{@link query.impl.AndClauseImpl <em>And Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.AndClauseImpl
		 * @see query.impl.QueryPackageImpl#getAndClause()
		 * @generated
		 */
		EClass AND_CLAUSE = eINSTANCE.getAndClause();

		/**
		 * The meta object literal for the '<em><b>Filterclause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND_CLAUSE__FILTERCLAUSE = eINSTANCE.getAndClause_Filterclause();

		/**
		 * The meta object literal for the '{@link query.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.TypeImpl
		 * @see query.impl.QueryPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link query.impl.OrClauseImpl <em>Or Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.OrClauseImpl
		 * @see query.impl.QueryPackageImpl#getOrClause()
		 * @generated
		 */
		EClass OR_CLAUSE = eINSTANCE.getOrClause();

		/**
		 * The meta object literal for the '<em><b>Filterclause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR_CLAUSE__FILTERCLAUSE = eINSTANCE.getOrClause_Filterclause();

		/**
		 * The meta object literal for the '{@link query.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ClauseImpl
		 * @see query.impl.QueryPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__ATTRIBUTE = eINSTANCE.getClause_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__VALUE = eINSTANCE.getClause_Value();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__OPERATOR = eINSTANCE.getClause_Operator();

		/**
		 * The meta object literal for the '{@link query.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.AttributeImpl
		 * @see query.impl.QueryPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link query.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.ValueImpl
		 * @see query.impl.QueryPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link query.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query.impl.OperatorImpl
		 * @see query.impl.QueryPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

	}

} //QueryPackage
