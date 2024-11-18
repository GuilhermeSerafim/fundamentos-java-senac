package aula9;

import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(1, 10);
		}
		// Um número é considerado primo se ele for maior que 1 e só puder ser dividido
		// de forma exata por 1 e ele próprio.
		System.out.println("Números primos:");
		for (int i : nums) {
			if(isPrimo(nums[i])) {
				System.out.printf("Número : " + nums[i] + "\nPosição: " + i);
			}
		}
	}

	public static boolean isPrimo(int n) {
		int div = 0;
		for(int i = 0; i<= n; i++) {
			if(n % i == 0) {
				div++;
			}
			if(div > 2) {
				return false;
			}
		}
		return true;
	}
}
