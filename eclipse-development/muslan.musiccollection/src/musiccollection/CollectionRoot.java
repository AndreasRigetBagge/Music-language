/**
 */
package musiccollection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pbconfig.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link musiccollection.CollectionRoot#getMusiccollection <em>Musiccollection</em>}</li>
 *   <li>{@link musiccollection.CollectionRoot#getArtist <em>Artist</em>}</li>
 *   <li>{@link musiccollection.CollectionRoot#getCategories <em>Categories</em>}</li>
 *   <li>{@link musiccollection.CollectionRoot#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link musiccollection.CollectionRoot#getDefaultConfig <em>Default Config</em>}</li>
 * </ul>
 *
 * @see musiccollection.MusiccollectionPackage#getCollectionRoot()
 * @model
 * @generated
 */
public interface CollectionRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Musiccollection</b></em>' containment reference list.
	 * The list contents are of type {@link musiccollection.MusicCollection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Musiccollection</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getCollectionRoot_Musiccollection()
	 * @model containment="true"
	 * @generated
	 */
	EList<MusicCollection> getMusiccollection();

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference list.
	 * The list contents are of type {@link musiccollection.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getCollectionRoot_Artist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artist> getArtist();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link musiccollection.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getCollectionRoot_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link pbconfig.Configuration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see musiccollection.MusiccollectionPackage#getCollectionRoot_Configuration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

	/**
	 * Returns the value of the '<em><b>Default Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Config</em>' reference.
	 * @see #setDefaultConfig(Configuration)
	 * @see musiccollection.MusiccollectionPackage#getCollectionRoot_DefaultConfig()
	 * @model required="true"
	 * @generated
	 */
	Configuration getDefaultConfig();

	/**
	 * Sets the value of the '{@link musiccollection.CollectionRoot#getDefaultConfig <em>Default Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Config</em>' reference.
	 * @see #getDefaultConfig()
	 * @generated
	 */
	void setDefaultConfig(Configuration value);

} // CollectionRoot
