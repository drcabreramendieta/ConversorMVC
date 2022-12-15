/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author hola
 */
public class ConversorCF {
    private double centigrados;
    private double fahrenheit;
    private PropertyChangeSupport mPcs;

    public ConversorCF() {
        mPcs = new PropertyChangeSupport(this);
    }
    
    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
        double oldFahr = this.fahrenheit;
        this.fahrenheit = this.centigrados * 1.8 + 32;
        mPcs.firePropertyChange("fahrenheit", 
                oldFahr, 
                this.fahrenheit);
    }
    
    public void addListener(PropertyChangeListener pcl){
        mPcs.addPropertyChangeListener(pcl);
    }
    
    public void removeListener(PropertyChangeListener pcl){
        mPcs.removePropertyChangeListener(pcl);
    }
}
