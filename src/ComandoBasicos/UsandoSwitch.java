package ComandoBasicos;

import java.util.Scanner;

public class UsandoSwitch {

    public static void main(String[] args) {
        // Switch - Só funciona com numero inteiro ou char

        int continua = 0;
        Scanner entrada = new Scanner(System.in);
        while (continua == 0) {
        //entrada

            System.out.println("Digite um numero de 0 a 7");
            int num = entrada.nextInt();

            String numeroExtenso = "";

            //Processamento
            switch (num) {
                case 0:
                    numeroExtenso = "zero";
                    break;
                case 1:
                    numeroExtenso = "Dois";
                    break;
                case 2:
                    numeroExtenso = "zero";
                    break;
                case 3:
                    numeroExtenso = "Dois";
                    break;
                case 4:
                    numeroExtenso = "zero";
                    break;
                case 5:
                    numeroExtenso = "Dois";
                    break;
                case 6:
                    numeroExtenso = "zero";
                    break;
                case 7:
                    numeroExtenso = "Dois";
                    break;
                default:
                    numeroExtenso = "Valor não suportado";
                    break;
            }

            // saida
            System.out.println(numeroExtenso);

            System.out.println("Digite 1 para sair ou 0 para continuar");
            continua = entrada.nextInt();
        }
    }
}
