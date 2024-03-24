package edu.itsco.semantica;

import java.util.ArrayList;

public class AdministraFunciones {

	private ArrayList<Funcion> funciones;
	
	public AdministraFunciones() {
		funciones = new ArrayList<Funcion>();
	}
	
	public void agregaFuncion(Funcion funcion) throws SemanticException{
		if(!funciones.contains(funcion)) {
			funciones.add(funcion);
		}else {
			throw new SemanticException(
					SemanticException.FUNCION_DUPLICADA,
					funcion.getId());
		}
	}
	
	public void validaPrincipal() throws SemanticException{
		Funcion f = new Funcion();
		f.setId("principal");
		if(!funciones.contains(f)) {
			throw new SemanticException(
					SemanticException.PRINCIPAL_NO_DEFINIDA,
					"principal");
		}
	}
	
	public void validaFuncion(Funcion funcion) throws SemanticException{
		int index = funciones.indexOf(funcion);
		//System.out.println(index);
		//if(!funciones.contains(funcion)) {
		if(index == -1) {
			throw new SemanticException(
					SemanticException.FUNCION_NO_DEFINIDA, 
					funcion.getId());
		}
		Funcion f = funciones.get(index);
		if(f.getArgumentos().size()!=funcion.getNumArgumentos()) {
			throw new SemanticException(
					SemanticException.ARGUMENTOS_NO_CONCUERDA,
					funcion.getId()
					);
		}
	}
}
