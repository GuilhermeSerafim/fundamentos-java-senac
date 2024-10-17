package aula7;

import java.util.Scanner;

// Consiste em criar verificadores para verificar se o cpf é válido com lógica
public class Desafio2Cpf {
	public static void main(String[] args) {
		int opcao;
		String cpf;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("CPF Calculator");
			System.out.println("1 - Validar");
			System.out.println("2 - Gerar");
			System.out.println("3 - Encerrar");
			System.out.println("Escolha uma opção");
			opcao = in.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Informe o cpf");
				cpf = in.next().replace(".", "").replace("-", "");
				if(validarCpf(cpf)) {
					System.out.println("\u001B[32mCPF válido");
				} else {
					System.out.println("\u001B[31mCPF INVÁLIDO!");
				}
			}
			default:
				System.err.println("Opção inválida \nInforme outra opção:");
			}
		} while (opcao != 3);
	}
	public static boolean ehTudoIgual(String cpf) {
		char cInicio = cpf.charAt(0); // Comparativo
		for(int i = 1; i < 9; i++) {
			char c = cpf.charAt(i);
			if(cInicio != c) {
				return false;
			}
		}
		return true;
	}
	public static int calcVerificador1(String cpf) {
	    int somaDosNumerosDoCpf = 0, fator = 10, resto;

	    // Itera sobre os 9 primeiros dígitos do CPF
	    for (int i = 0; i < 9; i++) {
	        // Converte o caractere para número, subtraindo 48, pois '0' em ASCII é 48
	        int n = cpf.charAt(i) - 48;
	        
	        // Calcula o produto do dígito pelo fator e acumula na soma total
	        somaDosNumerosDoCpf += fator * n;
	        
	        // Diminui o fator em 1 a cada iteração, começando de 10 até 2
	        fator--;
	    }
	    
	    // Calcula o resto da divisão da soma por 11
	    resto = somaDosNumerosDoCpf % 11;
	    
	    // Retorna o dígito verificador:
	    // - Se o resto for menor que 2, retorna 0 (valor especial para CPF) -> Não pode ser 1 ou 0
	    // - Caso contrário, retorna 11 - resto (para evitar um dígito verificador igual a 10)
	    return resto < 2 ? 0 : 11 - resto;
	}
	public static int calcVerificador2(String cpf) {
	    int somaDosNumerosDoCpf = 0, fator = 11, resto;

	    // Itera sobre os 9 primeiros dígitos do CPF
	    for (int i = 0; i < 10; i++) {
	        // Converte o caractere para número, subtraindo 48, pois '0' em ASCII é 48
	        int n = cpf.charAt(i) - 48;
	        
	        // Calcula o produto do dígito pelo fator e acumula na soma total
	        somaDosNumerosDoCpf += fator * n;
	        
	        // Diminui o fator em 1 a cada iteração, começando de 10 até 2
	        fator--;
	    }
	    
	    // Calcula o resto da divisão da soma por 11
	    resto = somaDosNumerosDoCpf % 11;
	    
	    // Retorna o dígito verificador:
	    // - Se o resto for menor que 2, retorna 0 (valor especial para CPF) -> Não pode ser 1 ou 0
	    // - Caso contrário, retorna 11 - resto (para evitar um dígito verificador igual a 10)
	    return resto < 2 ? 0 : 11 - resto;
	}
	public static boolean validarCpf(String cpf) {
		if(cpf.length() == 11 && !ehTudoIgual(cpf)) {
			// 
		}
		return false;
	}

}
