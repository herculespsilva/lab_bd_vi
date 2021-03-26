package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Calculadora;

public class CalculadoraTest {

    @Test
    public void dividirTestA (){
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(59.5f, 4);
		
		assertEquals(14.875f, resultado);
    }
    
    @Test
    public void dividirTestB (){
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(10, 4);
		
		assertEquals(2.5f, resultado);
    }
    
    @Test
    public void dividirTestC (){
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(156.55f, 69.6f);
		
		assertEquals(2.24928161f, resultado);
    }
}
