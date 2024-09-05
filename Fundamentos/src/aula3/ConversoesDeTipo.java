package aula3;

public class ConversoesDeTipo {

	public static void main(String[] args) {
		
		// byte b = 210; -> Dá erro
		byte b = (byte) 210; // Conversão de inteiro para byte
		System.out.println(b); // -46
		
		/*COMPORTAMENTO: 
		 *O range min (-128) e max (127), sabendo disso, colocamos um número fora do range.
		 *O comportamento do byte, é ele ir para o final da fila, a partir do valor que
		 *sobrou (210-127=83), ele vai contar quantas casas tem de -128 com 83, e chegará
		 *no resultado do -46 (pois estamos pulando as casinhas, e não apenas subtraindo)*/
		

	}

}
