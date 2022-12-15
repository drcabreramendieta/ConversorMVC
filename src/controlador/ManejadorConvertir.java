/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Ventana;
import modelos.ConversorCF;

/**
 *
 * @author hola
 */
public class ManejadorConvertir implements ActionListener {
    private Ventana v;
    private ConversorCF m;

    public ManejadorConvertir(Ventana v, ConversorCF m) {
        this.v = v;
        this.m = m;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        m.setCentigrados(Double.parseDouble(v.getCentigrados()));
    }
    
}
