/**
 */
package musiccollection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Music Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.MusicCollection#getCategorizedelements <em>Categorizedelements</em>}</li>
 *   <li>{@link musiccollection.MusicCollection#getName <em>Name</em>}</li>
 *   <li>{@link musiccollection.MusicCollection#getPlaylist <em>Playlist</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getMusicCollection()
 * @model
 * @generated
 */
public interface MusicCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorizedelements</b></em>' containment reference list.
	 * The list contents are of type {@link musiccollection.CategorizedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorizedelements</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getMusicCollection_Categorizedelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategorizedElement> getCategorizedelements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musiccollection.MusiccollectionPackage#getMusicCollection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musiccollection.MusicCollection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Playlist</b></em>' containment reference list.
	 * The list contents are of type {@link musiccollection.Playlist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playlist</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getMusicCollection_Playlist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Playlist> getPlaylist();

} // MusicCollection
