/**
 */
package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see collection.CollectionPackage#getCategoryType()
 * @model
 * @generated
 */
public enum CategoryType implements Enumerator {
	/**
	 * The '<em><b>Rating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATING_VALUE
	 * @generated
	 * @ordered
	 */
	RATING(0, "Rating", "Rating"),

	/**
	 * The '<em><b>Genre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENRE_VALUE
	 * @generated
	 * @ordered
	 */
	GENRE(1, "Genre", "Genre"),

	/**
	 * The '<em><b>Tag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(2, "Tag", "Tag");

	/**
	 * The '<em><b>Rating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATING
	 * @model name="Rating"
	 * @generated
	 * @ordered
	 */
	public static final int RATING_VALUE = 0;

	/**
	 * The '<em><b>Genre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENRE
	 * @model name="Genre"
	 * @generated
	 * @ordered
	 */
	public static final int GENRE_VALUE = 1;

	/**
	 * The '<em><b>Tag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG
	 * @model name="Tag"
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 2;

	/**
	 * An array of all the '<em><b>Category Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CategoryType[] VALUES_ARRAY =
		new CategoryType[] {
			RATING,
			GENRE,
			TAG,
		};

	/**
	 * A public read-only list of all the '<em><b>Category Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CategoryType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategoryType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategoryType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategoryType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategoryType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategoryType get(int value) {
		switch (value) {
			case RATING_VALUE: return RATING;
			case GENRE_VALUE: return GENRE;
			case TAG_VALUE: return TAG;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CategoryType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CategoryType
