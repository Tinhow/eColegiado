package br.edu.ifpb.pweb2.ecolegiado.ecolegiado.modelo;

public class Professor extends Usuario{
    boolean coordenador;

    public Professor(int id, String nome, String email, String matricula, Boolean administrador,
     String telefone, String login, String senha) {
        super(id, nome, email, matricula, administrador, telefone, login, senha);
        this.setAdministrador(true);
        this.coordenador = false;
    }
    
    public boolean isCoordenador() {
        return coordenador;
    }

    public void setCoordenador(boolean coordenador) {
        this.coordenador = coordenador;
    }
}
