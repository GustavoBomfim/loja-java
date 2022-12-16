package loja.banco;

import loja.mercadoria.Acessorios;

public class Estoque {
    public static void main(String[] args) {
        Acessorios relogio = new Acessorios("Relógio Ômega", "Calvin Klein",
                358.60, "M", "Relógio", "Casual",
                "Quartzo e Prata", "Prata");

        relogio.setQuantidade(15);

    }


}
