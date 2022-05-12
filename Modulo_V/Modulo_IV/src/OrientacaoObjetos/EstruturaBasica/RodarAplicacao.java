package OrientacaoObjetos.EstruturaBasica;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapacidadeTanque(50);

        System.out.println("Modelo: "+carro1.getModelo()
                +" - Cor: "+carro1.getCor()
                +" - Capacidade Tanque : "+carro1.getCapacidadeTanque()
                +" - Valor total para encher o tanque: R$"+carro1.totalValorTanque(6.40));


        Carro carro2 = new Carro("Cinza","Mercdez-Benz Classe C", 60);

        System.out.println("Modelo: "+carro2.getModelo()
                +" - Cor: "+carro2.getCor()
                +" - Capacidade Tanque : "+carro2.getCapacidadeTanque()
                +" - Valor total para encher o tanque: R$"+carro2.totalValorTanque(6.40));

    }
}
