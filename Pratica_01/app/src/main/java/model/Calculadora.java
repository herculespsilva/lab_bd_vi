package model;

public class Calculadora implements Funcao {
	
	 /* Método que obrigatoriamente devera ser implementado pela
    classe Calculadora que sera implementada pela Interface */
	
	@Override
	public float div (float x, float y) {
		
		 if (y == 0) {
		      return 0;
		 }
		
		 return (x / y);
	 } 
}
