package org.example;

import java.util.ArrayList;

public class Lista {
    private Node primeiro = null;

    public Node getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }


    public ArrayList<String> Listar() throws IllegalArgumentException {
        ArrayList<String> lista = new ArrayList<String>();
        if(primeiro == null)
            throw new IllegalArgumentException("A lista está vazia");
        else{
            Node aux = getPrimeiro();
            while(aux != null){
                String vl = aux.getValor();
                lista.add(vl);
                aux = aux.getProximo();
            }
            return lista;
        }

    }

    public boolean Procura(String valor){
        Node aux = getPrimeiro();
        while(aux != null){
            if(valor.equals(aux.getValor())){
                return true;
            }
            aux = aux.getProximo();
        }
        return false;
    }

    public void Insere_Inicio(String valor){
        Node novo = new Node();
        novo.setProximo(primeiro);
        novo.setValor(valor);
        setPrimeiro(novo);

    }

    public void Insere_Fim(String valor){
        Node novo = new Node();
            novo.setValor(valor);
            primeiro = novo;
    }

    public void removeInicio(){
        primeiro = primeiro.getProximo();
    }
}