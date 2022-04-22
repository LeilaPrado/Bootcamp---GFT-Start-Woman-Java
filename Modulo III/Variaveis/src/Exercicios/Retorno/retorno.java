package Exercicios.Retorno;

public class retorno {

    public static double calcularArea(double lado) {
        return lado*lado;
    }

    public static double calcularArea(double ladoA, double ladoB) {
        return ladoA*ladoB;
    }

    public static double calcularArea(double ladoA, double ladoB, double altura) {
        return ((ladoA+ladoB)*altura/2);
    }
}
