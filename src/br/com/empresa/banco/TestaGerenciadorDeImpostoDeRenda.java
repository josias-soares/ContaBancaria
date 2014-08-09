/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.Cliente;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.sistema.GerenciadorDeImpostoDeRenda;
import br.com.empresa.banco.sistema.SeguroDeVida;
import br.com.empresa.banco.conta.TipoCliente;

/**
 *
 * @author i03
 */
public class TestaGerenciadorDeImpostoDeRenda {
    public static void main(String args[]){
        GerenciadorDeImpostoDeRenda gerenc = new GerenciadorDeImpostoDeRenda();
        
        SeguroDeVida sv = new SeguroDeVida();
        gerenc.adiciona(sv);
        
        ContaCorrente cc = new ContaCorrente(new Cliente("Josias", TipoCliente.CORPORATIVO));
        cc.deposita(1000);
        gerenc.adiciona(cc);
        
        System.out.println("Total de tributos: " + gerenc.getSomaTributos());
        
    }
    
}
