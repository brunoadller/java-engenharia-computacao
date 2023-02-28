import java.util.*;
public class TryCatch {
        private float   valor;
        private float contador = 1;
        private float soma = 0;
        private float media = 0;
        
        public void teste(){
            Random gerarValor = new Random();
            try{
                do{
                    valor = gerarValor.nextInt(5);
                    soma += valor;
                    contador++;
                    if(soma > 100){
                        throw new ExcecaoAcimaDeCem("Acima de cem");
                    }
                }while(soma <= 100);
                media = (soma)/contador;
                System.out.println("Soma dos valores: "+soma);
                System.out.println("Media das somas: "+media);
            }catch(ExcecaoAcimaDeCem e){
                System.out.println(e);
            }
        }
}
