/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco.sistema;

import br.com.empresa.banco.sistema.Tributavel;

/**
 *
 * @author i03
 */
public class SeguroDeVida implements Tributavel{

    @Override
    public double calculaTributos() {
        return 42;
    }
    
}
