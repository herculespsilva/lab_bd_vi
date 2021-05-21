package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Calculadora;

public class CalculadoraTest {

    @Test
    public void dividirValorLimiteInvalidoInferior () {
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(-100.01f, 10);
		
		assertEquals(0, resultado);

    }
    
    @Test
    public void dividirValorLimiteValidoInferior () {
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(-100, 10);
		
		assertEquals(-10, resultado);
    }
    
    @Test
    public void dividirValorLimiteValidoSuperior () {
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(100, 10);
		
		assertEquals(10, resultado);
    }

    @Test
    public void dividirValorLimiteInvalidoSuperior () {
		Calculadora calc = new Calculadora();
		
		float resultado = calc.div(100.01f, 10);

		assertEquals(0, resultado);
    }
}
