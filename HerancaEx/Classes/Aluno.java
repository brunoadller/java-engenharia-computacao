package HerancaEx.Classes;

public class Aluno extends Usuario{
    protected int matricula;
    protected String ingresso;

    public Aluno(){

    }
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getIngresso(){
        return this.ingresso;
    }
    public void setIngresso(String ingresso){
        this.ingresso = ingresso;
    }
    public void calculaCoeficiente(){
        System.out.println("calculando ....");
    }
}
