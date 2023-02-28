package HerancaEx.Classes;

public class Bolsista extends Aluno {
    protected Projeto projeto;

    public Bolsista(){
        
    }
    public Bolsista(Projeto projeto){
        this.projeto = projeto;
    }
    public Projeto getProjeto(){
        return this.projeto;
    }
    pulic void setProjeto(Projeto projeto){
        this.projeto = projeto;
    }

}
