/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author hola
 */
public abstract class Ventana extends javax.swing.JFrame {
    public abstract String getCentigrados();
    public abstract void setFahrenheit(String fahr);
    public abstract void convertirListener(ActionListener l);
}
