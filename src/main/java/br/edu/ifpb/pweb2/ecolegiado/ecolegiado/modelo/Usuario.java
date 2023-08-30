package br.edu.ifpb.pweb2.ecolegiado.ecolegiado.modelo;

public class Usuario {

   private int id;
    private String nome;
    private String telefone;
    private String email;
    private Boolean administrador;
    private String matricula;
    private String login;
    private String senha;

    
    public Usuario(int id, String nome, String telefone, String email, Boolean administrador, String matricula, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.administrador = administrador;
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
    }


    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Boolean getAdministrador() {
        return administrador;
    }


    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
       
        
}
