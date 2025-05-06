/**
 */
package collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import pbconfig.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link collection.CollectionRoot#getCollection <em>Collection</em>}</li>
 *   <li>{@link collection.CollectionRoot#getArtist <em>Artist</em>}</li>
 *   <li>{@link collection.CollectionRoot#getCategories <em>Categories</em>}</li>
 *   <li>{@link collection.CollectionRoot#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link collection.CollectionRoot#getDefaultConfig <em>Default Config</em>}</li>
 * </ul>
 *
 * @see collection.CollectionPackage#getCollectionRoot()
 * @model
 * @generated
 */
public interface CollectionRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Collection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollectionRoot_Collection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollection();

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Artist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollectionRoot_Artist()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artist> getArtist();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link collection.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see collection.CollectionPackage#getCollectionRoot_Categories()
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
	 * @see collection.CollectionPackage#getCollectionRoot_Configuration()
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
	 * @see collection.CollectionPackage#getCollectionRoot_DefaultConfig()
	 * @model required="true"
	 * @generated
	 */
	Configuration getDefaultConfig();

	/**
	 * Sets the value of the '{@link collection.CollectionRoot#getDefaultConfig <em>Default Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Config</em>' reference.
	 * @see #getDefaultConfig()
	 * @generated
	 */
	void setDefaultConfig(Configuration value);

} // CollectionRoot
