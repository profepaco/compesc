package edu.itsco.semantica;

import java.util.ArrayList;

public class Funcion {
	private String id;
	private String tipoDatoRetorno;
	private int numArgumentos;
	//private ArrayList<Variable> variables;
	private ArrayList<Variable> argumentos;
	private AdministraVariables adminVariables;
	
	public Funcion() {
		//variables = new ArrayList<Variable>();
		adminVariables = new AdministraVariables();
	}
	
	public void agregarVariable(Variable variable) {
		//variables.add(variable);
		adminVariables.agregaVariable(variable);
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTipoDatoRetorno() {
		return tipoDatoRetorno;
	}
	
	public void setTipoDatoRetorno(String tipoDatoRetorno) {
		this.tipoDatoRetorno = tipoDatoRetorno;
	}
	
	public int getNumArgumentos() {
		return numArgumentos;
	}
	
	public void setNumArgumentos(int numArgumentos) {
		this.numArgumentos = numArgumentos;
	}

	public ArrayList<Variable> getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(ArrayList<Variable> argumentos) {
		this.argumentos = argumentos;
		//manda los argumentos a la clase administra Variable
		//para que san las primeras variables
		adminVariables.setListaVariables(argumentos);
	}

	@Override
	public boolean equals(Object obj) {
		
		Funcion funcion = (Funcion) obj;
		if(this.getId().equals(funcion.getId())) {
			return true;
		}
		return false;
		
	}
	
}
