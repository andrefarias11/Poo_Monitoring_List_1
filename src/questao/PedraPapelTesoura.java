package questao;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

    public static void main(String[] args) {

        //PASSO 1
        Scanner entrada = new Scanner(System.in);

        int valor1 = 0;
        int valor2 = 0;
        int qt = 1;

        while (valor1 == valor2) {
            System.out.println("Jogador 1 escolha uma opção:\nPedra(1) | Papel(2) |  Tesoura(3)");
            System.out.print("-> ");
            valor1 = entrada.nextInt();
            System.out.println("Jogador 1 escolheu :" + valor1);
            System.out.println("__________________________________________");

            System.out.println("Jogador 2 escolha uma opção:\nPedra(1) | Papel(2) |  Tesoura(3)");
            System.out.print("-> ");
            valor2 = entrada.nextInt();
            System.out.println("Jogador 2 escolheu :" + valor2);
            System.out.println("__________________________________________");
            
            if (valor1 != valor2) {
                if ((valor1 == 1 && valor2 == 3) || (valor1 == 3 && valor2 == 2) || (valor1 == 2 && valor2 == 1)) {
                    System.out.print("Jogador 1 Ganhou!");
                } else {
                    System.out.print("Jogador 2 Ganhou!");
                }
            }
        }
    }
}
