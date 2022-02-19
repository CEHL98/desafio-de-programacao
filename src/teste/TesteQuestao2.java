package teste;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import quetoes.Q02;

class TesteQuestao2 {

	@Test
	void test() {

		String senha = "Ya3";
		String senha1 = "Ya3&ab";
		Q02 instance = new Q02();
		
		//Asserts
		assertEquals("A senha deveria conter no mínimo 6 caracteres. Faltam: 3", instance.verificarSenha(senha));
		assertEquals("Senha forte", instance.verificarSenha(senha1));
		
		
	}
}
