package exercicio1;
public class Principal{

    public static void main(String args[]){
        Pessoa p1, p2; 
        p1 = new Pessoa();
        p1.setNome("Alber Einstein");
        p1.mostraNomeUniversidade("Princeton - EUA");


        p2 = new Pessoa();
        p2.setNome("Isaac Newton");
        p2.mostraNomeUniversidade("Cambridge - Inglaterra");


    }
}