/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author hola
 */
public class FahrenheitListener implements PropertyChangeListener{
    Ventana v;

    public FahrenheitListener(Ventana v) {
        this.v = v;
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        v.setFahrenheit(pce.getNewValue()+"");
    }
    
}
