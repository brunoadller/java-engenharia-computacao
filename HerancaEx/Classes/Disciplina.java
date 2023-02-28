package HerancaEx.Classes;

public class Disciplina {
    protected String titulo;
    protected String ementa;

    public Disciplina(){

    }
    public Disciplina(String titulo, String ementa){
        this.titulo = titulo;
        this.ementa = ementa;
    }
    public String getTitulo(){
        return this.titulo;

    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getEmenta(){
        return this.ementa;
    }
    public void setEmenta(String ementa){
        this.ementa = ementa;
    }
    public void addTurma(){
        
    }
}
