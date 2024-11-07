package aula8;

public class ArrayReferencia {
	public static void main(String[] args) {
		// Ex 1
		int[] valores = new int[3];
		valores[0] = 10;
		valores[1] = 15;
		valores[2] = 20;
		int[] numeros = valores;
		numeros[0] = 20;
		// Pois, os 2 apontam para o mesmo Heap da JVM
		System.out.println(valores[0]);

		// Ex 2
		preencherArr(numeros, 0); // Aqui eu passei a referencia ('controle remoto')
		System.out.println(valores[0]); // 50
		System.out.println(numeros[0]); // 50
		// Portanto, temos apenas um arr na memoria
		// O metodo não precisa retornar nada
	}

	public static void preencherArr(int[] array, int valor) {
			for (int i = 0; i < array.length; i++) {
				array[i] = valor;
			}
}
}