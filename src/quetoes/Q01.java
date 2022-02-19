package quetoes;

// Importes 
import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {

		// Declaração de variaveis
		Scanner scan = new Scanner(System.in);
		int n;

		System.out.println("Digite um valor inteiro");
		n = scan.nextInt();

		// for responsavel por pecorrer cada linha
		for (int i = 1; i <= n; i++) {
			// for responsavel por pecorrer os * na mesma linha
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
