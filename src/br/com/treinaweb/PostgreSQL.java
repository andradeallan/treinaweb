package br.com.treinaweb;

public class PostgreSQL extends BancoDeDadosBasico implements BancoDeDados {

    private String nome;
    private String username;
    private String password;
    private String url;

    public PostgreSQL() {
    }

    public PostgreSQL(String nome1, String username, String password, String url) {
        this.nome = nome;
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void adicionar(String nome, String dados) {
        System.out.println(url);
    }

    @Override
    public void deletar(String nome) {

    }

    @Override
    public String pegar(String nome) {
        return null;
    }

}
