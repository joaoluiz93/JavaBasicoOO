package ComandoBasicos;

import java.util.Scanner;

public class UsandoWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 1 para sair");
        int condicao = entrada.nextInt();

       /* while (condicao != 1) {
            System.out.println("Você digitou o numero " + condicao);

            System.out.println("Digite 1 para sair");
            condicao = entrada.nextInt();
        } */
        
        do{
             System.out.println("Você digitou o numero " + condicao);

            System.out.println("Digite 1 para sair");
            condicao = entrada.nextInt();
        } while (condicao !=1);
        
        System.out.println("Ate logo ");
    }
}
