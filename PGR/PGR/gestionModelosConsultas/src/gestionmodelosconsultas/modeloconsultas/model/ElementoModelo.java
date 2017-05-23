/**
 */
package gestionmodelosconsultas.modeloconsultas.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento Modelo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getFrom <em>From</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoModelo()
 * @model
 * @generated
 */
public interface ElementoModelo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoModelo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoModelo_From()
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<ElementoModelo> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo}.
	 * It is bidirectional and its opposite is '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ModelPackage#getElementoModelo_To()
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoModelo#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<ElementoModelo> getTo();

} // ElementoModelo
