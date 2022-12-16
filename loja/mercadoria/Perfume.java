package loja.mercadoria;

import loja.compra.Produto;

public class Perfume extends Produto {
    String fragancia;
    int ml;

    public Perfume(String nome, String marca, double preco, String sexo,
            String fragancia, int ml){

        super(nome,marca, preco, sexo);
        this.fragancia = fragancia;
        this.ml = ml;
    }
}
