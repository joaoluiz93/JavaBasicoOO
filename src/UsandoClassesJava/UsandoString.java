package UsandoClassesJava;

import javax.swing.JOptionPane;

public class UsandoString {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
        
        String sobreNome="Silva";
        double salario = 1000.8;
        
        String end = new String("Rua são jose");
        
        System.out.println( nome.concat(sobreNome));
        System.out.println(nome.toUpperCase());
        
        
    }

}
