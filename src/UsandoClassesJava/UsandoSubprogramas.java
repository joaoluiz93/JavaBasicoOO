package UsandoClassesJava;

import java.util.Date;
import javax.swing.JOptionPane;

public class UsandoSubprogramas {

    public static void main(String[] args) {
        Date agora = new Date();

        String dataFormat = getDataFormatada(agora);

        System.out.println(dataFormat);

        String formatoExtenso = agora.toString();
        System.out.println(formatoExtenso);

        //entrada
        String data = JOptionPane.showInputDialog(
                null, "Digite uma data (dd/mm/aaaa)");

        //processamento
        String dataExtenso = getDataExtenso(data);

        //saída
        JOptionPane.showMessageDialog(null, dataExtenso);

    }

    public static String getDataFormatada(Date data) {

        int dia = data.getDate();
        int mes = data.getMonth();
        int ano = (data.getYear() + 1900);

       String retorno = (dia + "/" + mes + "/" + ano);
       return retorno;
    }

    public static String getDataExtenso(String data){
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
            "Outubro", "Novembro", "Dezembro"};
        String diaDaSemana[] = {"Domingo", "Segunda", "terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        //Processamento
        String parte[] = data.split("/");
        int dia = Integer.parseInt(parte[0]);
        int mes = Integer.parseInt(parte[1]);
        int ano = Integer.parseInt(parte[2]);

        Date date = new Date();
        date.setDate(dia );
        date.setMonth(mes - 1);
        date.setYear(ano - 1990);

        int diasDaSemana = date.getDay();

        String diaSemanaExtenso = diaDaSemana[diasDaSemana+1];

        String mesExtenso = meses[mes - 1];

        //SAIDA
        return ( diaSemanaExtenso + ", " + parte[0] + " de " + mesExtenso + " de " + parte[2]);
    }
}
