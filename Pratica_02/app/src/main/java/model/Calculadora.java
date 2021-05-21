package model;

public class Calculadora implements Funcao {
	
	 /* Método que obrigatoriamente devera ser implementado pela
    	    classe Calculadora que sera implementada pela Interface */
	
	@Override
	public float div (float x, float y) {
		if( (x >=-100 && x <=100) && (y >=-100 && y <=100) ){
			return x;
		}
	 	
		return x;
	} 
}
