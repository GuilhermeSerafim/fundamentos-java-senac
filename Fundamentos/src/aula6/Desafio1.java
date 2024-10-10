package aula6;

import java.util.Calendar;
import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ano, mes, dia;
		System.out.println("Informe o ano de nascimento");
		ano = in.nextInt();
		System.out.println("Informe o mes de nascimento");
		mes = in.nextInt();
		System.out.println("Informe o dia de nascimento");
		dia = in.nextInt();
		Desafio1 d = new Desafio1();
		d.ehMaiorIdade(07, 05, 2004);
	}

	public boolean ehMaiorIdade(int diaNasc, int mesNasc, int anoNasc) {
		Calendar calendario = Calendar.getInstance();
		int diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
		int mesAtual = calendario.get(Calendar.MONTH) + 1; // Janeiro é 0
		int anoAtual = calendario.get(Calendar.YEAR);

		// Pois teremos dúvida quando for == a 18
		if(anoAtual - anoNasc != 18) {
			return anoAtual - anoNasc > 18;
		}
		
		// Pois teremos problema quando o ano atual e o ano de nascimento forem iguais
		if(mesAtual != mesNasc) {
			return mesNasc < mesAtual;
		}
		
		// Se chegou nesse ponto, o mes é igual, portanto, temos que fazer a verificação do dia
		return diaNasc < diaAtual;
	}

}
