/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaccion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getESTADO_TRANSACCION <em>ESTADO TRANSACCION</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getHORA <em>HORA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getTIPO <em>TIPO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getDESCRIPCION <em>DESCRIPCION</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getCATEGORIA <em>CATEGORIA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getVALOR <em>VALOR</em>}</li>
 * </ul>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion()
 * @model
 * @generated
 */
public interface Transaccion extends ElementoModeloResultado {
	/**
	 * Returns the value of the '<em><b>ESTADO TRANSACCION</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESTADO TRANSACCION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESTADO TRANSACCION</em>' attribute.
	 * @see #setESTADO_TRANSACCION(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_ESTADO_TRANSACCION()
	 * @model default="false"
	 * @generated
	 */
	String getESTADO_TRANSACCION();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getESTADO_TRANSACCION <em>ESTADO TRANSACCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESTADO TRANSACCION</em>' attribute.
	 * @see #getESTADO_TRANSACCION()
	 * @generated
	 */
	void setESTADO_TRANSACCION(String value);

	/**
	 * Returns the value of the '<em><b>HORA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HORA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HORA</em>' attribute.
	 * @see #setHORA(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_HORA()
	 * @model
	 * @generated
	 */
	Integer getHORA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getHORA <em>HORA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HORA</em>' attribute.
	 * @see #getHORA()
	 * @generated
	 */
	void setHORA(Integer value);

	/**
	 * Returns the value of the '<em><b>TIPO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TIPO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TIPO</em>' attribute.
	 * @see #setTIPO(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_TIPO()
	 * @model
	 * @generated
	 */
	String getTIPO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getTIPO <em>TIPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TIPO</em>' attribute.
	 * @see #getTIPO()
	 * @generated
	 */
	void setTIPO(String value);

	/**
	 * Returns the value of the '<em><b>DESCRIPCION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DESCRIPCION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DESCRIPCION</em>' attribute.
	 * @see #setDESCRIPCION(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_DESCRIPCION()
	 * @model
	 * @generated
	 */
	String getDESCRIPCION();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getDESCRIPCION <em>DESCRIPCION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESCRIPCION</em>' attribute.
	 * @see #getDESCRIPCION()
	 * @generated
	 */
	void setDESCRIPCION(String value);

	/**
	 * Returns the value of the '<em><b>CATEGORIA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CATEGORIA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CATEGORIA</em>' attribute.
	 * @see #setCATEGORIA(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_CATEGORIA()
	 * @model
	 * @generated
	 */
	String getCATEGORIA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getCATEGORIA <em>CATEGORIA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CATEGORIA</em>' attribute.
	 * @see #getCATEGORIA()
	 * @generated
	 */
	void setCATEGORIA(String value);

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
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

	/**
	 * Returns the value of the '<em><b>VALOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VALOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VALOR</em>' attribute.
	 * @see #setVALOR(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getTransaccion_VALOR()
	 * @model
	 * @generated
	 */
	Integer getVALOR();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion#getVALOR <em>VALOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VALOR</em>' attribute.
	 * @see #getVALOR()
	 * @generated
	 */
	void setVALOR(Integer value);

} // Transaccion
