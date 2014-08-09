package br.com.empresa.banco.conta;

import br.com.empresa.banco.sistema.Tributavel;

/**
 *
 * @author Josias soares
 */
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void deposita(double valor){
            this.saldo = valor - 0.1;
    }

    @Override
    public double calculaTributos() {
        return (getSaldo() * 0.01);
    }
}