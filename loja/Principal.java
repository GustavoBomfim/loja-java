package loja;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        // Comando para ler entrada de dados digitadas pelo usuário
        Scanner ler = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("*** SEJA BEM-VINDO A LOJA ***");
        System.out.println("*****************************\n");

        // Opções de comando
        System.out.println("O que você deseja fazer hoje?");
        System.out.println("1 - Ver produtos da loja \n" +
                "2 - Consultar suas compras");
        int option = ler.nextInt();
        System.out.println();

        // Ver Produtos da loja
        if(option == 1){

        }
        // Consultar suas compras
        else if(option == 2){

        }
    }
}
