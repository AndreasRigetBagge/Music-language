/**
 */
package musiccollection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pbconfig.Configuration;

import query.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.Playlist#getName <em>Name</em>}</li>
 *   <li>{@link musiccollection.Playlist#getQuery <em>Query</em>}</li>
 *   <li>{@link musiccollection.Playlist#getTrack <em>Track</em>}</li>
 *   <li>{@link musiccollection.Playlist#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see musiccollection.MusiccollectionPackage#getPlaylist_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link musiccollection.Playlist#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' containment reference list.
	 * The list contents are of type {@link query.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getPlaylist_Query()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQuery();

	/**
	 * Returns the value of the '<em><b>Track</b></em>' reference list.
	 * The list contents are of type {@link musiccollection.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' reference list.
	 * @see musiccollection.MusiccollectionPackage#getPlaylist_Track()
	 * @model
	 * @generated
	 */
	EList<Track> getTrack();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see musiccollection.MusiccollectionPackage#getPlaylist_Configuration()
	 * @model
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link musiccollection.Playlist#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // Playlist
