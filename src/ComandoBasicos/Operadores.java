package ComandoBasicos;

public class Operadores {

    public static void main(String[] args) {
        //entrada
        double num1 = 15;
        double num2 = 20;

        double inform = 9;

        double altura = 1.7;
        double peso = 180;

        int contComando = 0;

        //processamento
        double resul = num1 / num2;
        contComando++;

        double resto = inform % 2;
        contComando++;

        double imc = peso / (altura * altura);
        contComando++;

        boolean abaixoPeso = imc < 25;
        boolean acimaPeso = imc >= 30;

        //saida
        System.out.println("Resultado: " + resul);
        System.out.println("Resto: " + resto);
        System.out.println("O IMC: " + imc);
        System.out.println("Contador: " + contComando);

        System.out.println("Eh magro: " + abaixoPeso);
        System.out.println("Eh forte: " + acimaPeso);
    }
}
