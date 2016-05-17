
package UsandoClassesJava;

import javax.swing.JOptionPane;

public class UsandoMath {
    public static void main(String[] args) {        
//      double result=  Math.sqrt(81);
//      double aux = Math.pow(9, 2);
//        System.out.println("Resultado raia: "+result + "\n"+ "Resultado quadrado"+ aux);
        
    double cateto1 = Double.parseDouble(
    JOptionPane.showInputDialog(null, "Digite cateto 1"));
    double cat2 = Double.parseDouble(
    JOptionPane.showInputDialog(null, "Digite cat2"));
    double cat3 = Double.parseDouble(
    JOptionPane.showInputDialog(null, "Digite cat3"));
//    double hypot = Math.sqrt (Math.pow(cat1, 2)+ Math.pow(cat2, 2));
    double hypot = Math.hypot(cateto1, cat2);
    JOptionPane.showMessageDialog(null, "Hypot: "+hypot);
    
    double maximo = Math.max(cateto1, Math.max(cat2, cat3));
    double minimo = Math.min(cateto1, Math.max(cat2, cat3));
        System.out.println("Maximo: "+maximo+ "\n"+ "Minimo: "+ minimo);
        
        for (int i = 0; i < 10; i++) {
            double random= (int) (Math.random()*10);
            System.out.println("Numero Aleatorio"+i+"="+random);
        }
        
    }
}
