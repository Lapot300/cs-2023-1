package ex2;

import java.util.ArrayList;
import java.util.List;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Livro("Lojinha 1", 14.99, "Romance", "Machado de Assis");
        Produto p2 = new Livro("Lojinha 2", 19.99, "Conto", "Aluísio Azevedo");
        Produto p3 = new Mouse("Kabum", 750, "Mouse Gamer", "Logitech G PRO X SUPERLIGHT");
        Produto p4 = new Mouse("AliExpress", 1, "Mouse Gamer com RGB", "Mouse de 1 Real");

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(p1);
        carrinho.add(p2);
        carrinho.add(p3);
        carrinho.add(p4);

        carrinho.forEach(produto -> {
            System.out.println(produto.getDescricao());
        });

    }

}
