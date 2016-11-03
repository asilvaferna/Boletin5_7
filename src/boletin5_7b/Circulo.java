/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_7b;

/**
 *
 * @author Adri
 */
public class Circulo {
    private float radio;
    final double PI = 3.14;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio ;
    }
    
    public void areaCirculo(float radio){
        System.out.println("Area: " + (PI * Math.pow(radio, 2)));
    }
    
}
