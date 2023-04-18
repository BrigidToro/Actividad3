package com.mycompany.figurasgeometrica;
public class Rectangle {
    
    private double base;
    private double altura;
    
    public Rectangle(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}