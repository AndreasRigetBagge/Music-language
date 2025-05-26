/**
 */
package relation;

import musiccollection.MusicCollection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link relation.CollectionReference#getPointsTo <em>Points To</em>}</li>
 * </ul>
 *
 * @see relation.RelationPackage#getCollectionReference()
 * @model
 * @generated
 */
public interface CollectionReference extends ICollection {
	/**
	 * Returns the value of the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points To</em>' reference.
	 * @see #setPointsTo(MusicCollection)
	 * @see relation.RelationPackage#getCollectionReference_PointsTo()
	 * @model required="true"
	 * @generated
	 */
	MusicCollection getPointsTo();

	/**
	 * Sets the value of the '{@link relation.CollectionReference#getPointsTo <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points To</em>' reference.
	 * @see #getPointsTo()
	 * @generated
	 */
	void setPointsTo(MusicCollection value);

} // CollectionReference
