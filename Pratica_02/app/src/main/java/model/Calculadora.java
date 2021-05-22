package model;

public class Calculadora implements Funcao {
	
	 /* Método que obrigatoriamente devera ser implementado pela
    	    classe Calculadora que sera implementada pela Interface */
	
	@Override
	public float div (float x, float y) {
		if( (x >=-100 && x <=100) && (y >=-100 && y <=100) ){
			if (y == 0) {
				System.out.println("Não é possível dividir por zero");
				return 0;
			}

			return x / y;
		}
		else {
			if(x <-100 || x >100) {
		   		System.out.println("valor" + x + "informado esta fora do limite permitido!");
				return 0;
			} 
			else {
				System.out.println("valor" + y + "informado esta fora do limite permitido!");
				return 0;
			}
		}
	 } 
}
