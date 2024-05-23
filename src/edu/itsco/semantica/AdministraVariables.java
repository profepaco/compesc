package edu.itsco.semantica;

import java.util.ArrayList;

public class AdministraVariables {

	private ArrayList<Variable> listaVariables;
	
	public AdministraVariables() {
		
	}
	
	public AdministraVariables(ArrayList<Variable> listaVariables) {
		this.listaVariables = listaVariables;
	}
	
	public void setListaVariables(ArrayList<Variable> listaVariables) {
		this.listaVariables = listaVariables;
		/*
		for(Variable v: listaVariables) {
			System.out.println(v.getId());
		}*/
	}
	
	public ArrayList<Variable> getListaVariable(){
		return this.listaVariables;
	}
	
	public void agregaVariable(Variable v) throws SemanticException {
		if(!listaVariables.contains(v)) {
			this.listaVariables.add(v);
		}else {
			throw new SemanticException(
					SemanticException.VARIABLE_DUPLICADA
					, v.getId());
		}
	}
	
	public void existeVariable(Variable v) throws SemanticException{
		if(!listaVariables.contains(v)) {
			throw new SemanticException(
					SemanticException.VARIABLE_NO_DECLARADA,
					v.getId()
				);
		}
	}
	
	public void inicializaVariable(Variable v) {
		int index = listaVariables.indexOf(v);
		listaVariables.get(index).setInicializada(true);
	}
	
	public void variableInicializada(Variable v) {
		int index  = listaVariables.indexOf(v);
		v = listaVariables.get(index);
		if(!v.isInicializada()) {
			System.err.println("La variable no se ha inicializado: "+v.getId());
		}
	}
}
