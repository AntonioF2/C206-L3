public class Main {

    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        salgado1.nome = "Coxinha";
        salgado2.nome = "Enrolado";
        salgado3.nome = "Hamburguer";

        Cantina.addSalgado(salgado1);
        Cantina.addSalgado(salgado2);
        Cantina.addSalgado(salgado3);

        cantina.mostraInfo();

    }

}
