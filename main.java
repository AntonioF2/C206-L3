import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int npa, np3, nfa;

        System.out.println("Entre com o valor da NPA");
        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("NP3");
            System.out.println("Informe o valor da NP3");
        np3 = entrada2.nextInt();
               nfa = (npa + np3)/2;
               if(nfa >= 50){
                   System.out.println("Aprovado");
               }
        else
                   System.out.println("reprovado");
        }
        entrada.close();
        entrada2.close();
    }

}
