public class Main {

    public static void main(String[] args) {
        // Instanciando os objetos

        Jogador jogador = new Jogador(10,"Leo",50,100);
        Bot bot = new Bot(5,"Lucy",80,500);



        Personagem[] personagens = new Personagem[5];

        personagens[0] = jogador;
        personagens[1] = bot;



            // Varrendo o vetor para verificar se os comportamentos estão corretos
            for (int i = 0; i < personagens.length; i++) {
                if (personagens[i] != null) {
                    if (personagens[i] instanceof Jogador) { // Verifica se está apontando para um objeto do tipo Jedi
                        Jogador j = (Jogador) personagens[i];
                        j.mostraInfo();
                        j.fazMissao();
                        j.comprarMoedas();
                        j.gastarMoedas();
                        j.recuperarVida();
                        System.out.println();
                    } else if (personagens[i] instanceof Bot) { // Verifica se está apontando para um objeto do tipo Sith
                        Bot s = (Bot) personagens[i];
                        s.mostraInfo();
                        s.fazMissao();
                        s.gastarMoedas();
                        s.comprarMoedas();
                        s.interagir();
                        System.out.println();
                    }
                }
            }
        }




    }



