/**
 */
package muslan.queue;

import collection.Track;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link muslan.queue.Queue#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @see muslan.queue.QueuePackage#getQueue()
 * @model
 * @generated
 */
public interface Queue extends EObject {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link collection.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see muslan.queue.QueuePackage#getQueue_Tracks()
	 * @model
	 * @generated
	 */
	EList<Track> getTracks();

} // Queue
