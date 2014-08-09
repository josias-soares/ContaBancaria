/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.TipoCliente;
import br.com.empresa.banco.sistema.Tributavel;

/**
 *
 * @author i03
 */
public class TesteTributavel {
    public static void main(String args[]){
        ContaCorrente cc  = new ContaCorrente(new Cliente("Josias",TipoCliente.UNIVERSITÁRIO));
        cc.deposita(1000);
        System.out.println(cc.calculaTributos());
        
        //Testando o polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        
    }
    
}
