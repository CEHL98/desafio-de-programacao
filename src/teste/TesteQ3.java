package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import quetoes.Q03;

class TesteQ3 {

	@Test
	void test() {
		String palavra = "ovo";
		String palavra1 = "ifailuhkqq";
		Q03 instance = new Q03();
		
		//Asserts
		assertEquals(2,instance.contarAnagramas(palavra));
		assertEquals(3,instance.contarAnagramas(palavra1));
	}

}
