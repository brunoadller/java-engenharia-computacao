package exercicio5;
import java.util.Scanner;

/*
 * Faça uma programa para representar a árvore
genealógica de uma família. Para tal, crie uma
classe Pessoa que permita indicar, além de nome
e idade, o pai e a mãe. Tenha em mente que pai e
mãe também são do tipo Pessoa.
 */
public class ArvoreGenealogica{
  public static void main(String[] args) {
    Pessoa pai = new Pessoa();
    Pessoa mae = new Pessoa();

    Scanner scan = new Scanner(System.in);
    System.out.println("Qual o nome do  seu pai: ");
    pai.setNome(scan.next());
    System.out.println("Informe a idade do pai: ");
    pai.setIdade(scan.nextInt());
    System.out.println("Informe o nome da mãe: ");
    mae.setNome(scan.next());
    System.out.println("Informe o nome da mãe: ");
    mae.setIdade(scan.nextInt());

    System.out.println("=========================");
    System.out.println("Nome Pai.....: "+pai.getNome());
    System.out.println("Idade Pai....: "+pai.getIdade());
    System.out.println("Nome da Mãe..: "+mae.getNome());
    System.out.println("Idade da Mãe.: "+mae.getIdade());
    System.out.println("=========================");

  }
}