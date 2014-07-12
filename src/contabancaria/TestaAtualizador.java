package contabancaria;

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
				Conta cp = new ContaPoupanca();
                                if (i == 0 ) System.out.println("=== Conta Poupança ===");
				cp.depositar(123*i);
                                adc.aplicaTaxa(cp);
				contas[i] = cp;
			}else {
				Conta cc = new ContaCorrente();
                                if (i == 5 ) System.out.println("=== Conta Corrente ===");
				cc.depositar(123*i);
                                adc.aplicaTaxa(cc);
				contas[i] = cc;
			}	
		}

		System.out.println("Saldo Total: "+ adc.getSaldoTotal());

	}
}