package com.mycompany.figurasgeometrica;
public class Circle {

    private double radio;
    
    public Circle(double radio){
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }
}