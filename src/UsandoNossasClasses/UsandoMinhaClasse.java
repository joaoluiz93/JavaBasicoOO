
package UsandoNossasClasses;

import javax.swing.JOptionPane;


public class UsandoMinhaClasse {
   
    public static void main(String[] args) {
        
        String resposta = "";
        //Entrada
        String op = JOptionPane.showInputDialog(null, "Baskara(B) ou Fatorial(F)");
        
        
        //Processamento
        
        if(op.equals("B")){
      double a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A"));
             double b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B"));
         double c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de c"));
              
         resposta = FuncoesMatematicas.getBaskara(a, b, c);
        
        } else if (op.equals("F")){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero para o fatorial"));

            int result = FuncoesMatematicas.getFatorial(num);
            resposta = String.valueOf(result);
        }
        
        //saida
        JOptionPane.showMessageDialog(null, "Resposta: "+resposta);
    }
}
