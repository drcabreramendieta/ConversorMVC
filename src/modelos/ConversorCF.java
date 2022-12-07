/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author hola
 */
public class ConversorCF {
    private double centigrados;
    private double fahrenheit;

    public void setCentigrados(double centigrados) {
        this.centigrados = centigrados;
        this.fahrenheit = this.centigrados * 1.8 + 32;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
    
    
}
