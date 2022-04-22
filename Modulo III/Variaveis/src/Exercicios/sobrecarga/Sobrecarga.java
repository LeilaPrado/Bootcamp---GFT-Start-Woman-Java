package Exercicios.sobrecarga;

public class Sobrecarga {


    public static void calcularArea(double lado) {
        System.out.println("A área do quadrado é igual a: " + (lado*lado));
    }

    public static void calcularArea(double ladoA, double ladoB) {
        System.out.println("A área do retângulo é igual a: " + (ladoA*ladoB));
    }

    public static void calcularArea(double ladoA, double ladoB, double altura) {
        System.out.println("A área do retângulo é igual a: " + ((ladoA+ladoB)*altura/2));
    }
}

class Teste{
    public static void main(String[] args) {
        Sobrecarga.calcularArea(2.0);
        Sobrecarga.calcularArea(2.0, 3.0);
        Sobrecarga.calcularArea(2.0, 3.2,4.1);
    }
}


