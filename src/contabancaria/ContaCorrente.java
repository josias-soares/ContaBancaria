package contabancaria;

/**
 *
 * @author Josias soares
 */
public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa){
            this.saldo += ((taxa*2)*this.saldo/100);
    }

    @Override
    public void depositar(double valor){
            this.saldo = valor - 0.1;
    }
}