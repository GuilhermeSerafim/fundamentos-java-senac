package avaliacao1;

import java.util.Scanner;

//	Crie um algoritmo em JAVA que corresponda ao fluxograma a seguir. 
//	O tema do algoritmo é livre e não precisa ter um propósito, porém as instruções devem corresponder exatamente às formas do fluxograma.
//	Enviar o código JAVA através da opção {;}
public class Ex1 {

	public static void main(String[] args) { // Terminal
		Scanner in = new Scanner(System.in);
		// Variaveis de entrada do fluxograma
		String arcoFavorito, personagemFavorito, nomeDeUmFaRaro = "", testeFinal;
		int notaDoTeste = 0;
		System.out.printf("Estamos procurando fãs raros de One Piece, você é um?%nPara sabermos, passe em nosso teste:%nDigite seu arco favorito de One Piece:%n"); // Display 1
		arcoFavorito = in.nextLine(); // Entrada manual 1
		
		System.out.printf("Digite seu personagem favorito do arco %s%n", arcoFavorito); // Display 2
		personagemFavorito = in.nextLine(); // Entrada manual 2
		
		if(personagemFavorito.equalsIgnoreCase("Luffy") ||
				arcoFavorito.equalsIgnoreCase("Wano")) { // 1º Condição
			System.out.println("Você tem um bom gosto"); // Display 3 da direita
			notaDoTeste = 7;
		} else if(personagemFavorito.equalsIgnoreCase("Zoro") ||
				personagemFavorito.equalsIgnoreCase("Sanji") ||
				arcoFavorito.equalsIgnoreCase("Marineford")) { // 2º Condição
			System.out.printf("Você tem um ótimo gosto, entre para nosso grupo [https://chat.whatsapp.com/BGR6msptv3yGOmULILuNGx]%nQual é o seu nome?%n"); // Display 4 da esquerda
			nomeDeUmFaRaro = in.nextLine(); // Entrada manual 3
			notaDoTeste = 9;
		} else {
			System.out.println("Você tem um gosto razoável"); // Display 4 do meio
		}
		System.out.printf("Sua nota atual: %d%n", notaDoTeste); // Display 5 do final (independente)
		
		// Segunda parte do fluxograma
		System.out.println("Teste final:\nQual é o nome do atual Yonkou que já foi membro da tripulação de Gol D. Roger?"); // Display 1
		testeFinal = in.nextLine(); // Entrada manual 1
		
		if(testeFinal.equalsIgnoreCase("Shanks")) { // 1º Condição
			notaDoTeste = 10;
			System.out.println("Parabéns, você ganhou uma xicará de Chopper! Printe que acertou e envie o print no nosso insta."); // Display 1 da direita
		}
		// Isso aqui, ele sempre faz:
		System.out.printf("Sua nota final é : %d%n", notaDoTeste); // Display 2 (independente)
		System.out.println("Siga a gente no instagram @onepiecebrasil"); // Display 3 (independente)
		in.close();
	}

}
