import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         Computador pc1 = new Computador("Positivo",1300.00);
         Computador pc2 = new Computador("Acer",1800);
         Computador pc3 = new Computador("Vaio",2800.00);

         SistemaOperacional so1 = new SistemaOperacional("Sistema Operacional Linux Ubuntu",32);
         SistemaOperacional so2 = new SistemaOperacional("Sistema Operacional Windows 8",64);
         SistemaOperacional so3 = new SistemaOperacional("Sistema Operacional Windows 10",64);

         MemoriaUSB m1 = new MemoriaUSB("Pen-drive",16);
         MemoriaUSB m1 = new MemoriaUSB("Pen-drive",32);
         MemoriaUSB m1 = new MemoriaUSB("HD Externo",1000);


        HardwareBasico h1 = new HardwareBasico("Pentium Core i3 (1200 Mhz ) com  4Gb de Memória RAM", 500);
        HardwareBasico h2 = new HardwareBasico("Pentium Core i5 (2260 Mhz) com 8 Gb de Memória RAM", 1000);
        HardwareBasico h3 = new HardwareBasico("Pentium Core i5 (2260 Mhz) com 16 Gb de Memória RAM", 2000);





        // Flag que permite a execução em loop do menu
        boolean flag = true;

        while(flag) {
            System.out.println("Entre com a promoção em que deseja comprar::");
            System.out.println("1 - Promoção 1:");
            System.out.println("2 - Promoção 2:");
            System.out.println("3 - Promoção 3:");
            System.out.println("0 - Para sair do menu.");
            int op = input.nextInt();
            switch (op) {
                case 1:

                    String P = input.nextLine();
                    if(b1.alugarLivro(nomeDoLivro)){
                        System.out.println("O livro " + nomeDoLivro + " foi alugado com sucesso.");
                    }
                    else{
                        System.out.println("O livro não foi encontrado ou já foi alugado");
                    }
                    break;

                case 2:

                case 3:



                    break;

                case 0:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }


    }

}

