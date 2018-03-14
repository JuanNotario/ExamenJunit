package examenED;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CadenasTest {
	static Cadenas cad;
	
	@BeforeClass
	public static void preTest() {
		cad = new Cadenas();
	}
	
	//Creamos un metodo que se ejecutara antes de cada @test
	@Before
	public void preMetodo() {
		System.out.println("Inicio prueba");
	}
	
	//Creamos un m�todo que se ejecutara despu�s de cada @test
	@After
	public void postMetodo() {
		System.out.println("Fin Prueba");
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		String strFinal = cad.quitarAenPrimeras2Posiciones("Alo");
		assertEquals("lo", strFinal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones2() {
		String strFinal2 = cad.quitarAenPrimeras2Posiciones("Teclado");
		assertEquals("Teclado", strFinal2);
	}

	@Test
	public void testSonPrimerosYultimos2CharsLosMismos() {
		boolean strFinal3 = cad.sonPrimerosYultimos2CharsLosMismos("Ma�anaMa");
		assertEquals(true, strFinal3);
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos2() {
		boolean strFinal4 = cad.sonPrimerosYultimos2CharsLosMismos("Ma�anaca");
		assertEquals(false, strFinal4);
	}
}
