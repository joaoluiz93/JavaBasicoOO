
package ComandoBasicos;

import javax.swing.JOptionPane;


public class UsandoJOptionPanerWrapper {
    public static void main(String[] args) {
        
        //Entrada
        
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        String sobreNome = JOptionPane.showInputDialog(null, "Digite seu sobrenome");
        
        String aux = JOptionPane.showInputDialog(null, "Digite seu salario");
        double salario = Double.parseDouble(aux);
        
         aux = JOptionPane.showInputDialog(null, "Digite sua idade");
        int idade = Integer.parseInt(aux);
        
        //Processamento
        String nomeCompleto = nome+ " "+ sobreNome;
        double result = salario * idade;
        
        //Saida
        
       JOptionPane.showMessageDialog(null, "Seu nome: "+nomeCompleto+"\n"+ "Salario: "+result);
        
    }
}
