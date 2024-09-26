package avAlgoritmo1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double salario, nvSalario, bonificacao = 0, auxilioEscola = 0;
		System.out.println("Digite o salário de um funcionário");
		salario = in.nextDouble();
		
		if(salario <= 2000.00) {
            bonificacao = salario * 0.1;
		} else if(salario <= 3000.00) {
			bonificacao = salario * 0.08;
		} else {
			bonificacao = salario * 0.05;
		}
        if (salario <= 2500.00) {
            auxilioEscola = 350;
        } else {
            auxilioEscola = 300;
        }
		
        nvSalario = salario + bonificacao + auxilioEscola;
		
        System.out.printf("Novo salário: %.2f", nvSalario);
		in.close();
	}
}
