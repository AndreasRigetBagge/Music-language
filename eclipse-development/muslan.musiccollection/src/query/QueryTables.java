/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   platform:/resource/muslan.query/model/Query.ecore
 *   /muslan.musiccollection/model/MusicCollection.ecore
 * using:
 *   /muslan.musiccollection/model/MusicCollection.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package query;

import musiccollection.MusiccollectionPackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
// import query.QueryPackage;
// import query.QueryTables;

/**
 * QueryTables provides the dispatch tables for the query for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class QueryTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(QueryPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_www_example_org_s_musiccollection = IdManager.getNsURIPackageId("https://www.example.org/musiccollection", null, MusiccollectionPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_www_example_org_s_query = IdManager.getNsURIPackageId("https://www.example.org/query", null, QueryPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_AndClause = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getClassId("AndClause", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_FilterClause = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getClassId("FilterClause", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MusicCollection = QueryTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("MusicCollection", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OrClause = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getClassId("OrClause", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Query = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getClassId("Query", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CategorizedElementType = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getEnumerationId("CategorizedElementType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CategoryType = QueryTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getEnumerationId("CategoryType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OperatorType = QueryTables.PACKid_https_c_s_s_www_example_org_s_query.getEnumerationId("OperatorType");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_FilterClause = TypeId.ORDERED_SET.getSpecializedId(QueryTables.CLSSid_FilterClause, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			QueryTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _AndClause = new EcoreExecutorType(QueryPackage.Literals.AND_CLAUSE, PACKAGE, 0);
		public static final EcoreExecutorType _ArtistClause = new EcoreExecutorType(QueryPackage.Literals.ARTIST_CLAUSE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CategorizedElementType = new EcoreExecutorEnumeration(QueryPackage.Literals.CATEGORIZED_ELEMENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _CategoryClause = new EcoreExecutorType(QueryPackage.Literals.CATEGORY_CLAUSE, PACKAGE, 0);
		public static final EcoreExecutorType _Clause = new EcoreExecutorType(QueryPackage.Literals.CLAUSE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _FilterClause = new EcoreExecutorType(QueryPackage.Literals.FILTER_CLAUSE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorEnumeration _OperatorType = new EcoreExecutorEnumeration(QueryPackage.Literals.OPERATOR_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _OrClause = new EcoreExecutorType(QueryPackage.Literals.OR_CLAUSE, PACKAGE, 0);
		public static final EcoreExecutorType _Query = new EcoreExecutorType(QueryPackage.Literals.QUERY, PACKAGE, 0);
		public static final EcoreExecutorType _TitleClause = new EcoreExecutorType(QueryPackage.Literals.TITLE_CLAUSE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_AndClause,
			_ArtistClause,
			_CategorizedElementType,
			_CategoryClause,
			_Clause,
			_FilterClause,
			_OperatorType,
			_OrClause,
			_Query,
			_TitleClause
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _AndClause__AndClause = new ExecutorFragment(Types._AndClause, QueryTables.Types._AndClause);
		private static final ExecutorFragment _AndClause__FilterClause = new ExecutorFragment(Types._AndClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _AndClause__OclAny = new ExecutorFragment(Types._AndClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AndClause__OclElement = new ExecutorFragment(Types._AndClause, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ArtistClause__ArtistClause = new ExecutorFragment(Types._ArtistClause, QueryTables.Types._ArtistClause);
		private static final ExecutorFragment _ArtistClause__Clause = new ExecutorFragment(Types._ArtistClause, QueryTables.Types._Clause);
		private static final ExecutorFragment _ArtistClause__FilterClause = new ExecutorFragment(Types._ArtistClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _ArtistClause__OclAny = new ExecutorFragment(Types._ArtistClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ArtistClause__OclElement = new ExecutorFragment(Types._ArtistClause, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CategorizedElementType__CategorizedElementType = new ExecutorFragment(Types._CategorizedElementType, QueryTables.Types._CategorizedElementType);
		private static final ExecutorFragment _CategorizedElementType__OclAny = new ExecutorFragment(Types._CategorizedElementType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CategorizedElementType__OclElement = new ExecutorFragment(Types._CategorizedElementType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CategorizedElementType__OclEnumeration = new ExecutorFragment(Types._CategorizedElementType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CategorizedElementType__OclType = new ExecutorFragment(Types._CategorizedElementType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CategoryClause__CategoryClause = new ExecutorFragment(Types._CategoryClause, QueryTables.Types._CategoryClause);
		private static final ExecutorFragment _CategoryClause__Clause = new ExecutorFragment(Types._CategoryClause, QueryTables.Types._Clause);
		private static final ExecutorFragment _CategoryClause__FilterClause = new ExecutorFragment(Types._CategoryClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _CategoryClause__OclAny = new ExecutorFragment(Types._CategoryClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CategoryClause__OclElement = new ExecutorFragment(Types._CategoryClause, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Clause__Clause = new ExecutorFragment(Types._Clause, QueryTables.Types._Clause);
		private static final ExecutorFragment _Clause__FilterClause = new ExecutorFragment(Types._Clause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _Clause__OclAny = new ExecutorFragment(Types._Clause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Clause__OclElement = new ExecutorFragment(Types._Clause, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _FilterClause__FilterClause = new ExecutorFragment(Types._FilterClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _FilterClause__OclAny = new ExecutorFragment(Types._FilterClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _FilterClause__OclElement = new ExecutorFragment(Types._FilterClause, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OperatorType__OclAny = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OperatorType__OclElement = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OperatorType__OclEnumeration = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OperatorType__OclType = new ExecutorFragment(Types._OperatorType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OperatorType__OperatorType = new ExecutorFragment(Types._OperatorType, QueryTables.Types._OperatorType);

		private static final ExecutorFragment _OrClause__FilterClause = new ExecutorFragment(Types._OrClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _OrClause__OclAny = new ExecutorFragment(Types._OrClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrClause__OclElement = new ExecutorFragment(Types._OrClause, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrClause__OrClause = new ExecutorFragment(Types._OrClause, QueryTables.Types._OrClause);

		private static final ExecutorFragment _Query__OclAny = new ExecutorFragment(Types._Query, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Query__OclElement = new ExecutorFragment(Types._Query, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Query__Query = new ExecutorFragment(Types._Query, QueryTables.Types._Query);

		private static final ExecutorFragment _TitleClause__Clause = new ExecutorFragment(Types._TitleClause, QueryTables.Types._Clause);
		private static final ExecutorFragment _TitleClause__FilterClause = new ExecutorFragment(Types._TitleClause, QueryTables.Types._FilterClause);
		private static final ExecutorFragment _TitleClause__OclAny = new ExecutorFragment(Types._TitleClause, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TitleClause__OclElement = new ExecutorFragment(Types._TitleClause, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TitleClause__TitleClause = new ExecutorFragment(Types._TitleClause, QueryTables.Types._TitleClause);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _AndClause__filterclause = new EcoreExecutorProperty(QueryPackage.Literals.AND_CLAUSE__FILTERCLAUSE, Types._AndClause, 0);

		public static final ExecutorProperty _CategoryClause__category = new EcoreExecutorProperty(QueryPackage.Literals.CATEGORY_CLAUSE__CATEGORY, Types._CategoryClause, 0);

		public static final ExecutorProperty _Clause__operator = new EcoreExecutorProperty(QueryPackage.Literals.CLAUSE__OPERATOR, Types._Clause, 0);
		public static final ExecutorProperty _Clause__value = new EcoreExecutorProperty(QueryPackage.Literals.CLAUSE__VALUE, Types._Clause, 1);

		public static final ExecutorProperty _FilterClause__AndClause__filterclause = new ExecutorPropertyWithImplementation("AndClause", Types._FilterClause, 0, new EcoreLibraryOppositeProperty(QueryPackage.Literals.AND_CLAUSE__FILTERCLAUSE));
		public static final ExecutorProperty _FilterClause__OrClause__filterclause = new ExecutorPropertyWithImplementation("OrClause", Types._FilterClause, 1, new EcoreLibraryOppositeProperty(QueryPackage.Literals.OR_CLAUSE__FILTERCLAUSE));
		public static final ExecutorProperty _FilterClause__Query__filter = new ExecutorPropertyWithImplementation("Query", Types._FilterClause, 2, new EcoreLibraryOppositeProperty(QueryPackage.Literals.QUERY__FILTER));

		public static final ExecutorProperty _OrClause__filterclause = new EcoreExecutorProperty(QueryPackage.Literals.OR_CLAUSE__FILTERCLAUSE, Types._OrClause, 0);

		public static final ExecutorProperty _Query__collection = new EcoreExecutorProperty(QueryPackage.Literals.QUERY__COLLECTION, Types._Query, 0);
		public static final ExecutorProperty _Query__filter = new EcoreExecutorProperty(QueryPackage.Literals.QUERY__FILTER, Types._Query, 1);
		public static final ExecutorProperty _Query__type = new EcoreExecutorProperty(QueryPackage.Literals.QUERY__TYPE, Types._Query, 2);
		public static final ExecutorProperty _Query__Playlist__query = new ExecutorPropertyWithImplementation("Playlist", Types._Query, 3, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.PLAYLIST__QUERY));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _AndClause =
			{
				Fragments._AndClause__OclAny /* 0 */,
				Fragments._AndClause__OclElement /* 1 */,
				Fragments._AndClause__FilterClause /* 2 */,
				Fragments._AndClause__AndClause /* 3 */
			};
		private static final int /*@NonNull*/ [] __AndClause = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ArtistClause =
			{
				Fragments._ArtistClause__OclAny /* 0 */,
				Fragments._ArtistClause__OclElement /* 1 */,
				Fragments._ArtistClause__FilterClause /* 2 */,
				Fragments._ArtistClause__Clause /* 3 */,
				Fragments._ArtistClause__ArtistClause /* 4 */
			};
		private static final int /*@NonNull*/ [] __ArtistClause = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CategorizedElementType =
			{
				Fragments._CategorizedElementType__OclAny /* 0 */,
				Fragments._CategorizedElementType__OclElement /* 1 */,
				Fragments._CategorizedElementType__OclType /* 2 */,
				Fragments._CategorizedElementType__OclEnumeration /* 3 */,
				Fragments._CategorizedElementType__CategorizedElementType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CategorizedElementType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CategoryClause =
			{
				Fragments._CategoryClause__OclAny /* 0 */,
				Fragments._CategoryClause__OclElement /* 1 */,
				Fragments._CategoryClause__FilterClause /* 2 */,
				Fragments._CategoryClause__Clause /* 3 */,
				Fragments._CategoryClause__CategoryClause /* 4 */
			};
		private static final int /*@NonNull*/ [] __CategoryClause = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Clause =
			{
				Fragments._Clause__OclAny /* 0 */,
				Fragments._Clause__OclElement /* 1 */,
				Fragments._Clause__FilterClause /* 2 */,
				Fragments._Clause__Clause /* 3 */
			};
		private static final int /*@NonNull*/ [] __Clause = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _FilterClause =
			{
				Fragments._FilterClause__OclAny /* 0 */,
				Fragments._FilterClause__OclElement /* 1 */,
				Fragments._FilterClause__FilterClause /* 2 */
			};
		private static final int /*@NonNull*/ [] __FilterClause = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OperatorType =
			{
				Fragments._OperatorType__OclAny /* 0 */,
				Fragments._OperatorType__OclElement /* 1 */,
				Fragments._OperatorType__OclType /* 2 */,
				Fragments._OperatorType__OclEnumeration /* 3 */,
				Fragments._OperatorType__OperatorType /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperatorType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrClause =
			{
				Fragments._OrClause__OclAny /* 0 */,
				Fragments._OrClause__OclElement /* 1 */,
				Fragments._OrClause__FilterClause /* 2 */,
				Fragments._OrClause__OrClause /* 3 */
			};
		private static final int /*@NonNull*/ [] __OrClause = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Query =
			{
				Fragments._Query__OclAny /* 0 */,
				Fragments._Query__OclElement /* 1 */,
				Fragments._Query__Query /* 2 */
			};
		private static final int /*@NonNull*/ [] __Query = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TitleClause =
			{
				Fragments._TitleClause__OclAny /* 0 */,
				Fragments._TitleClause__OclElement /* 1 */,
				Fragments._TitleClause__FilterClause /* 2 */,
				Fragments._TitleClause__Clause /* 3 */,
				Fragments._TitleClause__TitleClause /* 4 */
			};
		private static final int /*@NonNull*/ [] __TitleClause = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._AndClause.initFragments(_AndClause, __AndClause);
			Types._ArtistClause.initFragments(_ArtistClause, __ArtistClause);
			Types._CategorizedElementType.initFragments(_CategorizedElementType, __CategorizedElementType);
			Types._CategoryClause.initFragments(_CategoryClause, __CategoryClause);
			Types._Clause.initFragments(_Clause, __Clause);
			Types._FilterClause.initFragments(_FilterClause, __FilterClause);
			Types._OperatorType.initFragments(_OperatorType, __OperatorType);
			Types._OrClause.initFragments(_OrClause, __OrClause);
			Types._Query.initFragments(_Query, __Query);
			Types._TitleClause.initFragments(_TitleClause, __TitleClause);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _AndClause__AndClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AndClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AndClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AndClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ArtistClause__ArtistClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtistClause__Clause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtistClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtistClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ArtistClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElementType__CategorizedElementType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElementType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElementType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElementType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElementType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CategoryClause__CategoryClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryClause__Clause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Clause__Clause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Clause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Clause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Clause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _FilterClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _FilterClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _FilterClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OperatorType__OperatorType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatorType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatorType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatorType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperatorType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrClause__OrClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Query__Query = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Query__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Query__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TitleClause__TitleClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TitleClause__Clause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TitleClause__FilterClause = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TitleClause__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TitleClause__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AndClause__AndClause.initOperations(_AndClause__AndClause);
			Fragments._AndClause__FilterClause.initOperations(_AndClause__FilterClause);
			Fragments._AndClause__OclAny.initOperations(_AndClause__OclAny);
			Fragments._AndClause__OclElement.initOperations(_AndClause__OclElement);

			Fragments._ArtistClause__ArtistClause.initOperations(_ArtistClause__ArtistClause);
			Fragments._ArtistClause__Clause.initOperations(_ArtistClause__Clause);
			Fragments._ArtistClause__FilterClause.initOperations(_ArtistClause__FilterClause);
			Fragments._ArtistClause__OclAny.initOperations(_ArtistClause__OclAny);
			Fragments._ArtistClause__OclElement.initOperations(_ArtistClause__OclElement);

			Fragments._CategorizedElementType__CategorizedElementType.initOperations(_CategorizedElementType__CategorizedElementType);
			Fragments._CategorizedElementType__OclAny.initOperations(_CategorizedElementType__OclAny);
			Fragments._CategorizedElementType__OclElement.initOperations(_CategorizedElementType__OclElement);
			Fragments._CategorizedElementType__OclEnumeration.initOperations(_CategorizedElementType__OclEnumeration);
			Fragments._CategorizedElementType__OclType.initOperations(_CategorizedElementType__OclType);

			Fragments._CategoryClause__CategoryClause.initOperations(_CategoryClause__CategoryClause);
			Fragments._CategoryClause__Clause.initOperations(_CategoryClause__Clause);
			Fragments._CategoryClause__FilterClause.initOperations(_CategoryClause__FilterClause);
			Fragments._CategoryClause__OclAny.initOperations(_CategoryClause__OclAny);
			Fragments._CategoryClause__OclElement.initOperations(_CategoryClause__OclElement);

			Fragments._Clause__Clause.initOperations(_Clause__Clause);
			Fragments._Clause__FilterClause.initOperations(_Clause__FilterClause);
			Fragments._Clause__OclAny.initOperations(_Clause__OclAny);
			Fragments._Clause__OclElement.initOperations(_Clause__OclElement);

			Fragments._FilterClause__FilterClause.initOperations(_FilterClause__FilterClause);
			Fragments._FilterClause__OclAny.initOperations(_FilterClause__OclAny);
			Fragments._FilterClause__OclElement.initOperations(_FilterClause__OclElement);

			Fragments._OperatorType__OclAny.initOperations(_OperatorType__OclAny);
			Fragments._OperatorType__OclElement.initOperations(_OperatorType__OclElement);
			Fragments._OperatorType__OclEnumeration.initOperations(_OperatorType__OclEnumeration);
			Fragments._OperatorType__OclType.initOperations(_OperatorType__OclType);
			Fragments._OperatorType__OperatorType.initOperations(_OperatorType__OperatorType);

			Fragments._OrClause__FilterClause.initOperations(_OrClause__FilterClause);
			Fragments._OrClause__OclAny.initOperations(_OrClause__OclAny);
			Fragments._OrClause__OclElement.initOperations(_OrClause__OclElement);
			Fragments._OrClause__OrClause.initOperations(_OrClause__OrClause);

			Fragments._Query__OclAny.initOperations(_Query__OclAny);
			Fragments._Query__OclElement.initOperations(_Query__OclElement);
			Fragments._Query__Query.initOperations(_Query__Query);

			Fragments._TitleClause__Clause.initOperations(_TitleClause__Clause);
			Fragments._TitleClause__FilterClause.initOperations(_TitleClause__FilterClause);
			Fragments._TitleClause__OclAny.initOperations(_TitleClause__OclAny);
			Fragments._TitleClause__OclElement.initOperations(_TitleClause__OclElement);
			Fragments._TitleClause__TitleClause.initOperations(_TitleClause__TitleClause);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _AndClause = {
			QueryTables.Properties._AndClause__filterclause,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ArtistClause = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QueryTables.Properties._Clause__operator,
			QueryTables.Properties._Clause__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CategorizedElementType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CategoryClause = {
			QueryTables.Properties._CategoryClause__category,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QueryTables.Properties._Clause__operator,
			QueryTables.Properties._Clause__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Clause = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QueryTables.Properties._Clause__operator,
			QueryTables.Properties._Clause__value
		};

		private static final ExecutorProperty /*@NonNull*/ [] _FilterClause = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OperatorType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrClause = {
			QueryTables.Properties._OrClause__filterclause,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Query = {
			QueryTables.Properties._Query__collection,
			QueryTables.Properties._Query__filter,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QueryTables.Properties._Query__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TitleClause = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			QueryTables.Properties._Clause__operator,
			QueryTables.Properties._Clause__value
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._AndClause__AndClause.initProperties(_AndClause);
			Fragments._ArtistClause__ArtistClause.initProperties(_ArtistClause);
			Fragments._CategorizedElementType__CategorizedElementType.initProperties(_CategorizedElementType);
			Fragments._CategoryClause__CategoryClause.initProperties(_CategoryClause);
			Fragments._Clause__Clause.initProperties(_Clause);
			Fragments._FilterClause__FilterClause.initProperties(_FilterClause);
			Fragments._OperatorType__OperatorType.initProperties(_OperatorType);
			Fragments._OrClause__OrClause.initProperties(_OrClause);
			Fragments._Query__Query.initProperties(_Query);
			Fragments._TitleClause__TitleClause.initProperties(_TitleClause);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _CategorizedElementType__Track = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.CATEGORIZED_ELEMENT_TYPE.getEEnumLiteral("Track"), Types._CategorizedElementType, 0);
		public static final EcoreExecutorEnumerationLiteral _CategorizedElementType__Album = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.CATEGORIZED_ELEMENT_TYPE.getEEnumLiteral("Album"), Types._CategorizedElementType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CategorizedElementType = {
			_CategorizedElementType__Track,
			_CategorizedElementType__Album
		};

		public static final EcoreExecutorEnumerationLiteral _OperatorType__SameAs = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("SameAs"), Types._OperatorType, 0);
		public static final EcoreExecutorEnumerationLiteral _OperatorType__DifferentFrom = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("DifferentFrom"), Types._OperatorType, 1);
		public static final EcoreExecutorEnumerationLiteral _OperatorType__LessThan = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("LessThan"), Types._OperatorType, 2);
		public static final EcoreExecutorEnumerationLiteral _OperatorType__GreaterThan = new EcoreExecutorEnumerationLiteral(QueryPackage.Literals.OPERATOR_TYPE.getEEnumLiteral("GreaterThan"), Types._OperatorType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperatorType = {
			_OperatorType__SameAs,
			_OperatorType__DifferentFrom,
			_OperatorType__LessThan,
			_OperatorType__GreaterThan
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CategorizedElementType.initLiterals(_CategorizedElementType);
			Types._OperatorType.initLiterals(_OperatorType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of QueryTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new QueryTables();
	}

	private QueryTables() {
		super(QueryPackage.eNS_URI);
	}
}
