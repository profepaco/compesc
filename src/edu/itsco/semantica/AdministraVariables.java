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
	}
	
	public ArrayList<Variable> getListaVariable(){
		return this.listaVariables;
	}
	
	public void agregaVariable(Variable v) {
		if(!listaVariables.contains(v)) {
			this.listaVariables.add(v);
		}else {
			System.out.println("La variable ya existe");
		}
	}
}
