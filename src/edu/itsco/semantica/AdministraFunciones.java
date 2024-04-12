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
	
	public void validaArgumentos(Funcion f
			,ArrayList<String> argumentos) throws SemanticException{
		int index = funciones.indexOf(f);
		Funcion funcion = funciones.get(index);
		for(int i=0;i<funcion.getArgumentos().size();i++) {
			Variable v = funcion.getArgumentos().get(i);
			if(!v.getTipoDato().equals(argumentos.get(i))) {
				//System.out.println("No coinciden los tipos");
				throw new SemanticException(
						SemanticException.ARGUMENTOS_NO_CONCUERDA,
						funcion.getId()
						);
			}
		}
	}
}
