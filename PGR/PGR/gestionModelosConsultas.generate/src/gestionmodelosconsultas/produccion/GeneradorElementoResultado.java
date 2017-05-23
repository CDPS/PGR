package gestionmodelosconsultas.produccion;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Consolidado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Detallado;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Planilla;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Propietario;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.ResultcotracirFactory;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Trama;
import gestionmodelosconsultas.modeloconsultas.resultset.resultcotracir.Transaccion;
import gestionmodelosconsultas.world.Hijo;
import gestionmodelosconsultas.world.Padre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GeneradorElementoResultado {

	/**
	 * Crea el resultado de la consulta
	 * @param resultado
	 * @param padresMap
	 * @param hijosMap
	 * @return
	 */
	public Resultado crearResultado(Resultado resultado,
			HashMap<String, Padre> padresMap, ArrayList<Hijo> hijosMap, int orderSize) {
		// TODO Auto-generated method stub
		String caminoActual="";
//		resultado = (resultado, padresMap);
		for (Padre padre : padresMap.values()) {
			caminoActual= padre.getId();
			int nivel=1;
			ElementoModeloResultado elementoPadre = crearPadre(padre, nivel, orderSize, caminoActual, hijosMap);
			elementoPadre.setResultado(resultado);
		}
		return resultado;
	}

	/**
	 * Crea el Padre
	 * @param padre
	 * @param nivel
	 * @param orderSize
	 * @param caminoActual
	 * @return
	 */
	private ElementoModeloResultado crearPadre(Padre padre, int nivel,
			int orderSize, String caminoActual, ArrayList<Hijo> hijos) {
		// TODO Auto-generated method stub
		//crear elemento
		
		switch (padre.getElemento()) {
			
			case "transaccion":
				Transaccion transaccion = ResultcotracirFactory.eINSTANCE.createTransaccion();
				transaccion = crearTransaccion(padre.getCampos(), transaccion);
				transaccion.setKey(padre.getId());
				if( nivel<orderSize){
					nivel++;
					transaccion = (Transaccion) crearHijos(transaccion, nivel, caminoActual, orderSize, hijos);
				}
				return transaccion;
				
			case "trama":
				Trama trama= ResultcotracirFactory.eINSTANCE.createTrama();
				trama = crearTrama(padre.getCampos(),trama);
				trama.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					trama = (Trama) crearHijos(trama, nivel, caminoActual, orderSize, hijos);
				}
				return trama;
			case "planilla":
				Planilla planilla = ResultcotracirFactory.eINSTANCE.createPlanilla();
				planilla = crearPlanilla(padre.getCampos(), planilla);
				planilla.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					planilla = (Planilla) crearHijos(planilla, nivel, caminoActual, orderSize, hijos);
				}
				return planilla;
			case "detallado":
				Detallado detallado = ResultcotracirFactory.eINSTANCE.createDetallado();
				detallado = crearDetallado(padre.getCampos(), detallado);
				detallado.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					detallado = (Detallado) crearHijos(detallado, nivel, caminoActual, orderSize, hijos);
				}
				return detallado;
			case "propietario":
				Propietario pro = ResultcotracirFactory.eINSTANCE.createPropietario();
				pro = crearPropietario(padre.getCampos(), pro);
				pro.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					pro = (Propietario) crearHijos(pro, nivel, caminoActual, orderSize, hijos);
				}
				return pro;
				
			case "consolidado":
				Consolidado consolidado = ResultcotracirFactory.eINSTANCE.createConsolidado();
				consolidado = crearConsolidado(padre.getCampos(), consolidado);
				consolidado.setKey(padre.getId());
				if( nivel<orderSize){
					nivel ++;
					consolidado = (Consolidado) crearHijos(consolidado, nivel, caminoActual, orderSize, hijos);
				}
				return consolidado;
		
		default:
			return null;
		}
		
		
	}

	/**
	 * Crea los hijos
	 * @param nivel
	 * @param caminoActual
	 * @param orderSize
	 * @param hijos
	 */
	private ElementoModeloResultado crearHijos(ElementoModeloResultado padre, int nivel, String caminoActual, int orderSize,
			ArrayList<Hijo> hijos) {
		// TODO Auto-generated method stub
		String caminoTemporal = caminoActual;
		for(Hijo hijo : hijos){
			
			caminoActual += "-"+hijo.getId();
			if(hijo.getCamino().equals(caminoActual)){
				
				ElementoModeloResultado elemento = crearElementoHijo(hijo, nivel, orderSize, caminoActual, hijos);
				elemento.setElementoModeloResultado(padre);
				caminoActual =caminoTemporal;
				
			}else{
				caminoActual = caminoTemporal;
			}
		}
		return padre;
	}

	/**
	 * se crea un elemento Hijo
	 * @param nivel
	 * @param orderSize
	 * @param caminoActual
	 * @return
	 */
	private ElementoModeloResultado crearElementoHijo(Hijo hijo, int nivel, int orderSize,
			String caminoActual, ArrayList<Hijo> hijos) {
		
		switch (hijo.getElemento()) {
						
			case "trama":
				Trama trama= ResultcotracirFactory.eINSTANCE.createTrama();
				trama = crearTrama(hijo.getCampos(),trama);
				trama.setKey(hijo.getId());
				if( nivel<orderSize){
					nivel ++;
					trama = (Trama) crearHijos(trama, nivel, caminoActual, orderSize, hijos);
				}
				return trama;
			case "planilla":
				Planilla planilla = ResultcotracirFactory.eINSTANCE.createPlanilla();
				planilla = crearPlanilla(hijo.getCampos(), planilla);
				planilla.setKey(hijo.getId());
				if( nivel<orderSize){
					nivel ++;
					planilla = (Planilla) crearHijos(planilla, nivel, caminoActual, orderSize, hijos);
				}
				return planilla;
			case "detallado":
				Detallado detallado = ResultcotracirFactory.eINSTANCE.createDetallado();
				detallado = crearDetallado(hijo.getCampos(), detallado);
				detallado.setKey(hijo.getId());
				if( nivel<orderSize){
					nivel ++;
					detallado = (Detallado) crearHijos(detallado, nivel, caminoActual, orderSize, hijos);
				}
				return detallado;
			case "propietario":
				Propietario pro = ResultcotracirFactory.eINSTANCE.createPropietario();
				pro = crearPropietario(hijo.getCampos(), pro);
				pro.setKey(hijo.getId());
				if( nivel<orderSize){
					nivel ++;
					pro = (Propietario) crearHijos(pro, nivel, caminoActual, orderSize, hijos);
				}
				return pro;
				
			case "consolidado":
				Consolidado consolidado = ResultcotracirFactory.eINSTANCE.createConsolidado();
				consolidado = crearConsolidado(hijo.getCampos(), consolidado);
				consolidado.setKey(hijo.getId());
				if( nivel<orderSize){
					nivel ++;
					consolidado = (Consolidado) crearHijos(consolidado, nivel, caminoActual, orderSize, hijos);
				}
				return consolidado;
			
		default:
			return null;
		}
	}
	
	private Transaccion crearTransaccion(ArrayList<String[]> campos, Transaccion transaccion) {
		// TODO Auto-generated method stub
		
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					transaccion.setID(new Integer(campoTemp[1]));
				else
					transaccion.setID(0);
			}
			if(campoTemp[0].equals("ESTADO_TRANSACCION")){
				if(campoTemp[1] != null)
					transaccion.setESTADO_TRANSACCION(campoTemp[1]);
				else
					transaccion.setESTADO_TRANSACCION("");
			}
			if(campoTemp[0].equals("HORA")){
				if(campoTemp[1] != null)
					transaccion.setHORA(new Integer(campoTemp[1]));
				else
					transaccion.setHORA(0);
			}
			if(campoTemp[0].equals("TIPO")){
				if(campoTemp[1] != null)
					transaccion.setTIPO(campoTemp[1]);
				else
					transaccion.setTIPO("");
			}
			if(campoTemp[0].equals("DESCRIPCION")){
				if(campoTemp[1] != null)
					transaccion.setDESCRIPCION(campoTemp[1]);
				else
					transaccion.setDESCRIPCION("");
			}
			if(campoTemp[0].equals("CATEGORIA")){
				if(campoTemp[1] != null)
					transaccion.setCATEGORIA(campoTemp[1]);
				else
					transaccion.setCATEGORIA("");
			}
			if(campoTemp[0].equals("VALOR")){
				if(campoTemp[1] != null)
					transaccion.setVALOR(new Integer(campoTemp[1]));
				else
					transaccion.setVALOR(0);
			}
		}
		return transaccion;
	}

	private Trama crearTrama(ArrayList<String[]> campos, Trama trama) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					trama.setID(new Integer(campoTemp[1]));
				else
					trama.setID(0);
			}
			if(campoTemp[0].equals("CADENA_TRAMA")){
				if(campoTemp[1] != null)
					trama.setCADENA_TRAMA(campoTemp[1]);
				else
					trama.setCADENA_TRAMA("");
			}
		}
		return trama;
	}

	
	private Planilla crearPlanilla(ArrayList<String[]> campos, Planilla planilla) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					planilla.setID(new Integer(campoTemp[1]));
				else
					planilla.setID(0);
			}
			if(campoTemp[0].equals("NUMERO_MOVIL")){
				if(campoTemp[1] != null)
					planilla.setNUMERO_MOVIL(campoTemp[1]);
				else
					planilla.setNUMERO_MOVIL("");
			}
			if(campoTemp[0].equals("FECHA")){
				if(campoTemp[1] != null)
					planilla.setFECHA(campoTemp[1]);
				else
					planilla.setFECHA("");
			}
			if(campoTemp[0].equals("CEDULA_CONDUCTOR")){
				if(campoTemp[1] != null)
					planilla.setCEDULA_CONDUCTOR(campoTemp[1]);
				else
					planilla.setCEDULA_CONDUCTOR("");
			}
			if(campoTemp[0].equals("CONDUCTOR")){
				if(campoTemp[1] != null)
					planilla.setCONDUCTOR(campoTemp[1]);
				else
					planilla.setCONDUCTOR("");
			}
			if(campoTemp[0].equals("TOTAL")){
				if(campoTemp[1] != null)
					planilla.setTOTAL(new Integer(campoTemp[1]));
				else
					planilla.setTOTAL(0);
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_BRUTO")){
				if(campoTemp[1] != null)
					planilla.setTOTAL_RECAUDO_BRUTO(new Integer(campoTemp[1]));
				else
					planilla.setTOTAL_RECAUDO_BRUTO(0);
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_NETO")){
				if(campoTemp[1] != null)
					planilla.setTOTAL_RECAUDO_NETO(new Integer(campoTemp[1]));
				else
					planilla.setTOTAL_RECAUDO_NETO(0);
			}
			if(campoTemp[0].equals("TOTAL_DEPOSITO")){
				if(campoTemp[1] != null)
					planilla.setTOTAL_DEPOSITO(new Integer(campoTemp[1]));
				else
					planilla.setTOTAL_DEPOSITO(0);
			}
			if(campoTemp[0].equals("TOTAL_GASTOS")){
				if(campoTemp[1] != null)
					planilla.setTOTAL_GASTOS(new Integer(campoTemp[1]));
				else
					planilla.setTOTAL_GASTOS(0);
			}
			if(campoTemp[0].equals("LIQUIDADO")){
				if(campoTemp[1] != null) {
					if(campoTemp[1].equals("0"))
						planilla.setLIQUIDADO(false);
					else
						planilla.setLIQUIDADO(true);	
				} else
					planilla.setLIQUIDADO(false);
			}
			if(campoTemp[0].equals("USUARIO")){
				if(campoTemp[1] != null)
					planilla.setUSUARIO(new Integer(campoTemp[1]));
				else
					planilla.setUSUARIO(0);
			}
			if(campoTemp[0].equals("NOMBRE_PERSONA")){
				if(campoTemp[1] != null)
					planilla.setNOMBRE_PERSONA(campoTemp[1]);
				else
					planilla.setNOMBRE_PERSONA("");
			}
			if(campoTemp[0].equals("APELLIDO")){
				if(campoTemp[1] != null)
					planilla.setAPELLIDO(campoTemp[1]);
				else
					planilla.setAPELLIDO("");
			}
			if(campoTemp[0].equals("CEDULA")){
				if(campoTemp[1] != null)
					planilla.setCEDULA(campoTemp[1]);
				else
					planilla.setCEDULA("");
			}
			if(campoTemp[0].equals("HORA_MODIFICACION")){
				if(campoTemp[1] != null)
					planilla.setHORA_MODIFICACION(campoTemp[1]);
				else
					planilla.setHORA_MODIFICACION("");
			}
		}
		return planilla;
	}
	
	
	private Detallado crearDetallado(ArrayList<String[]> campos, Detallado detallado) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					detallado.setID(new Integer(campoTemp[1]));
				else
					detallado.setID(0);
			}
			if(campoTemp[0].equals("NOMBRE")){
				if(campoTemp[1] != null)
					detallado.setNOMBRE(campoTemp[1]);
				else
					detallado.setNOMBRE("");
			}
			if(campoTemp[0].equals("REGISTRO")){
				if(campoTemp[1] != null)
					detallado.setREGISTRO(new Integer(campoTemp[1]));
				else {
					detallado.setREGISTRO(0);
				}
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_TARIFA")){
				if(campoTemp[1] != null)
					detallado.setTOTAL_RECAUDO_TARIFA(new Integer(campoTemp[1]));
				else
					detallado.setTOTAL_RECAUDO_TARIFA(0);
			}
			if(campoTemp[0].equals("REGISTRO_RECAUDO")){
				if(campoTemp[1] != null)
					detallado.setREGISTRO_RECAUDO(new Integer(campoTemp[1]));
				else
					detallado.setREGISTRO_RECAUDO(0);
			}
			if(campoTemp[0].equals("COSTO_TARIFA")){
				if(campoTemp[1] != null)
					detallado.setCOSTO_TARIFA(new Integer(campoTemp[1]));
				else
					detallado.setCOSTO_TARIFA(0);
			}
		}
		return detallado;
	}
	
	private Propietario crearPropietario(ArrayList<String[]> campos, Propietario propietario) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					propietario.setID(new Integer(campoTemp[1]));
				else
					propietario.setID(0);
			}
			if(campoTemp[0].equals("NOMBRE")){
				if(campoTemp[1] != null)
					propietario.setNOMBRE(campoTemp[1]);
				else
					propietario.setNOMBRE("");
			}
			if(campoTemp[0].equals("CEDULA")){
				if(campoTemp[1] != null)
					propietario.setCEDULA(campoTemp[1]);
				else
					propietario.setCEDULA("");
			}
		}
		return propietario;
	}
	
	private Consolidado crearConsolidado(ArrayList<String[]> campos, Consolidado consolidado) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			if(campoTemp[0].equals("ID")){
				if(campoTemp[1] != null)
					consolidado.setID(new Integer(campoTemp[1]));
				else
					consolidado.setID(0);
			}
			if(campoTemp[0].equals("RUTA_DESPACHO")){
				if(campoTemp[1] != null)
					consolidado.setRUTA_DESPACHO(campoTemp[1]);
				else
					consolidado.setRUTA_DESPACHO("");
			}
			if(campoTemp[0].equals("HORA_DESPACHO")){
				if(campoTemp[1] != null)
					consolidado.setHORA_DESPACHO(new Integer(campoTemp[1]));
				else
					consolidado.setHORA_DESPACHO(0);
			}
			if(campoTemp[0].equals("REGISTRO_CONSOLIDADO")){
				if(campoTemp[1] != null)
					consolidado.setREGISTRO_CONSOLIDADO(campoTemp[1]);
				else
					consolidado.setREGISTRO_CONSOLIDADO("");
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_BRUTO")){
				if(campoTemp[1] != null)
					consolidado.setTOTAL_RECAUDO_BRUTO(new Integer(campoTemp[1]));
				else
					consolidado.setTOTAL_RECAUDO_BRUTO(0);
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_DESPACHO")){
				if(campoTemp[1] != null)
					consolidado.setTOTAL_RECAUDO_DESPACHO(new Integer(campoTemp[1]));
				else
					consolidado.setTOTAL_RECAUDO_DESPACHO(0);
			}
			if(campoTemp[0].equals("ESTADO_CONSOLIDADO")){
				if(campoTemp[1] != null)
					consolidado.setESTADO_CONSOLIDADO(campoTemp[1]);
				else
					consolidado.setESTADO_CONSOLIDADO("");
			}
			if(campoTemp[0].equals("ESTADO_IMPRESION")){
				if(campoTemp[1] != null)
					consolidado.setESTADO_IMPRESION(campoTemp[1]);
				else
					consolidado.setESTADO_IMPRESION("");
			}
		}
		return consolidado;
	}
}
