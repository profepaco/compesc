package edu.itsco.semantica;

import java.util.ArrayList;

public class Funcion {
	private String id;
	private String tipoDatoRetorno;
	private int numArgumentos;
	private ArrayList<Variable> variables;
	private ArrayList<Variable> argumentos;
	
	public Funcion() {
		variables = new ArrayList<Variable>();
	}
	
	public void agregarVariable(Variable variable) {
		this.variables.add(variable);
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
	}

	@Override
	public boolean equals(Object obj) {
		
		Funcion funcion = (Funcion) obj;
		if(this.getId().equals(funcion.getId())) {
			return true;
		}
		return false;
		/*
		String id = "";
		if(obj instanceof Funcion) {
			Funcion f = (Funcion) obj;
			id = f.getId();
		}
		if(obj instanceof String) {
			id = (String) obj;
			System.out.println(id);
		}
		return this.getId().equals(id);
		*/
	}
	
}
