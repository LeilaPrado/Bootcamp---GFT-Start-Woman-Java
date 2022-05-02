package ExceptionPersonalizada;

public class DvisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    public DvisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
