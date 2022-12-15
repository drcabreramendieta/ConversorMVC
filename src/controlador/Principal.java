/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelos.ConversorCF;
import vista.Ventana1;
import vista.Ventana;
/**
 *
 * @author hola
 */
public class Principal {
    public static void main(String[] args){
        ConversorCF m = new ConversorCF();
        Ventana v = new Ventana1();
        ManejadorConvertir c = new ManejadorConvertir(v,m);
        v.convertirListener(c);
        m.addListener(v.getFListener());
        v.setVisible(true);
    }
}
