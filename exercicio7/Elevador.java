package exercicio7;

public class Elevador {
  private Integer andarAtual;
  private Integer totalAndares;
  private Integer capacidadeElevador;
  private Integer pessoasPresentes = 0;
  public Integer getAndarAtual() {
    return andarAtual;
  }

  public void relatorioElevador(){
    System.out.println("===========================================");
    System.out.println("Andar Atual...........: "+this.getAndarAtual());
    System.out.println("Total Andares.........: "+this.getTotalAndares());
    System.out.println("Capacidade do Elevador: "+this.getCapacidadeElevador());
    System.out.println("Pessoa Presentes......: "+this.getPessoasPresentes());
    System.out.println("============================================");
  }
  public Elevador(Integer totalAndares, Integer capacidadeElevador) {
    this.totalAndares = totalAndares;
    this.capacidadeElevador = capacidadeElevador;
  }
  public void entra(){
    if(this.getPessoasPresentes() == this.getCapacidadeElevador()){
      System.out.println("Elevador cheio!");
    }else{
      this.setPessoasPresentes(this.pessoasPresentes + 1);
    }
  }
  public void sai(){
    if(this.getPessoasPresentes() == 0){
      System.out.println("Ninguem presente no elevador: ");
    }else{
      this.setPessoasPresentes(pessoasPresentes - 1);
    }
  }
  public void setAndarAtual(Integer andarAtual) {
    this.andarAtual = andarAtual;
  }
  public void sobe(){
    if(this.getAndarAtual() == this.getTotalAndares()){
      System.out.println("Ultimo andar, não há mais andares para subir!");
    }else{
      this.setAndarAtual( andarAtual + 1);
    }
  }
  public void desce(){
    if(this.getAndarAtual() == 0){
      System.out.println("Voce esta no terreo, sem mais andares para descer escolha outro andar ou saia.");
    }else{
      this.setAndarAtual(andarAtual - 1);
    }
  }
  public Integer getTotalAndares() {
    return totalAndares;
  }
  public void setTotalAndares(Integer totalAndares) {
    this.totalAndares = totalAndares;
  }
  public Integer getCapacidadeElevador() {
    return capacidadeElevador;
  }
  public void setCapacidadeElevador(Integer capacidadeElevador) {
    this.capacidadeElevador = capacidadeElevador;
  }
  public Integer getPessoasPresentes() {
    return pessoasPresentes;
  }
  public void setPessoasPresentes(Integer pessoasPresentes) {
    this.pessoasPresentes = pessoasPresentes;
  }

  


}
