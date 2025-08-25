package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a SOMA de dois numeros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}

	@DisplayName("Testa Subtração de dois numeros")
	@Test
	public void testSubtracaoDoisNumeros() {
		int subtracao = calc.subtracao(8,5);
		Assertions.assertEquals(3, subtracao);
	}

	@DisplayName("Testa Divisão de dois números")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}

	@DisplayName("Testa Multiplicação de dois números")
	@Test
	public void testMultiplicacaoDoisNumeros() {
		int multiplicacao = calc.multiplicacao(2, 4);
		assertTrue(multiplicacao == 8);
	}

	@DisplayName("Testa Somatorio de 'N' Números")
	@Test
	public void testSomatorio() {
		int somatorio = calc.somatoria(5);
		assertTrue(somatorio == 15);
	}

	@DisplayName("Testa numero é positivo")
	@Test
	public void testNumeroPositivo() {
		assertTrue(calc.ehPositivo(5));
	}

	@DisplayName("Testa numero é negativo")
	@Test
	public void testNumeroNotPositivo() {
		assertFalse(calc.ehPositivo(-5));
	}

	@DisplayName("Testa comparação de numeros iguais")
	@Test
	public void testComparaNumeroIgual() {
		int resultadoComparacao = calc.compara(1,1);
		assertTrue(resultadoComparacao == 0);
	}

	@DisplayName("Testa comparação de numero A maior que B")
	@Test
	public void testComparaNumeroMaior() {
		int resultadoComparacao = calc.compara(4,1);
		assertTrue(resultadoComparacao == 1);
	}

	@DisplayName("Testa Comparação de numero A menor que B")
	@Test
	public void testComparaNumeroMenor() {
		int resultadoComparacao = calc.compara(1,4);
		assertTrue(resultadoComparacao == -1);
	}

	

	@DisplayName("Testa Divisão por zero")
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

}
