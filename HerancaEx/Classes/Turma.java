package HerancaEx.Classes;

public class Turma {
    protected Aluno aluno;

    public Turma(){

    }
    public Turma(Aluno aluno){
        this.aluno = aluno;
    }
    public void matricular(Aluno aluno){
        int mat = aluno.getMatricula();
        System.out.println("Matriculado.");
        System.out.println("Número de matricula: "+mat);
    }
    public void trancarMatricula(Aluno aluno){
        System.out.println("Matricula trancada");
    }
    
}
