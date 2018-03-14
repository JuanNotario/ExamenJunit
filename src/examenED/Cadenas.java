package examenED;

public class Cadenas {

	public String quitarAenPrimeras2Posiciones(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String primeros2Chars = str.substring(0, 2);
		
		String cadenaMenosPrimeros2Chars = str.substring(2);

		return primeros2Chars.replaceAll("A", "") + cadenaMenosPrimeros2Chars;
	}
	
	public boolean sonPrimerosYultimos2CharsLosMismos(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String primeros2Chars = str.substring(0, 2);

		String ultimos2Chars = str.substring(str.length() - 2);

		return primeros2Chars.equals(ultimos2Chars);
	}
}

