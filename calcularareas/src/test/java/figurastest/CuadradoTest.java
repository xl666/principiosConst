package figurastest;

import figuras.Cuadrado;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CuadradoTest {

    @Test
    public void testArea() {
	Cuadrado cuadrado = new Cuadrado(4.0);
	double resultado = 16.0;
	assertEquals(cuadrado.calcularArea(), resultado, 0.001);	
    }
}


