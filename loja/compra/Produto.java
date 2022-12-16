package loja.compra;

public class Produto {
    // preço e nome do produto
    String nomeProduto;
    String marca;
    double precoProduto;
    String sexo;

    public Produto(String nomeProduto, String marca, double precoProduto, String sexo){
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.precoProduto = precoProduto;
        this.sexo = sexo;
    }

}
