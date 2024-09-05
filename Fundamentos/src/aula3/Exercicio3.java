package aula3;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	    System.out.println("Digite o salário bruto");
	    double salarioBruto = in.nextDouble();
	    double gratificacao = salarioBruto * 0.1;
	    double desconto = salarioBruto * 0.15;
	    double salarioLiquido = (salarioBruto + gratificacao) - desconto;
	    System.out.println("Salário líquido: " + salarioLiquido);
	    in.close();
	}

}
