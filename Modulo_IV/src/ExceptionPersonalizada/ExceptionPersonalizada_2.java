package ExceptionPersonalizada;

import javax.swing.*;

public class ExceptionPersonalizada_2 {

    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {

            try {

                if (denominador[i] == 0)
                    throw new DivisaoPorZeroException("O denominador não pode ser zero", numerador[i], denominador[i]);

                else if ((numerador.length) == i)
                    throw new ForaIntervaloException("O vetor numerador é menor que o vetor denominador");

                else if (numerador[i] % denominador[i] != 0)
                    throw new DvisaoNaoExataException("Divisão não exata! ", numerador[i], denominador[i]);


                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);

            } catch (DvisaoNaoExataException | DivisaoPorZeroException | ForaIntervaloException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            System.out.println("O programa continua ... ");
        }
    }

}
