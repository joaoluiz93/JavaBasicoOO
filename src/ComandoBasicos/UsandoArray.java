
package ComandoBasicos;

import javax.swing.JOptionPane;


public class UsandoArray {

    public static void main(String[] args) {
        
        //Entrada
         int idade[] = new int[10];
         
         int jogoDaVelha[][]= new int[3][3];
         jogoDaVelha[0][1] = 100;
         
         
         for(int i = 0; i < idade.length; i++){
             idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe sua idade"+(i+1)));
         }
        
        //Processamento
        int somaIdade =0;
        for(int i=0; i < idade.length; i++){
            somaIdade +=  idade[i];
        }
        
        double media = (somaIdade)/ (double) idade.length;
                
        //Saida
        JOptionPane.showMessageDialog(null, "Media: "+media);
    }
}
