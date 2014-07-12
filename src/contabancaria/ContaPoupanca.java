package contabancaria;

/**
 *
 * @author Josias soares
 */
public class ContaPoupanca extends Conta{
    @Override
    public void atualiza(double taxa){
            this.saldo += ((taxa*3)*this.saldo/100);
    }
    
    @Override
    public void depositar(double valor){
            this.saldo += valor;
    }
}