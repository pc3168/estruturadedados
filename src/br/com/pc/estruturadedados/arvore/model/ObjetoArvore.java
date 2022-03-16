package br.com.pc.estruturadedados.arvore.model;

public abstract class ObjetoArvore<T> implements Comparable<T>{

    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
