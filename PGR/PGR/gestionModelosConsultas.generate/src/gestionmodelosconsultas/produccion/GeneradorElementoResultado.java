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
				transaccion.setID(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("ESTADO_TRANSACCION")){
				transaccion.setESTADO_TRANSACCION(campoTemp[1]);
			}
			if(campoTemp[0].equals("HORA")){
				transaccion.setHORA(new Integer(campoTemp[1]) );
			}
			if(campoTemp[0].equals("TIPO")){
				transaccion.setTIPO(campoTemp[1]);
			}
			if(campoTemp[0].equals("DESCRIPCION")){
				transaccion.setDESCRIPCION(campoTemp[1]);
			}
			if(campoTemp[0].equals("CATEGORIA")){
				transaccion.setCATEGORIA(campoTemp[1]);
			}
			if(campoTemp[0].equals("VALOR")){
				transaccion.setVALOR(new Integer(campoTemp[1]));
			}
		}
		return transaccion;
	}

	private Trama crearTrama(ArrayList<String[]> campos, Trama trama) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			if(campoTemp[0].equals("ID")){
				trama.setID(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("CADENA_TRAMA")){
				trama.setCADENA_TRAMA(campoTemp[1]);
			}
		}
		return trama;
	}

	
	private Planilla crearPlanilla(ArrayList<String[]> campos, Planilla planilla) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				planilla.setID(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("NUMERO_MOVIL")){
				planilla.setNUMERO_MOVIL(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("FECHA")){
				planilla.setFECHA(campoTemp[1]);
			}
					
			if(campoTemp[0].equals("CEDULA_CONDUCTOR")){
				planilla.setCEDULA_CONDUCTOR(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("CONDUCTOR")){
				planilla.setCONDUCTOR(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("TOTAL")){
				planilla.setTOTAL(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("TOTAL_RECAUDO_BRUTO")){
				planilla.setTOTAL_RECAUDO_BRUTO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("TOTAL_RECAUDO_NETO")){
				planilla.setTOTAL_RECAUDO_NETO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("TOTAL_DEPOSITO")){
				planilla.setTOTAL_DEPOSITO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("TOTAL_GASTOS")){
				planilla.setTOTAL_GASTOS(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("LIQUIDADO")){
				planilla.setLIQUIDADO(new Boolean(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("USUARIO")){
				planilla.setUSUARIO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("NOMBRE_PERSONA")){
				planilla.setNOMBRE_PERSONA(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("APELLIDO")){
				planilla.setAPELLIDO(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("CEDULA")){
				planilla.setCEDULA(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("HORA_MODIFICACION")){
				planilla.setHORA_MODIFICACION(campoTemp[1]);
			}
		}
		return planilla;
	}
	
	
	private Detallado crearDetallado(ArrayList<String[]> campos, Detallado detallado) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				detallado.setID(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("NOMBRE")){
				detallado.setNOMBRE(campoTemp[1]);
			}
			if(campoTemp[0].equals("REGISTRO")){
				detallado.setREGISTRO(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("TOTAL_RECAUDO_TARIFA")){
				detallado.setTOTAL_RECAUDO_TARIFA(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("REGISTRO_RECAUDO")){
				detallado.setREGISTRO_RECAUDO(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("COSTO_TARIFA")){
				detallado.setCOSTO_TARIFA(new Integer(campoTemp[1]));
			}
		}
		return detallado;
	}
	
	private Propietario crearPropietario(ArrayList<String[]> campos, Propietario propietario) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				propietario.setID(new Integer(campoTemp[1]));
			}
			if(campoTemp[0].equals("NOMBRE")){
				propietario.setNOMBRE(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("CEDULA")){
				propietario.setCEDULA(campoTemp[1]);
			}
		}
		return propietario;
	}
	
	private Consolidado crearConsolidado(ArrayList<String[]> campos, Consolidado consolidado) {
		// TODO Auto-generated method stub
		for(String[] campoTemp: campos){
			
			if(campoTemp[0].equals("ID")){
				consolidado.setID(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("RUTA_DESPACHO")){
				consolidado.setRUTA_DESPACHO(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("HORA_DESPACHO")){
				consolidado.setHORA_DESPACHO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("REGISTRO_CONSOLIDADO")){
				consolidado.setREGISTRO_CONSOLIDADO(campoTemp[1]);
			}
			
			if(campoTemp[0].equals("TOTAL_RECAUDO_BRUTO")){
				consolidado.setTOTAL_RECAUDO_BRUTO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("TOTAL_RECAUDO_DESPACHO")){
				consolidado.setTOTAL_RECAUDO_DESPACHO(new Integer(campoTemp[1]));
			}
			
			if(campoTemp[0].equals("ESTADO_CONSOLIDADO")){
				consolidado.setESTADO_CONSOLIDADO(campoTemp[1]);
			}
			if(campoTemp[0].equals("ESTADO_IMPRESION")){
				consolidado.setESTADO_IMPRESION(campoTemp[1]);
			}
			
		}
		return consolidado;
	}
}
