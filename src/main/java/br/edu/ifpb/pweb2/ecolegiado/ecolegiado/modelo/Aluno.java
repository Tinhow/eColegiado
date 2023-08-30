package br.edu.ifpb.pweb2.ecolegiado.ecolegiado.modelo;

public class Aluno extends Usuario{

    public Aluno(int id, String nome, String email,String matricula, Boolean administrador, String telefone, String login, String senha) {
        super(id, nome, email, matricula, administrador, telefone, login, senha );
        this.setAdministrador(false);
    }
    
}
