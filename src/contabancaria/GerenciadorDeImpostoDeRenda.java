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
public class GerenciadorDeImpostoDeRenda{
    private double totalTributos;
    
    public void adiciona(Tributavel t){
        this.totalTributos += t.calculaTributos();
    }

    public double getSomaTributos() {
        return totalTributos;
    }
    
}
