package loja.mercadoria;

import loja.compra.Produto;

public class Acessorios extends Produto {

    String tipoAcessorio;
    String modeloAcessorio;
    String material;
    String cor;

    public Acessorios(String nome, String marca, double preco, String sexo,
            String tipoAcessorio, String modeloAcessorio, String material, String cor){
        super(nome,marca, preco, sexo);
        this.tipoAcessorio = tipoAcessorio;
        this.modeloAcessorio = modeloAcessorio;
        this.material = material;
        this.cor = cor;
    }
}
