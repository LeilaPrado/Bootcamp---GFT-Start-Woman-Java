package InvejacaoDependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Carro());
        condutor.automovel();

        Condutor condutor2 = new Condutor(new Moto());
        condutor2.automovel();

    }

    @Autowired
    private Veiculo veiculo;

    public Condutor(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void automovel(){
        veiculo.acao();
    }
}
