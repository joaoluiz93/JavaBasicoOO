package ComandoBasicos;

import java.util.Scanner;

public class UsandoEntradaCast {

    public static void main(String[] args) {

        //entrada
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu ano nascimento: ");
        int anoNascimento = teclado.nextInt();
        System.out.println("Informe o ano atual: ");
        int anoAtual = teclado.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = teclado.nextDouble();

        //processamento
        int idade = anoAtual - anoNascimento;

        int imc = (int) (peso / (altura * altura));

        double aux = imc;

        long aux1 = 566777777888L;
        int aux2 = (int) aux1;
        aux1 = aux2;

        char letra = 'a';
        int ascii = letra;

        //saida
        System.out.println("Idade: " + idade);
        System.out.println("Ascii: "+ascii);
    }

}
