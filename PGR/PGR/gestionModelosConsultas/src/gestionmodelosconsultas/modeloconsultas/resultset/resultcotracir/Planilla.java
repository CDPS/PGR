/**
 */
package gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getID <em>ID</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNUMERO_MOVIL <em>NUMERO MOVIL</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getFECHA <em>FECHA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA_CONDUCTOR <em>CEDULA CONDUCTOR</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCONDUCTOR <em>CONDUCTOR</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL <em>TOTAL</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_NETO <em>TOTAL RECAUDO NETO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_DEPOSITO <em>TOTAL DEPOSITO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_GASTOS <em>TOTAL GASTOS</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getLIQUIDADO <em>LIQUIDADO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getUSUARIO <em>USUARIO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNOMBRE_PERSONA <em>NOMBRE PERSONA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getAPELLIDO <em>APELLIDO</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA <em>CEDULA</em>}</li>
 *   <li>{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getHORA_MODIFICACION <em>HORA MODIFICACION</em>}</li>
 * </ul>
 *
 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla()
 * @model
 * @generated
 */
public interface Planilla extends ElementoModeloResultado {
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
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_ID()
	 * @model
	 * @generated
	 */
	Integer getID();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(Integer value);

	/**
	 * Returns the value of the '<em><b>NUMERO MOVIL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NUMERO MOVIL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NUMERO MOVIL</em>' attribute.
	 * @see #setNUMERO_MOVIL(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_NUMERO_MOVIL()
	 * @model
	 * @generated
	 */
	String getNUMERO_MOVIL();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNUMERO_MOVIL <em>NUMERO MOVIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUMERO MOVIL</em>' attribute.
	 * @see #getNUMERO_MOVIL()
	 * @generated
	 */
	void setNUMERO_MOVIL(String value);

	/**
	 * Returns the value of the '<em><b>FECHA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FECHA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FECHA</em>' attribute.
	 * @see #setFECHA(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_FECHA()
	 * @model
	 * @generated
	 */
	String getFECHA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getFECHA <em>FECHA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FECHA</em>' attribute.
	 * @see #getFECHA()
	 * @generated
	 */
	void setFECHA(String value);

	/**
	 * Returns the value of the '<em><b>CEDULA CONDUCTOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEDULA CONDUCTOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEDULA CONDUCTOR</em>' attribute.
	 * @see #setCEDULA_CONDUCTOR(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_CEDULA_CONDUCTOR()
	 * @model
	 * @generated
	 */
	String getCEDULA_CONDUCTOR();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA_CONDUCTOR <em>CEDULA CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEDULA CONDUCTOR</em>' attribute.
	 * @see #getCEDULA_CONDUCTOR()
	 * @generated
	 */
	void setCEDULA_CONDUCTOR(String value);

	/**
	 * Returns the value of the '<em><b>CONDUCTOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CONDUCTOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONDUCTOR</em>' attribute.
	 * @see #setCONDUCTOR(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_CONDUCTOR()
	 * @model
	 * @generated
	 */
	String getCONDUCTOR();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCONDUCTOR <em>CONDUCTOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONDUCTOR</em>' attribute.
	 * @see #getCONDUCTOR()
	 * @generated
	 */
	void setCONDUCTOR(String value);

	/**
	 * Returns the value of the '<em><b>TOTAL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOTAL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOTAL</em>' attribute.
	 * @see #setTOTAL(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_TOTAL()
	 * @model
	 * @generated
	 */
	Integer getTOTAL();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL <em>TOTAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOTAL</em>' attribute.
	 * @see #getTOTAL()
	 * @generated
	 */
	void setTOTAL(Integer value);

	/**
	 * Returns the value of the '<em><b>TOTAL RECAUDO BRUTO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOTAL RECAUDO BRUTO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOTAL RECAUDO BRUTO</em>' attribute.
	 * @see #setTOTAL_RECAUDO_BRUTO(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_TOTAL_RECAUDO_BRUTO()
	 * @model
	 * @generated
	 */
	Integer getTOTAL_RECAUDO_BRUTO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_BRUTO <em>TOTAL RECAUDO BRUTO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOTAL RECAUDO BRUTO</em>' attribute.
	 * @see #getTOTAL_RECAUDO_BRUTO()
	 * @generated
	 */
	void setTOTAL_RECAUDO_BRUTO(Integer value);

