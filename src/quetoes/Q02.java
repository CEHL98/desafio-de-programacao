package quetoes;

//Importes
import java.util.Scanner;

public class Q02 {
	
	//Verificar as senhas
	public static String verificarSenha (String senha) {
		
		if (senha.length() < 6) // verifica se tem pelo menos 6 digitos
		{
			return	"A senha deveria conter no mínimo 6 caracteres. Faltam: " + (6 - senha.length());

		} else if (!senha.matches("(?=.*[a-z]).{6,}")) // verifica caracteres minúsculo
		{
			return "A senha deveria conter no mínimo 1 letra em minúsculo";

		} else if (!senha.matches("(?=.*[A-Z]).{6,}")) // verifica caracteres maiúsculo
		{
			return "A senha deveria conter no mínimo 1 letra em maiúsculo";

		} else if (!senha.matches("(?=.*[!@#$%^&*()-+]).{6,}")) // verifica caracteres especiais
		{

			return "A senha deveria conter no mínimo 1 caractere especial";

		} else if (!senha.matches("(?=.*[0-9]).{6,}")) // verifica se contem um digito
		{
			return "A senha deve conter no mínimo 1 digito";

		} else {
			return "Senha forte";
		}
		

	}
	
	public static void main(String[] args) {

		// Declaração de variaveis
		Scanner scan = new Scanner(System.in);
		String senha;

		System.out.println("Digite uma senha:");
		senha = scan.nextLine();

		System.out.println(verificarSenha(senha));

	}

}
