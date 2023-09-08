package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaLista {
    Lista lista = new Lista();
    String valor = null, resp = null;

    public void menu(Scanner escolha){
        do{
            System.out.println("Escolha a opção\n1->Inserir no Início:\n2->Remove Inicio:\n3->Pesquisar um valor:\n4->Listar valores da lista:");
            resp = escolha.next();
            if(resp.equals("1")){
                System.out.println("Digite um Valor: ");
                valor = escolha.next();
                lista.Insere_Inicio(valor);
            } else if (resp.equals("2")) {
                System.out.println("Digite um Valor");
                lista.removeInicio();
            } else if (resp.equals("3")) {
                System.out.println("Digite um Valor");
                valor = escolha.next();
                if(lista.Procura(valor) == true)
                    System.out.println("O valor existe na lista");
                else
                    System.out.println("O valor não existe na lista");
            } else if (resp.equals("4")) {
                ArrayList<String> listar = new ArrayList<String>();
                listar = lista.Listar();
                for(String elemento : listar){
                    System.out.println(elemento + " ");
                }
                System.out.println();
            }
            else
                System.out.println("opção inválida");
        }while(resp != "9");
    }
}