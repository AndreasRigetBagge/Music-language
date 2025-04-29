/**
 */
package playlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link playlist.Playlist#getPlayitem <em>Playitem</em>}</li>
 *   <li>{@link playlist.Playlist#getConfigurationreference <em>Configurationreference</em>}</li>
 *   <li>{@link playlist.Playlist#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see playlist.PlaylistPackage#getPlaylist()
 * @model abstract="true"
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Playitem</b></em>' containment reference list.
	 * The list contents are of type {@link playlist.PlayItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playitem</em>' containment reference list.
	 * @see playlist.PlaylistPackage#getPlaylist_Playitem()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayItem> getPlayitem();

	/**
	 * Returns the value of the '<em><b>Configurationreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurationreference</em>' containment reference.
	 * @see #setConfigurationreference(ConfigurationReference)
	 * @see playlist.PlaylistPackage#getPlaylist_Configurationreference()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationReference getConfigurationreference();

	/**
	 * Sets the value of the '{@link playlist.Playlist#getConfigurationreference <em>Configurationreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurationreference</em>' containment reference.
	 * @see #getConfigurationreference()
	 * @generated
	 */
	void setConfigurationreference(ConfigurationReference value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Collection)
	 * @see playlist.PlaylistPackage#getPlaylist_Collection()
	 * @model required="true"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link playlist.Playlist#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

} // Playlist
