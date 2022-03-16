package br.com.pc.estruturadedados.arvore;

public class NoBinario <T extends Comparable<T>> {

    private T conteudo;
    private NoBinario<T> noEsq;
    private NoBinario<T> noDir;

    public NoBinario(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public NoBinario() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBinario<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(NoBinario<T> noEsq) {
        this.noEsq = noEsq;
    }

    public NoBinario<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(NoBinario<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "NoBinario{" +
                "conteudo=" + conteudo +
                '}';
    }
}
