package Classes.Main;

import Classes.Plana.Figura;
import Classes.Plana.Quadrilatero;
import Classes.Plana.Triangulo;
import Classes.solida.Cubo;
import javax.swing.JOptionPane;

public class ClassePrincipal {

    public static void main(String[] args) {

        Figura lista[] = new Figura[3];
        
        for (int i = 0; i < lista.length; i++) {
            
            String op = JOptionPane.showInputDialog(null,
                    "Quadrilatero (Q) ou Triangulo (T) ");
            int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 1;"));
            int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 2;"));

            if(op.equalsIgnoreCase("q")){
            Quadrilatero quad1 = new Quadrilatero();
            quad1.setLado1(lado1);
            quad1.setLado2(lado2);

            lista[i] = quad1;
            } else {
             int lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor do lado 3;"));

             Triangulo trii = new Triangulo();
             trii.setLado1(lado1);
             trii.setLado2(lado2);
             trii.setLado3(lado3);
             
             lista[i] = trii;
            }
        }
        
        
        for (int i = 0 ; i < lista.length; i++){
            JOptionPane.showMessageDialog(null, lista[i].toString());
        }

        
        
        Figura figMaiorArea = maiorAreaPlana(lista);
        
        if(figMaiorArea instanceof Quadrilatero ){
            JOptionPane.showMessageDialog(null, "Quadrilatero"+ figMaiorArea.getAreaPlana());
        }else{
            JOptionPane.showMessageDialog(null, "triangulo"+ figMaiorArea.getAreaPlana());
        }
        
        
        
        
        
        
        //Entrada
//        Quadrilatero quad2 = new Quadrilatero();
//
//        Quadrilatero quad3 = new Quadrilatero(lado1, lado2);
//
//        Quadrilatero quad4 = new Quadrilatero();;
//
//        Cubo cub1 = new Cubo();
//        cub1.setLado1(100);
//        cub1.setLado2(100);
//        cub1.setAltura(100);
//
//        Cubo cub2 = new Cubo();
//
//        Cubo cub3 = new Cubo(20, 25);
//
//        Cubo cub4 = new Cubo(78, 79, 66);
//
//        Triangulo t1 = new Triangulo();
//        Triangulo t2 = new Triangulo(10, 20, 25);
//
//        //Processamento
//        //Saida
//        System.out.println("Quadrilatero 1: " + quad1.getDadosFormatados() + " = " + quad1.getAreaPlana());
//
//        System.out.println("Quadrilatero 2: " + quad2 + " = " + quad2.getPerimetroPlana());
//
//        System.out.println("Quadrilatero 3: " + quad3.toString() + " = " + quad3.isRetanguloPlana());
//        System.out.println("Quadrilatero 4: " + quad4 + " = " + quad4.isQuadradoPlana());
//
//        System.out.println("Cubo 1: " + cub1.toString() + " - " + cub1.getAreaPlana());
//
//        System.out.println("Cubo 2: " + cub2.toString() + " - " + cub2.getPerimetroPlana());
//
//        System.out.println("Cubo 3: " + cub3.toString() + " - " + cub3.getVolume());
//
//        System.out.println("Cubo 4: " + cub4.toString() + " - " + cub4.isCuboPerfeito());
//
//        System.out.println("triangulo 1: " + t1.toString() + " - " + t1.getAreaPlana());
//
//        System.out.println("triangulo 2: " + t2.toString() + " -" + t2.getPerimetroPlana());
    }

    public static Figura maiorAreaPlana(Figura lista[]){
        double maiorArea = 0;
        Figura figMaiorArea = null;
        for (int i = 0; i < lista.length; i++) {
            Figura fig = lista[i];
           
            if(fig instanceof Quadrilatero){
                Quadrilatero quad = (Quadrilatero) fig;
                
                if(maiorArea < quad.getAreaPlana()){
                    maiorArea = quad.getAreaPlana();
                    figMaiorArea = quad;
                }
            } else{
                Triangulo tri = (Triangulo) fig;
                if( maiorArea < tri.getAreaPlana()){
                    maiorArea = tri.getAreaPlana();
                    figMaiorArea = tri;
                }
            }
        }
        return  figMaiorArea;
    }
}
