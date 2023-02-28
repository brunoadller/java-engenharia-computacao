package HerancaEx.Classes;

public class Projeto {
    protected String titulo;
    protected String inicio;
    protected String final;
    protected  Servidor coordenador;
    protected Usuario equipe;

    public Projeto(){

    }
    public Projeto(String titulo, String inicio, String final, Servidor coordenador, Usuario equipe){
        this.titulo = titulo;
        this.inicio = inicio;
        this.final = final;
        this.coordenador = coordenador;
        this.equipe = equipe;
    }
    public  String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getInicio(){
        return this.inicio;
    }
    public void setInicio(String inicio){
        this.inicio = inicio;
    }
    public  String getFinal(){
        return this.final;
    }
    public void setFinal(String final){
        this.final = final;
    }
    public Servidor getCoordenador(){
        return this.coordenador;
    }
    public void setCoordenador(Servidor coordenador){
        this.coordenador = coordenador;
    }
    public Usuario getEquipe(){
        return this.equipe;
    }
    public void setEquipe(Usuario equipe){
        this.equipe = equipe;
    }
}
