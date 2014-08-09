package br.com.empresa.banco;

import br.com.empresa.banco.sistema.AtualizadorDeContas;
import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.TipoCliente;

/**
 *
 * @author i03
 */
public class TestaAtualizador{
	public static void main (String[] args){
	
		Conta[] contas   = new Conta[15]; 

		// Exercicio 2.1
		AtualizadorDeContas adc = new AtualizadorDeContas(10);

		for (int i =0; i <=9; i++) {
			if (i < 4) {
				ContaPoupanca cp = new ContaPoupanca(new Cliente("Josias",TipoCliente.VIP));
                                if (i == 0 ) System.out.println("=== Conta Poupança ===");
				cp.deposita(123*i);
                                adc.aplicaTaxa(cp);
				contas[i] = cp;
			}else {
				Conta cc = new ContaCorrente(new Cliente("Josias",TipoCliente.UNIVERSITÁRIO));
                                if (i == 5 ) System.out.println("=== Conta Corrente ===");
				cc.deposita(123*i);
                                adc.aplicaTaxa(cc);
				contas[i] = cc;
			}	
		}

		System.out.println("Saldo Total: "+ adc.getSaldoTotal());

	}
}