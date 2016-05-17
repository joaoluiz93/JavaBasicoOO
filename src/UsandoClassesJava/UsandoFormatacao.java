package UsandoClassesJava;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class UsandoFormatacao {

    public static void main(String[] args) {
      

//        Date agora = new Date();
//        
//        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/YYYY");
//        SimpleDateFormat formatadorData2 = new SimpleDateFormat("EEEE, dd' de' MMMM 'de 'yyyy");
//   
//        System.out.println(formatadorData.format(agora));
//                System.out.println(formatadorData2.format(agora));
//
//        
//        String data = JOptionPane.showInputDialog(null, "digite uma data (dd/MM/yyyy)");
//        
//        try {
//        Date dataInform = new Date();
//        dataInform = new SimpleDateFormat("dd/MM/yyyy").parse(data);
//        
//       
//        //SAIDA
//        JOptionPane.showMessageDialog(null, new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy").format(dataInform));
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Erro no formato da data");
//        }

        double result = 100000.0/3.0;
        System.out.println("Result: "+ new DecimalFormat("#,###.00").format(result));
        
    }
}
