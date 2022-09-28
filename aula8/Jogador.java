public class Jogador extends Personagem implements Loja, Suplemento {

    private int nivel;
    Mochila[] mochilas = new Mochila[5];
    Mochila mochila = new Mochila(10,30);
    Skin skin = new Skin("Gabriel", "lendario");
    Skin[] skins = new Skin[5];


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Jogador(int id, String nome, int vida, int moedas) {
        super(id, nome, vida, moedas);
    }


    @Override
    public void mostraInfo() {

        for (int i = 0; i < mochilas.length; i++) {
            if (mochilas[i] != null)
                for (i = 0; i < skins.length; i++) {
                    if (skins[i] != null)
                        mochila.mostraInfo();
                    skin.mostraInfo();
                }
            else {
                System.out.println("O jogador nao possui o item");
            }
        }
        }






    @Override
    public void fazMissao() {

        System.out.println(getNome() + " completou uma missao! Siga seu progresso. ");
        setNivel(getNivel() + 1);


    }

    @Override
    public void comprarMoedas() {

        System.out.println(getNome() + " comprou moedas na loja! Ele comprou " + moedas);

    }



    @Override
    public void gastarMoedas() {

        if(mochila.getCapacidade() > mochila.getQtditens()){
            System.out.println(getNome() + " gastou moedas na loja. ");
            mochila.setQtditens(mochila.getQtditens() + 1);
        }else{
            System.out.println("Nao foi possivel comprar algum item, pois a mochila esta cheia. ");
        }

    }


    @Override
    public void comprarMoedas(int qtdMoedas) {

        System.out.println(getNome() + "comprou moedas na loja! Ele comprou " + moedas);

    }

    @Override
    public void recuperarVida() {

        if(vida < 100){
            setVida(getVida() + 1);
        }else{
            vida = 100;
        }

    }
}
