package model;

public class Calculadora {

    private double a;
    private double b;

    public Calculadora() {
        this(0, 0);
    }

    public Calculadora(double base, double altura) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

   public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getSoma() {
        return ((getA() + getB()));
    }
    
    public double getSubtracao() {
        return ((getA() - getB()));
    }
    
    public double getMultiplicacao() {
        return ((getA() * getB()));
    }
    
    public double getDivisao() {
        return ((getA() / getB()));
    }
    
}
