package br.com.empresa.banco.conta;

/**
 *
 * @author Josias soares
 */
public class ContaPoupanca extends Conta{
    
    public static final int VALOR_PADRAO_MULTIPLICACAO = 3;
    public static final double VALOR_DESCONTO_DEPOSITO = 0.10;

    public ContaPoupanca(Cliente cliente) {
    }

    @Override
    public void atualiza(double taxa){
        this.saldo += ((taxa*VALOR_PADRAO_MULTIPLICACAO)*this.saldo/100);
    }
    
    @Override
    public void deposita(double valor){
        super.deposita(valor);
        this.saldo = valor - VALOR_DESCONTO_DEPOSITO;
    }
}