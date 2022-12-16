package loja.compra;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // list <Itens>
    List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }
    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.precoProduto;
        }
        return total;
    }
}
