package aula1;
import java.util.Scanner;

public class Atalhos {

	//	Ctrl + Shift + R: Abre um recurso pelo nome (arquivo).
	//	Ctrl + Shift + T: Abre um tipo pelo nome (classe).
	//	Ctrl + O: Exibe o esboço da classe atual.
	//	Ctrl + Shift + O: Organiza os imports.
	//	Ctrl + D: Exclui a linha atual.
	//	Alt + Shift + R: Renomeia.
	//	Ctrl + F11: Executa o programa atual.
	//	F3: Navega até a declaração.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número:");
		int x = in.nextInt();
		System.out.println("Digite outro número:");
		int y = in.nextInt();
		System.out.println("Soma desses números: " + (x + y));
		System.out.println("Concatenação" + x + y);
		in.close();
	}

}