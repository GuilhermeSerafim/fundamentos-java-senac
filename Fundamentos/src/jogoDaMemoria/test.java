package jogoDaMemoria;



import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste 2");
        String texto = scanner.next();

        clearConsole();

    }
    public final static void clearConsole()  throws IOException, InterruptedException
	{
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

	}
}
