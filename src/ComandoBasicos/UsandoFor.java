
package ComandoBasicos;

import java.util.Scanner;


public class UsandoFor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = entrada.nextInt();
        
       for (int a=0;a<=10;a++){
           System.out.println(num+ "x"+ a+"="+ (num*a));
       }
    }
    
}
