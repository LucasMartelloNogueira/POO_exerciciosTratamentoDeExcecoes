package Questao2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float ValorLimite;

    public ContaCorrente(float limite, float saldo, float ValorLimite){
        this.limite = limite;
        this.saldo = saldo;
        this.ValorLimite = ValorLimite;
    }

    public float getLimite(){
        return this.limite;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void sacar(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("erro, valor deve ser maior que zero");
        }
        else if (valor > ValorLimite){
            throw new IllegalArgumentException("erro, valor acima do limite permitido");
        }
        else{
            this.saldo -= valor;
            System.out.println("valor sacado: " + valor);
        }
    }

    public void depositar(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("erro, valor deve ser maior que zero");
        }
        else{
            this.saldo += valor;
            System.out.println("valor depositado: " + valor);
        }
    }

    public void setValorLimite(float valor){
        if (valor <= 0){
            throw new IllegalArgumentException("erro, valor deve ser maior que zero");
        }
        else{
            this.ValorLimite = valor;
        }
    }

}
