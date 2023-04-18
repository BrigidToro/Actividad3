package com.mycompany.figurasgeometrica;

public class Square {

    private double lado;

    public Square(double lado) {
        this.lado = lado; 
    }

    public void setlado(double lado){
        this.lado = lado;
    }
    
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}