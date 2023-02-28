package exercicio1;

import java.util.Calendar;
import java.math.*;

public class Pessoa extends Universidade{
    private int idade;
    private int dia;
    private int mes;
    private int anoNascimento;
    private String nome;
    private String endereco;
    private String email;
    private String cpf;
   
    public Pessoa(){
        this.idade = getIdade();
        this.dia = getDia();
        this.mes = getMes();
        this.anoNascimento = getAnoNascimento();
        this.nome = getNome();
        this.endereco = getEndereco();
        this.email = getEmail();
        this.cpf = getCpf();

    }
    public void mostraNomeUniversidade(String nomeUniversidade){
        System.out.println("Nome: "+getNome());
        System.out.println("Universidade em que trabalha: "+informaNome(nomeUniversidade));
    }
    public void calculaIdade(){
        Calendar cal = Calendar.getInstance();
        int diaAtual = cal.get(Calendar.DATE);
        int mesAtual = cal.get(Calendar.MONTH);
        int anoAtual = cal.get(Calendar.YEAR);

        int anoResult = anoAtual - this.anoNascimento;
        int diaResult;
        int mesResult;
        if(diaAtual > this.dia){
            diaResult = diaAtual - this.dia;
        }else{
            diaResult = this.dia - diaAtual;
        }
        if(mesAtual > this.mes){
            mesResult = mesAtual - this.mes;
        }else{
            mesResult = this.mes - mesAtual;
        }
        System.out.println("Ano: "+anoResult+" anos");
        System.out.println("Mes: "+mesResult+" meses");
        System.out.println("Dia: "+diaResult+" dias");
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getMes(){
        return this.mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
