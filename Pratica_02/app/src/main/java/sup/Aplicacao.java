package sup;
import model.Calculadora;

public class Aplicacao{
	
    public static void main(String [] args) {

    	Calculadora calc = new Calculadora();

    	System.out.println("dividirTestA" + calc.div(59.5f, 4));
    	System.out.println("dividirTestB" + calc.div(10, 4));
    	System.out.println("dividirTestC" + calc.div(156.55f, 69.6f));
    }
}
