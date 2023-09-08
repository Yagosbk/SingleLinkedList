package org.example;

public class Node {
    private Node proximo;
    private String valor;

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getValor(){
        return valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
