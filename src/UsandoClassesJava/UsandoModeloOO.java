package UsandoClassesJava;

import javax.swing.JOptionPane;

public class UsandoModeloOO {

    public static void main(String[] args) {

        //Entrada
//        String texto = JOptionPane.showInputDialog(null, "Digite um texto");
//        String saida = "";
//         
//        //Processamento
//      saida = texto.toUpperCase();
//         
//        //Saida
//        JOptionPane.showMessageDialog(null,"Resposta "+ saida);
        //Entrada
        String data = JOptionPane.showInputDialog(null, "Digite uma data  (dd/mm/aaaa)");
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"};
        //Processamento
        String parte[] = data.split("/");
        int mes = Integer.parseInt(parte[1]);
        String mesExtenso = meses[mes - 1];

        //SAIDA
        JOptionPane.showMessageDialog(null, parte[0] + " de " + mesExtenso + " de " + parte[2]);

    }
}
