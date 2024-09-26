//Crie um algoritmo que leia 3 valores e informe se o 3º valor informado está
//entre os 2 primeiros. 
package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe os valores:");
		int vl1, vl2, vl3;
		vl1 = in.nextInt();
		vl2 = in.nextInt();
		vl3 = in.nextInt();
		
		if((vl3 > vl1 && vl3 < vl2) || (vl3 < vl1 && vl3 > vl2))
		{
			System.out.printf("O valor %d está entre os 2 primeiros", vl3);
		} else {
			System.out.printf("O valor %d não está entre os 2 primeiros", vl3);			
		}
		in.close();
	}
}
