/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /muslan.musiccollection/model/MusicCollection.ecore
 *   platform:/resource/muslan.query/model/Query.ecore
 * using:
 *   /muslan.musiccollection/model/MusicCollection.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package musiccollection;

// import musiccollection.MusiccollectionPackage;
// import musiccollection.MusiccollectionTables;
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
import pbconfig.PbconfigPackage;
import query.QueryPackage;

/**
 * MusiccollectionTables provides the dispatch tables for the musiccollection for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class MusiccollectionTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(MusiccollectionPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_www_example_org_s_musiccollection = IdManager.getNsURIPackageId("https://www.example.org/musiccollection", null, MusiccollectionPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_www_example_org_s_pbconfig = IdManager.getNsURIPackageId("https://www.example.org/pbconfig", null, PbconfigPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_www_example_org_s_query = IdManager.getNsURIPackageId("https://www.example.org/query", null, QueryPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Album = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Album", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Artist = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Artist", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CategorizedElement = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("CategorizedElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Category = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Category", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CollectionRoot = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("CollectionRoot", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Composition = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Composition", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Configuration = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_pbconfig.getClassId("Configuration", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_MusicCollection = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("MusicCollection", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Playlist = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Playlist", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Query = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_query.getClassId("Query", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Track = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getClassId("Track", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CategoryType = MusiccollectionTables.PACKid_https_c_s_s_www_example_org_s_musiccollection.getEnumerationId("CategoryType");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Album = TypeId.BAG.getSpecializedId(MusiccollectionTables.CLSSid_Album, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CategorizedElement = TypeId.BAG.getSpecializedId(MusiccollectionTables.CLSSid_CategorizedElement, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Playlist = TypeId.BAG.getSpecializedId(MusiccollectionTables.CLSSid_Playlist, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Artist = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Artist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CategorizedElement = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_CategorizedElement, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Category = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Category, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Composition = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Composition, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Configuration = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Configuration, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_MusicCollection = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_MusicCollection, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Playlist = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Playlist, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Query = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Query, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Track = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Track, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Track_0 = TypeId.ORDERED_SET.getSpecializedId(MusiccollectionTables.CLSSid_Track, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			MusiccollectionTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Album = new EcoreExecutorType(MusiccollectionPackage.Literals.ALBUM, PACKAGE, 0);
		public static final EcoreExecutorType _Artist = new EcoreExecutorType(MusiccollectionPackage.Literals.ARTIST, PACKAGE, 0);
		public static final EcoreExecutorType _CategorizedElement = new EcoreExecutorType(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Category = new EcoreExecutorType(MusiccollectionPackage.Literals.CATEGORY, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CategoryType = new EcoreExecutorEnumeration(MusiccollectionPackage.Literals.CATEGORY_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _CollectionRoot = new EcoreExecutorType(MusiccollectionPackage.Literals.COLLECTION_ROOT, PACKAGE, 0);
		public static final EcoreExecutorType _Composition = new EcoreExecutorType(MusiccollectionPackage.Literals.COMPOSITION, PACKAGE, 0);
		public static final EcoreExecutorType _MusicCollection = new EcoreExecutorType(MusiccollectionPackage.Literals.MUSIC_COLLECTION, PACKAGE, 0);
		public static final EcoreExecutorType _Playlist = new EcoreExecutorType(MusiccollectionPackage.Literals.PLAYLIST, PACKAGE, 0);
		public static final EcoreExecutorType _Track = new EcoreExecutorType(MusiccollectionPackage.Literals.TRACK, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Album,
			_Artist,
			_CategorizedElement,
			_Category,
			_CategoryType,
			_CollectionRoot,
			_Composition,
			_MusicCollection,
			_Playlist,
			_Track
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Album__Album = new ExecutorFragment(Types._Album, MusiccollectionTables.Types._Album);
		private static final ExecutorFragment _Album__CategorizedElement = new ExecutorFragment(Types._Album, MusiccollectionTables.Types._CategorizedElement);
		private static final ExecutorFragment _Album__OclAny = new ExecutorFragment(Types._Album, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Album__OclElement = new ExecutorFragment(Types._Album, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Artist__Artist = new ExecutorFragment(Types._Artist, MusiccollectionTables.Types._Artist);
		private static final ExecutorFragment _Artist__OclAny = new ExecutorFragment(Types._Artist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Artist__OclElement = new ExecutorFragment(Types._Artist, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CategorizedElement__CategorizedElement = new ExecutorFragment(Types._CategorizedElement, MusiccollectionTables.Types._CategorizedElement);
		private static final ExecutorFragment _CategorizedElement__OclAny = new ExecutorFragment(Types._CategorizedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CategorizedElement__OclElement = new ExecutorFragment(Types._CategorizedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Category__Category = new ExecutorFragment(Types._Category, MusiccollectionTables.Types._Category);
		private static final ExecutorFragment _Category__OclAny = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Category__OclElement = new ExecutorFragment(Types._Category, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CategoryType__CategoryType = new ExecutorFragment(Types._CategoryType, MusiccollectionTables.Types._CategoryType);
		private static final ExecutorFragment _CategoryType__OclAny = new ExecutorFragment(Types._CategoryType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CategoryType__OclElement = new ExecutorFragment(Types._CategoryType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CategoryType__OclEnumeration = new ExecutorFragment(Types._CategoryType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CategoryType__OclType = new ExecutorFragment(Types._CategoryType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _CollectionRoot__CollectionRoot = new ExecutorFragment(Types._CollectionRoot, MusiccollectionTables.Types._CollectionRoot);
		private static final ExecutorFragment _CollectionRoot__OclAny = new ExecutorFragment(Types._CollectionRoot, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CollectionRoot__OclElement = new ExecutorFragment(Types._CollectionRoot, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Composition__CategorizedElement = new ExecutorFragment(Types._Composition, MusiccollectionTables.Types._CategorizedElement);
		private static final ExecutorFragment _Composition__Composition = new ExecutorFragment(Types._Composition, MusiccollectionTables.Types._Composition);
		private static final ExecutorFragment _Composition__OclAny = new ExecutorFragment(Types._Composition, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Composition__OclElement = new ExecutorFragment(Types._Composition, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MusicCollection__MusicCollection = new ExecutorFragment(Types._MusicCollection, MusiccollectionTables.Types._MusicCollection);
		private static final ExecutorFragment _MusicCollection__OclAny = new ExecutorFragment(Types._MusicCollection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MusicCollection__OclElement = new ExecutorFragment(Types._MusicCollection, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Playlist__OclAny = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Playlist__OclElement = new ExecutorFragment(Types._Playlist, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Playlist__Playlist = new ExecutorFragment(Types._Playlist, MusiccollectionTables.Types._Playlist);

		private static final ExecutorFragment _Track__CategorizedElement = new ExecutorFragment(Types._Track, MusiccollectionTables.Types._CategorizedElement);
		private static final ExecutorFragment _Track__OclAny = new ExecutorFragment(Types._Track, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Track__OclElement = new ExecutorFragment(Types._Track, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Track__Track = new ExecutorFragment(Types._Track, MusiccollectionTables.Types._Track);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of MusiccollectionTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of MusiccollectionTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Album__tracks = new EcoreExecutorProperty(MusiccollectionPackage.Literals.ALBUM__TRACKS, Types._Album, 0);

		public static final ExecutorProperty _Artist__Name = new EcoreExecutorProperty(MusiccollectionPackage.Literals.ARTIST__NAME, Types._Artist, 0);
		public static final ExecutorProperty _Artist__CategorizedElement__artists = new ExecutorPropertyWithImplementation("CategorizedElement", Types._Artist, 1, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT__ARTISTS));
		public static final ExecutorProperty _Artist__CollectionRoot__artist = new ExecutorPropertyWithImplementation("CollectionRoot", Types._Artist, 2, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__ARTIST));

		public static final ExecutorProperty _CategorizedElement__Name = new EcoreExecutorProperty(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT__NAME, Types._CategorizedElement, 0);
		public static final ExecutorProperty _CategorizedElement__artists = new EcoreExecutorProperty(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT__ARTISTS, Types._CategorizedElement, 1);
		public static final ExecutorProperty _CategorizedElement__category = new EcoreExecutorProperty(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT__CATEGORY, Types._CategorizedElement, 2);
		public static final ExecutorProperty _CategorizedElement__MusicCollection__categorizedelements = new ExecutorPropertyWithImplementation("MusicCollection", Types._CategorizedElement, 3, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.MUSIC_COLLECTION__CATEGORIZEDELEMENTS));

		public static final ExecutorProperty _Category__CategoryType = new EcoreExecutorProperty(MusiccollectionPackage.Literals.CATEGORY__CATEGORY_TYPE, Types._Category, 0);
		public static final ExecutorProperty _Category__Value = new EcoreExecutorProperty(MusiccollectionPackage.Literals.CATEGORY__VALUE, Types._Category, 1);
		public static final ExecutorProperty _Category__CategorizedElement__category = new ExecutorPropertyWithImplementation("CategorizedElement", Types._Category, 2, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.CATEGORIZED_ELEMENT__CATEGORY));
		public static final ExecutorProperty _Category__CollectionRoot__categories = new ExecutorPropertyWithImplementation("CollectionRoot", Types._Category, 3, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__CATEGORIES));

		public static final ExecutorProperty _CollectionRoot__artist = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__ARTIST, Types._CollectionRoot, 0);
		public static final ExecutorProperty _CollectionRoot__categories = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__CATEGORIES, Types._CollectionRoot, 1);
		public static final ExecutorProperty _CollectionRoot__configuration = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__CONFIGURATION, Types._CollectionRoot, 2);
		public static final ExecutorProperty _CollectionRoot__defaultConfig = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__DEFAULT_CONFIG, Types._CollectionRoot, 3);
		public static final ExecutorProperty _CollectionRoot__musiccollection = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__MUSICCOLLECTION, Types._CollectionRoot, 4);

		public static final ExecutorProperty _Composition__tracks = new EcoreExecutorProperty(MusiccollectionPackage.Literals.COMPOSITION__TRACKS, Types._Composition, 0);

		public static final ExecutorProperty _MusicCollection__Name = new EcoreExecutorProperty(MusiccollectionPackage.Literals.MUSIC_COLLECTION__NAME, Types._MusicCollection, 0);
		public static final ExecutorProperty _MusicCollection__categorizedelements = new EcoreExecutorProperty(MusiccollectionPackage.Literals.MUSIC_COLLECTION__CATEGORIZEDELEMENTS, Types._MusicCollection, 1);
		public static final ExecutorProperty _MusicCollection__playlist = new EcoreExecutorProperty(MusiccollectionPackage.Literals.MUSIC_COLLECTION__PLAYLIST, Types._MusicCollection, 2);
		public static final ExecutorProperty _MusicCollection__CollectionRoot__musiccollection = new ExecutorPropertyWithImplementation("CollectionRoot", Types._MusicCollection, 3, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.COLLECTION_ROOT__MUSICCOLLECTION));
		public static final ExecutorProperty _MusicCollection__Query__collection = new ExecutorPropertyWithImplementation("Query", Types._MusicCollection, 4, new EcoreLibraryOppositeProperty(QueryPackage.Literals.QUERY__COLLECTION));

		public static final ExecutorProperty _Playlist__Name = new EcoreExecutorProperty(MusiccollectionPackage.Literals.PLAYLIST__NAME, Types._Playlist, 0);
		public static final ExecutorProperty _Playlist__configuration = new EcoreExecutorProperty(MusiccollectionPackage.Literals.PLAYLIST__CONFIGURATION, Types._Playlist, 1);
		public static final ExecutorProperty _Playlist__query = new EcoreExecutorProperty(MusiccollectionPackage.Literals.PLAYLIST__QUERY, Types._Playlist, 2);
		public static final ExecutorProperty _Playlist__track = new EcoreExecutorProperty(MusiccollectionPackage.Literals.PLAYLIST__TRACK, Types._Playlist, 3);
		public static final ExecutorProperty _Playlist__MusicCollection__playlist = new ExecutorPropertyWithImplementation("MusicCollection", Types._Playlist, 4, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.MUSIC_COLLECTION__PLAYLIST));

		public static final ExecutorProperty _Track__compositions = new EcoreExecutorProperty(MusiccollectionPackage.Literals.TRACK__COMPOSITIONS, Types._Track, 0);
		public static final ExecutorProperty _Track__Album__tracks = new ExecutorPropertyWithImplementation("Album", Types._Track, 1, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.ALBUM__TRACKS));
		public static final ExecutorProperty _Track__Playlist__track = new ExecutorPropertyWithImplementation("Playlist", Types._Track, 2, new EcoreLibraryOppositeProperty(MusiccollectionPackage.Literals.PLAYLIST__TRACK));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Album =
			{
				Fragments._Album__OclAny /* 0 */,
				Fragments._Album__OclElement /* 1 */,
				Fragments._Album__CategorizedElement /* 2 */,
				Fragments._Album__Album /* 3 */
			};
		private static final int /*@NonNull*/ [] __Album = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Artist =
			{
				Fragments._Artist__OclAny /* 0 */,
				Fragments._Artist__OclElement /* 1 */,
				Fragments._Artist__Artist /* 2 */
			};
		private static final int /*@NonNull*/ [] __Artist = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CategorizedElement =
			{
				Fragments._CategorizedElement__OclAny /* 0 */,
				Fragments._CategorizedElement__OclElement /* 1 */,
				Fragments._CategorizedElement__CategorizedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __CategorizedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Category =
			{
				Fragments._Category__OclAny /* 0 */,
				Fragments._Category__OclElement /* 1 */,
				Fragments._Category__Category /* 2 */
			};
		private static final int /*@NonNull*/ [] __Category = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CategoryType =
			{
				Fragments._CategoryType__OclAny /* 0 */,
				Fragments._CategoryType__OclElement /* 1 */,
				Fragments._CategoryType__OclType /* 2 */,
				Fragments._CategoryType__OclEnumeration /* 3 */,
				Fragments._CategoryType__CategoryType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CategoryType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CollectionRoot =
			{
				Fragments._CollectionRoot__OclAny /* 0 */,
				Fragments._CollectionRoot__OclElement /* 1 */,
				Fragments._CollectionRoot__CollectionRoot /* 2 */
			};
		private static final int /*@NonNull*/ [] __CollectionRoot = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Composition =
			{
				Fragments._Composition__OclAny /* 0 */,
				Fragments._Composition__OclElement /* 1 */,
				Fragments._Composition__CategorizedElement /* 2 */,
				Fragments._Composition__Composition /* 3 */
			};
		private static final int /*@NonNull*/ [] __Composition = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MusicCollection =
			{
				Fragments._MusicCollection__OclAny /* 0 */,
				Fragments._MusicCollection__OclElement /* 1 */,
				Fragments._MusicCollection__MusicCollection /* 2 */
			};
		private static final int /*@NonNull*/ [] __MusicCollection = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Playlist =
			{
				Fragments._Playlist__OclAny /* 0 */,
				Fragments._Playlist__OclElement /* 1 */,
				Fragments._Playlist__Playlist /* 2 */
			};
		private static final int /*@NonNull*/ [] __Playlist = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Track =
			{
				Fragments._Track__OclAny /* 0 */,
				Fragments._Track__OclElement /* 1 */,
				Fragments._Track__CategorizedElement /* 2 */,
				Fragments._Track__Track /* 3 */
			};
		private static final int /*@NonNull*/ [] __Track = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Album.initFragments(_Album, __Album);
			Types._Artist.initFragments(_Artist, __Artist);
			Types._CategorizedElement.initFragments(_CategorizedElement, __CategorizedElement);
			Types._Category.initFragments(_Category, __Category);
			Types._CategoryType.initFragments(_CategoryType, __CategoryType);
			Types._CollectionRoot.initFragments(_CollectionRoot, __CollectionRoot);
			Types._Composition.initFragments(_Composition, __Composition);
			Types._MusicCollection.initFragments(_MusicCollection, __MusicCollection);
			Types._Playlist.initFragments(_Playlist, __Playlist);
			Types._Track.initFragments(_Track, __Track);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Album__Album = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Album__CategorizedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Album__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Album__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Artist__Artist = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Artist__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Artist__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElement__CategorizedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElement__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CategorizedElement__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Category__Category = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Category__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _CategoryType__CategoryType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryType__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryType__OclElement = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CategoryType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CollectionRoot__CollectionRoot = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionRoot__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _CollectionRoot__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Composition__Composition = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Composition__CategorizedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Composition__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Composition__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _MusicCollection__MusicCollection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MusicCollection__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _MusicCollection__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__Playlist = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Playlist__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Track__Track = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Track__CategorizedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Track__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Track__OclElement = {
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
			Fragments._Album__Album.initOperations(_Album__Album);
			Fragments._Album__CategorizedElement.initOperations(_Album__CategorizedElement);
			Fragments._Album__OclAny.initOperations(_Album__OclAny);
			Fragments._Album__OclElement.initOperations(_Album__OclElement);

			Fragments._Artist__Artist.initOperations(_Artist__Artist);
			Fragments._Artist__OclAny.initOperations(_Artist__OclAny);
			Fragments._Artist__OclElement.initOperations(_Artist__OclElement);

			Fragments._CategorizedElement__CategorizedElement.initOperations(_CategorizedElement__CategorizedElement);
			Fragments._CategorizedElement__OclAny.initOperations(_CategorizedElement__OclAny);
			Fragments._CategorizedElement__OclElement.initOperations(_CategorizedElement__OclElement);

			Fragments._Category__Category.initOperations(_Category__Category);
			Fragments._Category__OclAny.initOperations(_Category__OclAny);
			Fragments._Category__OclElement.initOperations(_Category__OclElement);

			Fragments._CategoryType__CategoryType.initOperations(_CategoryType__CategoryType);
			Fragments._CategoryType__OclAny.initOperations(_CategoryType__OclAny);
			Fragments._CategoryType__OclElement.initOperations(_CategoryType__OclElement);
			Fragments._CategoryType__OclEnumeration.initOperations(_CategoryType__OclEnumeration);
			Fragments._CategoryType__OclType.initOperations(_CategoryType__OclType);

			Fragments._CollectionRoot__CollectionRoot.initOperations(_CollectionRoot__CollectionRoot);
			Fragments._CollectionRoot__OclAny.initOperations(_CollectionRoot__OclAny);
			Fragments._CollectionRoot__OclElement.initOperations(_CollectionRoot__OclElement);

			Fragments._Composition__CategorizedElement.initOperations(_Composition__CategorizedElement);
			Fragments._Composition__Composition.initOperations(_Composition__Composition);
			Fragments._Composition__OclAny.initOperations(_Composition__OclAny);
			Fragments._Composition__OclElement.initOperations(_Composition__OclElement);

			Fragments._MusicCollection__MusicCollection.initOperations(_MusicCollection__MusicCollection);
			Fragments._MusicCollection__OclAny.initOperations(_MusicCollection__OclAny);
			Fragments._MusicCollection__OclElement.initOperations(_MusicCollection__OclElement);

			Fragments._Playlist__OclAny.initOperations(_Playlist__OclAny);
			Fragments._Playlist__OclElement.initOperations(_Playlist__OclElement);
			Fragments._Playlist__Playlist.initOperations(_Playlist__Playlist);

			Fragments._Track__CategorizedElement.initOperations(_Track__CategorizedElement);
			Fragments._Track__OclAny.initOperations(_Track__OclAny);
			Fragments._Track__OclElement.initOperations(_Track__OclElement);
			Fragments._Track__Track.initOperations(_Track__Track);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Album = {
			MusiccollectionTables.Properties._CategorizedElement__Name,
			MusiccollectionTables.Properties._CategorizedElement__artists,
			MusiccollectionTables.Properties._CategorizedElement__category,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusiccollectionTables.Properties._Album__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Artist = {
			MusiccollectionTables.Properties._Artist__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CategorizedElement = {
			MusiccollectionTables.Properties._CategorizedElement__Name,
			MusiccollectionTables.Properties._CategorizedElement__artists,
			MusiccollectionTables.Properties._CategorizedElement__category,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Category = {
			MusiccollectionTables.Properties._Category__CategoryType,
			MusiccollectionTables.Properties._Category__Value,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CategoryType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CollectionRoot = {
			MusiccollectionTables.Properties._CollectionRoot__artist,
			MusiccollectionTables.Properties._CollectionRoot__categories,
			MusiccollectionTables.Properties._CollectionRoot__configuration,
			MusiccollectionTables.Properties._CollectionRoot__defaultConfig,
			MusiccollectionTables.Properties._CollectionRoot__musiccollection,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Composition = {
			MusiccollectionTables.Properties._CategorizedElement__Name,
			MusiccollectionTables.Properties._CategorizedElement__artists,
			MusiccollectionTables.Properties._CategorizedElement__category,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusiccollectionTables.Properties._Composition__tracks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MusicCollection = {
			MusiccollectionTables.Properties._MusicCollection__Name,
			MusiccollectionTables.Properties._MusicCollection__categorizedelements,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusiccollectionTables.Properties._MusicCollection__playlist
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Playlist = {
			MusiccollectionTables.Properties._Playlist__Name,
			MusiccollectionTables.Properties._Playlist__configuration,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			MusiccollectionTables.Properties._Playlist__query,
			MusiccollectionTables.Properties._Playlist__track
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Track = {
			MusiccollectionTables.Properties._CategorizedElement__Name,
			MusiccollectionTables.Properties._CategorizedElement__artists,
			MusiccollectionTables.Properties._CategorizedElement__category,
			MusiccollectionTables.Properties._Track__compositions,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Album__Album.initProperties(_Album);
			Fragments._Artist__Artist.initProperties(_Artist);
			Fragments._CategorizedElement__CategorizedElement.initProperties(_CategorizedElement);
			Fragments._Category__Category.initProperties(_Category);
			Fragments._CategoryType__CategoryType.initProperties(_CategoryType);
			Fragments._CollectionRoot__CollectionRoot.initProperties(_CollectionRoot);
			Fragments._Composition__Composition.initProperties(_Composition);
			Fragments._MusicCollection__MusicCollection.initProperties(_MusicCollection);
			Fragments._Playlist__Playlist.initProperties(_Playlist);
			Fragments._Track__Track.initProperties(_Track);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::FragmentProperties and all preceding sub-packages.
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

		public static final EcoreExecutorEnumerationLiteral _CategoryType__Rating = new EcoreExecutorEnumerationLiteral(MusiccollectionPackage.Literals.CATEGORY_TYPE.getEEnumLiteral("Rating"), Types._CategoryType, 0);
		public static final EcoreExecutorEnumerationLiteral _CategoryType__Genre = new EcoreExecutorEnumerationLiteral(MusiccollectionPackage.Literals.CATEGORY_TYPE.getEEnumLiteral("Genre"), Types._CategoryType, 1);
		public static final EcoreExecutorEnumerationLiteral _CategoryType__Tag = new EcoreExecutorEnumerationLiteral(MusiccollectionPackage.Literals.CATEGORY_TYPE.getEEnumLiteral("Tag"), Types._CategoryType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CategoryType = {
			_CategoryType__Rating,
			_CategoryType__Genre,
			_CategoryType__Tag
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CategoryType.initLiterals(_CategoryType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of MusiccollectionTables::EnumerationLiterals and all preceding sub-packages.
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
		new MusiccollectionTables();
	}

	private MusiccollectionTables() {
		super(MusiccollectionPackage.eNS_URI);
	}
}
