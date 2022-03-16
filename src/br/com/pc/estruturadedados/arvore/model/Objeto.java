package br.com.pc.estruturadedados.arvore.model;

import java.util.Objects;

public class Objeto extends ObjetoArvore<Objeto>{

    private Integer novoValor;

    public Objeto(Integer novoValor){
        this.novoValor = novoValor;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Objeto obj = (Objeto) o;
        return Objects.equals(novoValor, obj.novoValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(novoValor);
    }

    @Override
    public int compareTo(Objeto outro) {
        int i = 0;

        if(this.novoValor > outro.novoValor){
            i = 1;
        }else if(this.novoValor < outro.novoValor){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return novoValor.toString();
    }
}
