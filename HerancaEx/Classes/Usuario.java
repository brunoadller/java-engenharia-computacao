package HerancaEx.Classes;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;

    public Usuario(){
        
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void login(){
        if(this.senha == getSenha()){
            System.out.println("Login efetivado");
            
        }else{
            System.out.println("Senha inválida");
            
        }
    }
    public void imprimir(){
        System.out.println("------------SUA CONTA------------");
        System.out.println();
        System.out.println();
        System.out.println("Nome: "+getNome());
        System.out.println("Email: "+getEmail());
    }
}
