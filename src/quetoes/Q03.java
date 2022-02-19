package quetoes;

//Importes 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

	public static int verificaAnagrama(String subString1, String subString2) {

		if (subString1.length() != subString2.length()) {
			return 0;
		}

		subString1 = subString1.toLowerCase();
		subString2 = subString2.toLowerCase();

		char[] tempString1 = subString1.toCharArray();
		char[] tempString2 = subString2.toCharArray();

		Arrays.sort(tempString1);
		Arrays.sort(tempString2);

		if (Arrays.equals(tempString1, tempString2)) {
			return 1;
		}

		return 0;
	}

	public static int contarAnagramas(String str) {
		ArrayList<String> subStrings = new ArrayList<>();
		// Armazenar Todas as subStrings
		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {
				subStrings.add(str.substring(i, j));

			}
		}
		int contador = 0;

		// Deve pecorrer até o penultimo elemento do arrayList
		for (int i = 0; i < subStrings.size(); i++) {
			for (int j = i + 1; j < subStrings.size(); j++) {
				// comparar a subtrings e contabilizar o número de pares de anagramas
				contador = contador + verificaAnagrama(subStrings.get(i), subStrings.get(j));

			}
		}
		return contador;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);;
		String str;
		int contador = 0;

		System.out.println("Digite uma string:");
		str = scan.nextLine();

		System.out.println("Número de pares de anagramas: " + contarAnagramas(str));

	}
}
