package quetoes;

//Importes
import java.util.Scanner;

public class Q02 {
	
	//Verificar as senhas
	public static String verificarSenha (String senha) {
		
		if (senha.length() < 6) // verifica se tem pelo menos 6 digitos
		{
			return	"A senha deveria conter no m�nimo 6 caracteres. Faltam: " + (6 - senha.length());

		} else if (!senha.matches("(?=.*[a-z]).{6,}")) // verifica caracteres min�sculo
		{
			return "A senha deveria conter no m�nimo 1 letra em min�sculo";

		} else if (!senha.matches("(?=.*[A-Z]).{6,}")) // verifica caracteres mai�sculo
		{
			return "A senha deveria conter no m�nimo 1 letra em mai�sculo";

		} else if (!senha.matches("(?=.*[!@#$%^&*()-+]).{6,}")) // verifica caracteres especiais
		{

			return "A senha deveria conter no m�nimo 1 caractere especial";

		} else if (!senha.matches("(?=.*[0-9]).{6,}")) // verifica se contem um digito
		{
			return "A senha deve conter no m�nimo 1 digito";

		} else {
			return "Senha forte";
		}
		

	}
	
	public static void main(String[] args) {

		// Declara��o de variaveis
		Scanner scan = new Scanner(System.in);
		String senha;

		System.out.println("Digite uma senha:");
		senha = scan.nextLine();

		System.out.println(verificarSenha(senha));

	}

}
