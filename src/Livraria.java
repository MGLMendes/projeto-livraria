import model.Cliente;
import model.Produto;
import model.enuns.TipoProduto;
import repositories.EstoqueService;
import services.Compra;
import services.EstoqueController;

import java.time.LocalDate;
import java.util.List;


public class Livraria {
    public static void main(String[] args) {


        EstoqueService estoqueService = new EstoqueService();
        EstoqueController estoque = new EstoqueController(estoqueService);
        estoque.carregarEstoque();


        estoque.verProdutoEspecifico(TipoProduto.LIVROS);

        Cliente miguel = new Cliente("Miguel", "123456789", "11155599900", LocalDate.parse("2003-08-22"));


        Compra compra = new Compra(miguel);
        compra.comprar(1, 50.0);
    }
}
