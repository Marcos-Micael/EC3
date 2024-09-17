public class Professor extends Usuario {
    public Professor(String nome) {
        super(nome);
    }

    public boolean bloqueiaLivro(Livro it, int prazo) {
        return it.bloqueia((Usuario) this, prazo);
    }

    public boolean desbloqueiaLivro(Livro it) {
        return it.desbloqueia(this);
    }

    @Override
    public int getCotaMaxima() { //Reescrita
        return 5;
    }

    @Override
    public int getPrazoMaximo() { //Reescrita
        return 14;
    }

    @Override
    public boolean isProfessor() { //Reescrita
        return true;
    }

    @Override
    public String toString() { //Reescrita
        return "Prof. " + getNome();
    }
}