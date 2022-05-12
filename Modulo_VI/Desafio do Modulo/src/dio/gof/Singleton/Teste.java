package dio.gof.Singleton;

public class Teste {

    public static void main(String[] args) {

        //Testes singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager2);

        SingletonLazyHolder lHoder = SingletonLazyHolder.getInstancia();
        System.out.println(lHoder);

        SingletonLazyHolder lHoder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lHoder2);
    }
}
