import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alunos;

        System.out.println("Entre com o número de alunos: ");
        alunos = entrada.nextInt();

        switch (alunos) {

            case 10:
            case 20:
                System.out.println("Sala L-16");
            break;
            case 30:
                System.out.println("L-22");
            break;
            default:
                System.out.println("Use a estrutura switch-case");

            entrada.close();
        }
    }
}
