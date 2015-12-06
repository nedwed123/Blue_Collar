/**
 */
package SoftwareModel.DomainEntities;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Availability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SoftwareModel.DomainEntities.DomainEntitiesPackage#getAvailability()
 * @model
 * @generated
 */
public enum Availability implements Enumerator {
	/**
	 * The '<em><b>Availible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILIBLE(0, "Availible", "Availible"),

	/**
	 * The '<em><b>Used</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USED_VALUE
	 * @generated
	 * @ordered
	 */
	USED(1, "Used", "Used"),

	/**
	 * The '<em><b>Under Maintenence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDER_MAINTENENCE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDER_MAINTENENCE(2, "UnderMaintenence", "UnderMaintenence"),

	/**
	 * The '<em><b>To Be Cleaned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BE_CLEANED_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BE_CLEANED(3, "ToBeCleaned", "ToBeCleaned");

	/**
	 * The '<em><b>Availible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Availible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVAILIBLE
	 * @model name="Availible"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILIBLE_VALUE = 0;

	/**
	 * The '<em><b>Used</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Used</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USED
	 * @model name="Used"
	 * @generated
	 * @ordered
	 */
	public static final int USED_VALUE = 1;

	/**
	 * The '<em><b>Under Maintenence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Under Maintenence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDER_MAINTENENCE
	 * @model name="UnderMaintenence"
	 * @generated
	 * @ordered
	 */
	public static final int UNDER_MAINTENENCE_VALUE = 2;

	/**
	 * The '<em><b>To Be Cleaned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Be Cleaned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_BE_CLEANED
	 * @model name="ToBeCleaned"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BE_CLEANED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Availability[] VALUES_ARRAY =
		new Availability[] {
			AVAILIBLE,
			USED,
			UNDER_MAINTENENCE,
			TO_BE_CLEANED,
		};

	/**
	 * A public read-only list of all the '<em><b>Availability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Availability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Availability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Availability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Availability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Availability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Availability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Availability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Availability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Availability get(int value) {
		switch (value) {
			case AVAILIBLE_VALUE: return AVAILIBLE;
			case USED_VALUE: return USED;
			case UNDER_MAINTENENCE_VALUE: return UNDER_MAINTENENCE;
			case TO_BE_CLEANED_VALUE: return TO_BE_CLEANED;
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
	private Availability(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //Availability
