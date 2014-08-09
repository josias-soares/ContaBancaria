package br.com.empresa.banco.conta;

import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.ValorInvalidoException;

/**
 *
 * @author Josias soares
 */
public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(){
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPegarSaldo(){
            return this.saldo;
    }

    public double getSaldo(){
            return this.saldo;
    }

    public void deposita(double valor){
        if (valor < 0) {
            throw new ValorInvalidoException(valor);
        }
        else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
            if (this.saldo >= valor) {
                    this.saldo -= valor;
            }
    }

    public void atualiza(double taxa){
      this.saldo += ((taxa*getCliente().getTipoCliente().getFatorMultiplicacao())*this.saldo/100);
    }
}