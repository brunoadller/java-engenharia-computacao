package TryCatch.exercicio1;

public class ContaCorrente {
    private float saldo;

    public float getSaldo(){
        return this.saldo;
    }
    public void deposita(float saldo){
        this.saldo += saldo;
    }
    
}
