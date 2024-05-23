package edu.itsco.semantica;

public class SemanticException extends Exception {

	private static final long serialVersionUID = 1L;

	public static final int FUNCION_NO_DEFINIDA = 10;
	public static final int FUNCION_DUPLICADA = 20;
	public static final int FUNCION_RETORNA_VALOR = 30;
	public static final int ARGUMENTOS_NO_CONCUERDA = 40;
	public static final int PRINCIPAL_NO_DEFINIDA = 50;
	
	public static final int VARIABLE_DUPLICADA = 60;
	public static final int VARIABLE_NO_DECLARADA = 70;
	
	
	public SemanticException(int causa, String id) {
		super(getMensaje(causa, id));
	}
	
	public SemanticException(int causa, String funcion, String id) {
		super("La variable "+id+" ya esta definida en "+funcion);
	}
	
	private static String getMensaje(int causa, String id) {
		String msg="";
		switch(causa) {
		case FUNCION_DUPLICADA:
			msg = "La función "+id+" ya está definida";
			break;
		case PRINCIPAL_NO_DEFINIDA:
			msg = "Debes tener una función "+id;
			break;
		case FUNCION_NO_DEFINIDA:
			msg = "La función "+id+" no está definida";
			break;
		case ARGUMENTOS_NO_CONCUERDA:
			msg = "Los argumentos de la funcion "+id+" no coinciden";
			break;
		case VARIABLE_DUPLICADA:
			msg = "La variable "+id+" ya está definida";
			break;
		case VARIABLE_NO_DECLARADA:
			msg = "La variable "+id+" no está declarada";
			break;
		default: 
			msg = "Causa no conocida del error";
		}
		return msg;
	}
}
