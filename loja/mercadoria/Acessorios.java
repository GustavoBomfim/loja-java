package loja.mercadoria;

import loja.compra.Produto;

public class Acessorios extends Produto {

    String tipoAcessorio;
    String modeloAcessorio;
    String material;
    String cor;
    private int quantidade;

    public Acessorios(String nome, String marca, double preco, String sexo,
            String tipoAcessorio, String modeloAcessorio, String material, String cor){
        super(nome,marca, preco, sexo);
        this.tipoAcessorio = tipoAcessorio;
        this.modeloAcessorio = modeloAcessorio;
        this.material = material;
        this.cor = cor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
