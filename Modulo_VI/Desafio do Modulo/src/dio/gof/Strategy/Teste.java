package dio.gof.Strategy;

public class Teste {

    //Testes Strategy
    public static void main(String[] args) {
         Comportamento normal = new ComportamentoNormal();
         Comportamento agressivo = new ComportamentoAgressivo();
         Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

    }

}
