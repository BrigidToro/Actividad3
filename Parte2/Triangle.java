package com.mycompany.figurasgeometrica;
public class Triangle {

    private double base;
    private double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    public double calcularPerimetro() {
        double hipotenusa = this.calcularHipotenusa();
        return this.base + this.altura + hipotenusa;
    }

    public double calcularHipotenusa() {
        return Math.pow(this.base * this.base + this.altura * this.altura, 0.5);
    }

    public String getType() {
        double hipotenusa = this.calcularHipotenusa();
        if (this.base == this.altura && this.altura == hipotenusa) {
            return "Equilátero.";
        } else if (this.base != this.altura && this.altura != hipotenusa && hipotenusa != this.base) {
            return "Escaleno.";
        } else {
            return "Isóceles.";
        }
    }
}