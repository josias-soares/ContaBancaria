/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contabancaria;

import interfaces.Tributavel;

/**
 *
 * @author i03
 */
public class TesteTributavel {
    public static void main(String args[]){
        ContaCorrente cc  = new ContaCorrente(new Cliente("Josias",TipoCliente.UNIVERSITÁRIO));
        cc.depositar(1000);
        System.out.println(cc.calculaTributos());
        
        //Testando o polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        
        
    }
    
}
