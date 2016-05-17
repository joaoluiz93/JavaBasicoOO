
package UsandoClassesJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class UsandoListaJava {

    public static void main(String[] args) {
//        ArrayList<String> lista = new ArrayList<String>();
//        lista.add("Maria");
//        lista.add("Pedro");
//        lista.add("Joana");
//        lista.add("Maria");
//        
//        if(lista.contains("Maria")){
//            System.out.println("show");
//        } else{
//            System.out.println("Erro");
//        }
//        
//        String elemento = (String)lista.get( 0 );
//        System.out.println(elemento);
//       String ultimoElemento =  lista.get(lista.size()-1);
//        System.out.println(ultimoElemento);
//        
////        for(String element : lista){
////            System.out.println("Elemento "+ "="+ element);
////    }
//        
//        Iterator<String> it = lista.iterator();
//        
//        while(it.hasNext()){
//            elemento = it.next();
//            System.out.println("Elemento "+elemento);
//        }
        
        Hashtable<String, String> lista = new Hashtable();
        lista.put("joao", "jao; são jose ;1038;Cedro-ce");
      lista.put("maria", "maria; são jose ;1038;Cedro-ce");
      
      String element =  lista.get("joao");
        System.out.println(element);

        Enumeration<String> en = lista.elements();
        while(en.hasMoreElements()){
            element = en.nextElement();
            System.out.println(element);
        }
        
        
    }
}
