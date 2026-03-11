import java.util.Scanner;
// Aula 02 - Testes com Scanner
public class Aula02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Olá " + nome);
        }
    }
	
}
