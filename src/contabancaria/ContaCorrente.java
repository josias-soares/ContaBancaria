package contabancaria;

/**
 *
 * @author Josias soares
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    

    @Override
    public void depositar(double valor){
            this.saldo = valor - 0.1;
    }
}