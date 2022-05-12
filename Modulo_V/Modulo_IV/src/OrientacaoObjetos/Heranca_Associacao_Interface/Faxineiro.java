package OrientacaoObjetos.Heranca_Associacao_Interface;

public class Faxineiro extends Funcionario {

    void metodo1(){
        System.out.println("Método um faxineiro");
    }

    @Override
    void metodo2() {
        super.metodo2();
    }
}
