package jogoDaMemoria;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class JogoDaMemoria {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	public static final String BLACK = "\033[1;30m"; // BLACK
	public static final String RED = "\033[1;31m"; // RED
	public static final String GREEN = "\033[1;32m"; // GREEN
	public static final String YELLOW = "\033[1;33m"; // YELLOW
	public static final String BLUE = "\033[1;34m"; // BLUE
	public static final String PURPLE = "\033[1;35m"; // PURPLE
	public static final String CYAN = "\033[1;36m"; // CYAN
	public static final String WHITE = "\033[1;37m"; // WHITE
	static final String RESET = "\033[0m"; // Text Reset
	static String[] colors = { BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE };

	public static void main(String[] args) throws Exception {
		File file = new File("TrilhaSonora.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		limparTela();
		boolean rodando = true;
		while (rodando) {
			exibirMenuInicial();
			System.out.print("Escolha uma opção: ");
			int escolha = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer

			switch (escolha) {
			case 1: // Jogar
				escolherDificuldade();
				break;
			case 2: // Instruções e Regras
				limparTela();
				exibirRegras();
				break;
			case 3: // Sair
				System.out.println("Obrigado por jogar! Até a próxima.");
				rodando = false;
				System.out.println("                  __\r\n" + "                 / _,\\\r\n"
						+ "                 \\_\\\r\n" + "      ,,,,    _,_)  #      /)\r\n"
						+ "     (= =)D__/    __/     //\r\n" + "    C/^__)/     _(    ___//\r\n"
						+ "      \\_,/  -.   '-._/,--'\r\n" + "_\\\\_,  /           -//.\r\n" + " \\_ \\_/  -,._ _     "
						+ RED + ") " + ")" + RESET + " \r\n" + "   \\/    /    )    / /\r\n"
						+ "   \\-__,/    (    ( (\r\n" + "              \\.__,-)\\_\r\n"
						+ "               )\\_ / -(\r\n" + "              / -(////\r\n" + "             ////");
				break;
			case 4:
				System.out.println("Ligando trilha sonora");
				clip.start();
				esperar(2000);
				limparTela();
				break;
			case 5:
				System.out.println("Desligando trilha sonora");
				clip.stop();
				esperar(2000);
				limparTela();
				break;
			default:
				System.out.println(RED + "Opção inválida! Tente novamente." + RESET);
				System.out.println("          __\r\n" + "   ???  c(..)o   (\r\n" + "      \\__(-)    __)\r\n"
						+ "          /\\   (\r\n" + "         /(_)___)\r\n" + "         w /|\r\n" + "          | \\\r\n"
						+ "         m  m");
				esperar(2000);
				limparTela();
			}
		}
	}

	// Exibe o menu inicial
	public static void exibirMenuInicial() {
		System.out.println(
				"  ______     _    __      __     _                                                       _       \r\n"
						+ " |  ____|   (_)   \\_\\    / _|   (_)                                                     (_)      \r\n"
						+ " | |__ _   _ _    __ _  | |_ ___ _ _ __ __ _    ___    ___ ___  _ __ ___  _ __  _ __ ___ _       \r\n"
						+ " |  __| | | | |  / _` | |  _/ _ \\ | '__/ _` |  / _ \\  / __/ _ \\| '_ ` _ \\| '_ \\| '__/ _ \\ |      \r\n"
						+ " | |  | |_| | | | (_| | | ||  __/ | | | (_| | |  __/ | (_| (_) | | | | | | |_) | | |  __/ |_ _ _ \r\n"
						+ " |_|   \\__,_|_|  \\__,_| |_| \\___|_|_|  \\__,_|  \\___|  \\___\\___/|_| |_| |_| .__/|_|  \\___|_(_|_|_)\r\n"
						+ "                                                                         | |                     \r\n"
						+ "                                                                         |_|                     ");
		System.out.println(" --------------------------- ");
		System.out.println("|1 - Iniciar o Jogo          |");
		System.out.println("|2 - Instruções e Regras     |");
		System.out.println("|3 - Sair                    |");
		System.out.println("|4 - Ligar trilha sonora     |");
		System.out.println("|5 - Desligar trilha sonora  |");
		System.out.println(" --------------------------- ");
		System.out.println();
	}

	// Exibe as regras do jogo
	public static void exibirRegras() throws IOException, InterruptedException {
		System.out.println(YELLOW);
		System.out.println("                 __,__\r\n" + "        .--.  .-\"     \"-.  .--.\r\n"
				+ "       / .. \\/  .-. .-.  \\/ .. \\\r\n" + "      | |  '|  /   Y   \\  |'  | |\r\n"
				+ "      | \\   \\  \\ 0 | 0 /  /   / |\r\n" + "       \\ '- ,\\.-\"`` ``\"-./, -' /\r\n"
				+ "        `'-' /_   ^ ^   _\\ '-'`\r\n" + "        .--'|  \\._ _ _./  |'--. \r\n"
				+ "      /`    \\   \\.-.  /   /    `\\\r\n" + "     /       '._/  |-' _.'       \\\r\n"
				+ "    /          ;  /--~'   |       \\\r\n" + "   /        .'\\|.-\\--.     \\       \\\r\n"
				+ "  /   .'-. /.-.;\\  |\\|'~'-.|\\       \\\r\n" + "  \\       `-./`|_\\_/ `     `\\'.      \\\r\n"
				+ "   '.      ;     ___)        '.`;    /\r\n" + "     '-.,_ ;     ___)          \\/   /\r\n"
				+ "      \\   ``'------'\\       \\   `  /\r\n" + "       '.    \\       '.      |   ;/_\r\n"
				+ "  ___>     '.       \\_ _ _/   ,  '--.\r\n" + "   .'   '.   .-~~~~~-. /     |--'`~~-.  \\\r\n"
				+ "  // / .---'/  .-~~-._/ / / /---..__.'  /\r\n" + " ((_(_/    /  /      (_(_(_(---.__    .'\r\n"
				+ "           | |     _              `~~`\r\n" + "           | |     \\'.\r\n"
				+ "            \\ '....' |\r\n" + "             '.,___.'");
		System.out.println(RESET);
		System.out.println("\n=== SABEDORIA DO GRANDE MACACO ===\n");
		System.out.println(
				"\"Ohohoho! Saudações, jovem aprendiz! Sou o Grande Macaco Sábio. Prepare-se para um teste de memória e destreza!\"");
		System.out.println("\"Aqui está como funciona meu desafio:\"");
		System.out.println(
				"- Você deve lembrar das palavras que forem adicionadas à sequência e repeti-las corretamente.");
		System.out.println("- A cada rodada, você deve repetir a sequência e adicionar uma nova palavra ao final.");
		System.out.println("- Cada acerto fará você subir na escada da sabedoria, acumulando pontos de prestígio!");
		System.out.println(
				"- MAS CUIDADO! Um único erro, e o jogo termina. Minha sabedoria não perdoa deslizes! Ohohoho!\"");
		System.out.println("\n<< Pressione 'ENTER' para voltar ao menu >>>\n");
		scanner.nextLine();
		limparTela();
	}

	// Escolha de dificuldade
	public static void escolherDificuldade() throws IOException, InterruptedException {
		while (true) {
			System.out.println("\nEscolha a dificuldade:");
			System.out.println("1. Fácil (10 palavras)");
			System.out.println("2. Médio (15 palavras)");
			System.out.println("3. Difícil (20 palavras)");
			System.out.println("4. Programador (30 palavras)");
			System.out.print("Selecione o nível: ");
			int dificuldade = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer
			int limitePalavras = switch (dificuldade) {
			case 1 -> 10; // Fácil
			case 2 -> 15; // Médio
			case 3 -> 20; // Dificil
			case 4 -> 30; // Programador
			default -> {
				System.out.println("Digite uma dificuldade válida");
				esperar(2000);
				limparTela();
				yield 0;
			}
			};

			if (limitePalavras > 0) {
				iniciarJogo(limitePalavras);
				break;
			}
		}

	}

	// Inicia o jogo
	public static void iniciarJogo(int limitePalavras) throws IOException, InterruptedException {
		ArrayList<String> sequencia = new ArrayList<>();
		String[] palavras = { "ABACATE", "ABACAXI", "ABÓBORA", "ACEROLA", "ALFACE", "ALHO", "AMEIXA", "AMENDOIM",
				"ARROZ", "AZEITONA", "BANANA", "BATATA", "BERINJELA", "BETERRABA", "BRÓCOLIS", "CAJU", "CEBOLA",
				"CENOURA", "CHUCHU", "COCO", "COUVE", "CRAVO", "ERVILHA", "ESPINAFRE", "FIGO", "GOIABA", "HORTELÃ",
				"INHAME", "JABUTICABA", "JACA", "JILÓ", "KIWI", "LARANJA", "LIMÃO", "MAMÃO", "MANDIOCA", "MANGA",
				"MANJERICÃO", "MARACUJÁ", "MELANCIA", "MELÃO", "MILHO", "MORANGO", "NABO", "NÊSPERA", "ORÉGANO",
				"PALMITO", "PÃO", "PEPINO", "PERA", "PÊSSEGO", "PIMENTA", "PINHÃO", "QUIABO", "RABANETE", "REPOLHO",
				"SALSA", "SALSÃO", "TOMATE", "TRIGO", "UVA", "VAGEM", "AGRIÃO", "ALECRIM", "CAMOMILA", "CEBOLINHA",
				"COENTRO", "COUVE-FLOR", "ESCAROLA", "FEIJÃO", "LENTILHA", "MANJERONA", "MARISCO", "MEXERICA", "NORI",
				"OSTRA", "PASSA", "POLVILHO", "PROVOLONE", "QUEIJO", "RÚCULA", "SABUGO", "SAL", "SALSICHA", "SELETA",
				"SOJA", "SORVETE", "TAPIOCA", "TÂMARA", "TOFU", "TORANJA", "TRUTA", "TUCUMÃ", "UMBU", "VINHO",
				"YAKISOBA", "ZIMBRO", "ZUCHINI", "ALCACHOFRA", "ALMEIRÃO", "AVELÃ", "AÇAÍ", "BABOSA", "BACURI", "BARU",
				"BIQUINHO", "BURITI", "CAQUI", "CARÁ", "CEVADA", "CEREJA", "CIDREIRA", "CURAU", "DAMASCO", "ENDRO",
				"ESCAROLA", "FAVA", "FUNCHO", "GERGELIM", "GRAVIOLA", "GUARANÁ", "JAMBU", "JATOBÁ", "LENTILHA", "LOURO",
				"MALVA", "MARAPUAMA", "MELAÇO", "MURICI", "NOZ", "PEQUI", "PINHÃO-MANSO", "PISTACHE", "PITANGA",
				"PITAYA", "PUPUNHA", "RABANADA", "RAMI", "SAGU", "SERIGUELA", "TAMARA", "TEFF", "URUCUM", "ABACATE",
				"ABACAXI", "ABÓBORA", "ACEROLA", "ALFACE", "ALHO", "AMEIXA", "AMENDOIM", "ARROZ", "AZEITONA", "BANANA",
				"BATATA", "BERINJELA", "BETERRABA", "BRÓCOLIS", "CAJU", "CEBOLA", "CENOURA", "CHUCHU", "COCO", "COUVE",
				"CRAVO", "ERVILHA", "ESPINAFRE", "FIGO", "GOIABA", "HORTELÃ", "INHAME", "JABUTICABA", "JACA", "JILÓ",
				"KIWI", "LARANJA", "LIMÃO", "MAÇÃ", "MAMÃO", "MANDIOCA", "MANGA", "MANJERICÃO", "MARACUJÁ", "MELANCIA",
				"MELÃO", "MILHO", "MORANGO", "NABO", "NÊSPERA", "ORÉGANO", "PALMITO", "PÃO", "PEPINO", "PERA",
				"PÊSSEGO", "PIMENTA", "PINHÃO", "QUIABO", "RABANETE", "REPOLHO", "SALSA", "SALSÃO", "TOMATE", "TRIGO",
				"UVA", "VAGEM", "AGRIÃO", "ALECRIM", "CAMOMILA", "CEBOLINHA", "COENTRO", "COUVE-FLOR", "ESCAROLA",
				"FEIJÃO", "LENTILHA", "MANJERONA", "MARISCO", "MEXERICA", "NORI", "OSTRA", "PASSA", "POLVILHO",
				"PROVOLONE", "QUEIJO", "RÚCULA", "SABUGO", "SAL", "SALSICHA", "SELETA", "SOJA", "SORVETE", "TAPIOCA",
				"TÂMARA", "TOFU", "TORANJA", "TRUTA", "TUCUMÃ", "UMBU", "VINHO", "YAKISOBA", "ZIMBRO", "ZUCHINI",
				"ALCACHOFRA", "ALMEIRÃO", "AVELÃ", "AÇAÍ", "BABOSA", "BACURI", "BARU", "BIQUINHO", "BURITI", "CAQUI",
				"CARÁ", "CEVADA", "CEREJA", "CIDREIRA", "CUPUAÇU", "CURAU", "DAMASCO", "ENDRO", "ESCAROLA", "FAVA",
				"FUNCHO", "GERGELIM", "GRAVIOLA", "GUARANÁ", "JAMBU", "JATOBÁ", "LENTILHA", "LINHAÇA", "LOURO", "MALVA",
				"MARAPUAMA", "MELAÇO", "MURICI", "NOZ", "PEQUI", "PINHÃO-MANSO", "PISTACHE", "PITANGA", "PITAYA",
				"PUPUNHA", "RABANADA", "RAMI", "SAGU", "SERIGUELA", "TAMARA", "TEFF", "URUCUM" };

		int pontuacao = 0;
		int tempoEspera = 3000;

		System.out.println("\n=== JOGO INICIADO ===");
		boolean jogando = true;

		while (jogando && pontuacao < limitePalavras) {
			// Adicionar uma nova palavra à sequência
			String novaPalavra = palavras[(int) (Math.random() * palavras.length)];
			sequencia.add(novaPalavra);

			// Mostrar a sequência para o jogador
			System.out.println("\nMemorize a sequência:");
			mostrarSequencia(sequencia);
			esperar(tempoEspera); // Espera 3 segundos
			limparTela();

			// Pedir para o jogador repetir
			System.out.println("Repita a sequência:");
			for (int i = 0; i < sequencia.size(); i++) {
				System.out.print("Compra " + (i + 1) + ": ");
				String resposta = scanner.nextLine();

				if (!resposta.equalsIgnoreCase(sequencia.get(i))) {
					System.out.println(
							RED + "\nVocê errou! " + RESET + "O item correto era: " + GREEN + sequencia.get(i) + RESET);
					System.out.println(YELLOW + "Sua pontuação: " + pontuacao + RESET);
					System.out.println("\n<< Pressione 'ENTER' para voltar ao menu >>>\n");

					System.out.println("....................................................\r\n"
							+ "....................................................\r\n"
							+ "........................./\\.........................\r\n"
							+ "..................______/__\\_______.................\r\n"
							+ "..................||-------------||.................\r\n"
							+ "..................||             ||.................\r\n"
							+ "..................||    \\|||/    ||.................\r\n"
							+ "..................||   [ @-@ ]   ||.................\r\n"
							+ "..................||    ( ' )    ||.......       ...\r\n"
							+ "..................||    _(O)_    ||.......|ENTER |...\r\n"
							+ "..................||   / >=< \\   ||.......|==>> |...\r\n"
							+ "..................||__/_|_:_|_\\__||.................\r\n"
							+ "..................-----------------.................\r\n"
							+ "....................................................\r\n"
							+ "....................................................");
					scanner.nextLine();
					limparTela();
					jogando = false;
					break;
				}
			}

			if (jogando) {
				pontuacao++;
				if (pontuacao % 3 == 0) { // Aumentar o tempo de espera a cada 3 pontos
					tempoEspera += 1000;
				}
				System.out.println("Parabéns! Você acertou a sequência. Pontuação: " + pontuacao);
			}
		}

		if (pontuacao == limitePalavras) {
			System.out.println(YELLOW + "\nParabéns! Você completou o nível com sucesso!");
			System.out.println("_______AAAA____G_U_I_____AAAA_______\r\n" + "       VVVV               VVVV        \r\n"
					+ "       (__)               (__)\r\n" + "        \\ \\               / /\r\n"
					+ "         \\ \\   \\\\|||//   / /\r\n" + "          > \\   _   _   / <\r\n"
					+ " VOCÊ      > \\ / \\ / \\ / <\r\n" + " É O        > \\\\_o_o_// <\r\n"
					+ " GUARDIÃO DA > ( (_) ) <\r\n" + " MEMORIA      >|     |<\r\n" + "             / |\\___/| \\\r\n"
					+ "             / (_____) \\\r\n" + "             /         \\\r\n" + "              /   o   \\\r\n"
					+ "               ) ___ (   \r\n" + "              / /   \\ \\  \r\n"
					+ "             ( /     \\ )\r\n" + "             ><       ><\r\n"
					+ "            ///\\     /\\\\\\\r\n" + "            '''       '''");
			System.out.println(RESET);
			System.out.println("\n<< Pressione 'ENTER' para voltar ao menu >>>\n");
			scanner.nextLine();
			limparTela();
		}
	}

	public static void mostrarSequencia(ArrayList<String> lista) {
		System.out.print("Fui à feira comprar: ");
		for (int i = 0; i < lista.size(); i++) {
			if (i == lista.size() - 1) {
				System.out.println(colors[random.nextInt(0, 8)] + lista.get(i) + "." + RESET);
			} else {
				// Demais elementos: imprime com vírgula
				System.out.print(colors[random.nextInt(0, 8)] + lista.get(i) + ", " + RESET);
			}
		}
	}

	// Método para limpar a tela
	public final static void limparTela() throws IOException, InterruptedException {
		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");

	}

	// Método para aguardar por um tempo (simulação de "pausa")
	public static void esperar(int milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
