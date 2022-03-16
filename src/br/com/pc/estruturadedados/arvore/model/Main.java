package br.com.pc.estruturadedados.arvore.model;

import br.com.pc.estruturadedados.arvore.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Objeto> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Objeto(80));
        minhaArvore.inserir(new Objeto(20));
        minhaArvore.inserir(new Objeto(10));
        minhaArvore.inserir(new Objeto(5));
        minhaArvore.inserir(new Objeto(4));
        minhaArvore.inserir(new Objeto(30));
        minhaArvore.inserir(new Objeto(29));
        minhaArvore.inserir(new Objeto(34));
        minhaArvore.inserir(new Objeto(32));
        minhaArvore.remover(new Objeto(12));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
