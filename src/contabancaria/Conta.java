package contabancaria;

/**
 *
 * @author Josias soares
 */
public abstract class Conta {
    public double saldo;

    public Conta(){

    }

    public double getPegarSaldo(){
            return this.saldo;
    }

    public double getSaldo(){
            return this.saldo;
    }

    public void depositar(double valor){
            this.saldo += valor;
    }

    public void sacar(double valor){
            if (this.saldo >= valor) {
                    this.saldo -= valor;
            }
    }

    public abstract void atualiza(double taxa);
}