package mx.edu.utez.awos;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora (double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double restar(){
        return numero1-numero2;
    }

}
