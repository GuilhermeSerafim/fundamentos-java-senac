package aula2;

// Alguns exemplos de :
public class Convertimentos {
	public static void main(String[] args) {
		
		// Conversão de String para Tipos Primitivos
		int i = Integer.parseInt("123");
		double d = Double.parseDouble("123.45");
		boolean b = Boolean.parseBoolean("true");

		// Conversão de Tipos Primitivos para String
		String s = Integer.toString(123);
		String s2 = Double.toString(123.45);
		String s3 = Boolean.toString(true);

		// Conversão de String para Wrapper Object
		Integer i2 = Integer.valueOf("123");
		Double d2 = Double.valueOf("123.45");
		Boolean b2 = Boolean.valueOf("true");

	}
}
