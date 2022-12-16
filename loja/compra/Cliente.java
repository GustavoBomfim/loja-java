package loja.compra;

import loja.compra.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    // quanto de dinheiro o cliente gastou na loja?
    // nome do cliente
    // List <loja.compra.Pedido>
    //ObterValorTotal()

    List<Pedido> compras = new ArrayList<>();

    double obterValorTotal(){
        double total =0;

        for(Pedido compra:compras){
            total += compra.obterValorTotal();
        }
        return total;
    }
}