	/**
	 * Returns the value of the '<em><b>TOTAL RECAUDO NETO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOTAL RECAUDO NETO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOTAL RECAUDO NETO</em>' attribute.
	 * @see #setTOTAL_RECAUDO_NETO(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_TOTAL_RECAUDO_NETO()
	 * @model
	 * @generated
	 */
	Integer getTOTAL_RECAUDO_NETO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_RECAUDO_NETO <em>TOTAL RECAUDO NETO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOTAL RECAUDO NETO</em>' attribute.
	 * @see #getTOTAL_RECAUDO_NETO()
	 * @generated
	 */
	void setTOTAL_RECAUDO_NETO(Integer value);

	/**
	 * Returns the value of the '<em><b>TOTAL DEPOSITO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOTAL DEPOSITO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOTAL DEPOSITO</em>' attribute.
	 * @see #setTOTAL_DEPOSITO(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_TOTAL_DEPOSITO()
	 * @model
	 * @generated
	 */
	Integer getTOTAL_DEPOSITO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_DEPOSITO <em>TOTAL DEPOSITO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOTAL DEPOSITO</em>' attribute.
	 * @see #getTOTAL_DEPOSITO()
	 * @generated
	 */
	void setTOTAL_DEPOSITO(Integer value);

	/**
	 * Returns the value of the '<em><b>TOTAL GASTOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOTAL GASTOS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOTAL GASTOS</em>' attribute.
	 * @see #setTOTAL_GASTOS(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_TOTAL_GASTOS()
	 * @model
	 * @generated
	 */
	Integer getTOTAL_GASTOS();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getTOTAL_GASTOS <em>TOTAL GASTOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOTAL GASTOS</em>' attribute.
	 * @see #getTOTAL_GASTOS()
	 * @generated
	 */
	void setTOTAL_GASTOS(Integer value);

	/**
	 * Returns the value of the '<em><b>LIQUIDADO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LIQUIDADO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LIQUIDADO</em>' attribute.
	 * @see #setLIQUIDADO(Boolean)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_LIQUIDADO()
	 * @model
	 * @generated
	 */
	Boolean getLIQUIDADO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getLIQUIDADO <em>LIQUIDADO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LIQUIDADO</em>' attribute.
	 * @see #getLIQUIDADO()
	 * @generated
	 */
	void setLIQUIDADO(Boolean value);

	/**
	 * Returns the value of the '<em><b>USUARIO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>USUARIO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>USUARIO</em>' attribute.
	 * @see #setUSUARIO(Integer)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_USUARIO()
	 * @model
	 * @generated
	 */
	Integer getUSUARIO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getUSUARIO <em>USUARIO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USUARIO</em>' attribute.
	 * @see #getUSUARIO()
	 * @generated
	 */
	void setUSUARIO(Integer value);

	/**
	 * Returns the value of the '<em><b>NOMBRE PERSONA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NOMBRE PERSONA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOMBRE PERSONA</em>' attribute.
	 * @see #setNOMBRE_PERSONA(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_NOMBRE_PERSONA()
	 * @model
	 * @generated
	 */
	String getNOMBRE_PERSONA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getNOMBRE_PERSONA <em>NOMBRE PERSONA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOMBRE PERSONA</em>' attribute.
	 * @see #getNOMBRE_PERSONA()
	 * @generated
	 */
	void setNOMBRE_PERSONA(String value);

	/**
	 * Returns the value of the '<em><b>APELLIDO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APELLIDO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APELLIDO</em>' attribute.
	 * @see #setAPELLIDO(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_APELLIDO()
	 * @model
	 * @generated
	 */
	String getAPELLIDO();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getAPELLIDO <em>APELLIDO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APELLIDO</em>' attribute.
	 * @see #getAPELLIDO()
	 * @generated
	 */
	void setAPELLIDO(String value);

	/**
	 * Returns the value of the '<em><b>CEDULA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CEDULA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CEDULA</em>' attribute.
	 * @see #setCEDULA(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_CEDULA()
	 * @model
	 * @generated
	 */
	String getCEDULA();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getCEDULA <em>CEDULA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CEDULA</em>' attribute.
	 * @see #getCEDULA()
	 * @generated
	 */
	void setCEDULA(String value);

	/**
	 * Returns the value of the '<em><b>HORA MODIFICACION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HORA MODIFICACION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HORA MODIFICACION</em>' attribute.
	 * @see #setHORA_MODIFICACION(String)
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirPackage#getPlanilla_HORA_MODIFICACION()
	 * @model
	 * @generated
	 */
	String getHORA_MODIFICACION();

	/**
	 * Sets the value of the '{@link gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla#getHORA_MODIFICACION <em>HORA MODIFICACION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HORA MODIFICACION</em>' attribute.
	 * @see #getHORA_MODIFICACION()
	 * @generated
	 */
	void setHORA_MODIFICACION(String value);

} // Planilla
