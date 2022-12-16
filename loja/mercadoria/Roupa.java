package loja.mercadoria;

import loja.compra.Produto;

public class Roupa extends Produto {

    String tamanho;
    String tipo;
    String cor;

    public Roupa(String nome, String marca, double preco, String sexo,
                   String tamanho, String tipo, String cor){

        super(nome,marca, preco, sexo);
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
    }
}
