package exercicio7;

public class Principal {
  public static void main(String[] args) {
    Elevador e1 = new Elevador(3, 5);

    e1.setAndarAtual(0);
    e1.entra();
    e1.sobe();
    e1.entra();
    e1.entra();
    e1.entra();
    e1.entra();
    e1.entra();
    e1.sobe();
    e1.sobe();
    e1.sobe();
    e1.relatorioElevador();
    e1.desce();
 e1.relatorioElevador();
 e1.entra();
 e1.relatorioElevador();
   
    
  }
}
