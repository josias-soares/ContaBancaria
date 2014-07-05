package contabancaria;

/**
 *
 * @author Josias soares
 */
public class Conta {
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

    public void atualiza(double taxa){
            this.saldo += (taxa*this.saldo/100);
    }
}