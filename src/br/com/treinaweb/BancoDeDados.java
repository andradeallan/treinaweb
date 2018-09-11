package br.com.treinaweb;

public interface BancoDeDados {

    void adicionar(String nome, String dados);
    void deletar(String nome);
    String pegar(String nome);

}
