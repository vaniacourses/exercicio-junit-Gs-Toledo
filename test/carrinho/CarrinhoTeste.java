package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTeste {
    private Carrinho cart;
    private Produto prod1;
    private Produto prod2;

    @BeforeEach
    public void inicializa() {
		cart = new Carrinho();
        prod1 = new Produto("troço", 2.00);
        prod2 = new Produto("bagulho", 399.00);

        cart.addItem(prod1);
        cart.addItem(prod2);
        
	}

    @DisplayName("Testa a busca por valor total do carrinho")
    @Test
    public void testBuscaValorCarrinho() {
        double valorTotalCarrinho = cart.getValorTotal();

        assertTrue(valorTotalCarrinho == 401.00);
    }

    @DisplayName("Testa adicionar item no carrinho")
    @Test
    public void testAdicionarItem() {
        Produto prod3 = new Produto("novo produto", 50.00);
        assertTrue(cart.getQtdeItems() == 2);
        cart.addItem(prod3);
        assertTrue(cart.getQtdeItems() == 3);
    }

    @DisplayName("Testa quantidade de items no carrinho")
    @Test
    public void testQuantidadeItemCarrinho() {
        assertTrue(cart.getQtdeItems() == 2);
    }

    @DisplayName("Testa limpa carrinho")
    @Test
    public void testLimpaCarrinho() {
        assertTrue(cart.getQtdeItems() == 2);
        cart.esvazia();
        assertTrue(cart.getQtdeItems() == 0);
    }


}