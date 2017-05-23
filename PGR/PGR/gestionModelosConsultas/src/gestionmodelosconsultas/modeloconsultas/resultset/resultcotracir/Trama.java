/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getCADENA_TRAMA <em>CADENA TRAMA</em>}</li>
 * </ul>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTrama()
 * @model
 * @generated
 */
public interface Trama extends ElementoModeloResultado {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTrama_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

	/**
	 * Returns the value of the '<em><b>CADENA TRAMA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CADENA TRAMA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CADENA TRAMA</em>' attribute.
	 * @see #setCADENA_TRAMA(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTrama_CADENA_TRAMA()
	 * @model
	 * @generated
	 */
	String getCADENA_TRAMA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama#getCADENA_TRAMA <em>CADENA TRAMA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CADENA TRAMA</em>' attribute.
	 * @see #getCADENA_TRAMA()
	 * @generated
	 */
	void setCADENA_TRAMA(String value);

} // Trama
