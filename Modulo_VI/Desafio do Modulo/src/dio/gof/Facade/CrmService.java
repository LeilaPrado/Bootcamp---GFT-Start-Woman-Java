package dio.gof.Facade;

public class CrmService {

    private CrmService() {
    }

    public static void gravarCliente(String nome, String cidade, String estado, String cep){
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
