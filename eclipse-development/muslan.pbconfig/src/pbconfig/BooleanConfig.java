/**
 */
package pbconfig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean Config</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pbconfig.PbconfigPackage#getBooleanConfig()
 * @model
 * @generated
 */
public enum BooleanConfig implements Enumerator {
	/**
	 * The '<em><b>Shuffle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUFFLE_VALUE
	 * @generated
	 * @ordered
	 */
	SHUFFLE(0, "Shuffle", "Shuffle"),

	/**
	 * The '<em><b>Skip Unavailable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_UNAVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SKIP_UNAVAILABLE(1, "SkipUnavailable", "SkipUnavailable");

	/**
	 * The '<em><b>Shuffle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUFFLE
	 * @model name="Shuffle"
	 * @generated
	 * @ordered
	 */
	public static final int SHUFFLE_VALUE = 0;

	/**
	 * The '<em><b>Skip Unavailable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIP_UNAVAILABLE
	 * @model name="SkipUnavailable"
	 * @generated
	 * @ordered
	 */
	public static final int SKIP_UNAVAILABLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Boolean Config</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BooleanConfig[] VALUES_ARRAY =
		new BooleanConfig[] {
			SHUFFLE,
			SKIP_UNAVAILABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Boolean Config</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BooleanConfig> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Boolean Config</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanConfig get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanConfig result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Config</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanConfig getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanConfig result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Config</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BooleanConfig get(int value) {
		switch (value) {
			case SHUFFLE_VALUE: return SHUFFLE;
			case SKIP_UNAVAILABLE_VALUE: return SKIP_UNAVAILABLE;
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
	private BooleanConfig(int value, String name, String literal) {
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
	
} //BooleanConfig
