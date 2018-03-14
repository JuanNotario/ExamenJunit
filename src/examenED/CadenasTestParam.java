package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CadenasTestParam {
	private String cadena, cadenaFinal;
	
	public CadenasTestParam(String cadena, String cadenaFinal) {
		this.cadena = cadena;
		this.cadenaFinal = cadenaFinal;
	}

	@Parameters
	public static Collection<Object[]> caracteres() {
		return Arrays.asList(new Object[][]{ {"Ave", "ve"},
											 {"Avestruz", "vestruz"},
											 {"Girafa", "Girafa"}
		});
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		Cadenas cade = new Cadenas();
		String cadenaFinalReal = cade.quitarAenPrimeras2Posiciones(cadena);
		assertEquals(cadenaFinal, cadenaFinalReal);
	}

}
