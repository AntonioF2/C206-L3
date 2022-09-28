public class Bot extends Personagem implements Interacao, Loja {

    private boolean inteligente;

    public boolean isInteligente() {
        return inteligente;
    }

    public void setInteligente(boolean inteligente) {
        this.inteligente = inteligente;
    }

    public Bot(int id, String nome, int vida, int moedas) {
        super(id, nome, vida, moedas);
    }

    @Override
    public void mostraInfo() {


    }

    @Override
    public void fazMissao() {

        if(inteligente){
            System.out.println("O bot inteligente completou uma missao! O aprendizado de maquina realmente funciona. ");

        }else{
            System.out.println("O bot ainda nao e inteligente para realizar uma missao. ");
        }

    }

    @Override
    public void comprarMoedas() {
        if(inteligente){
            System.out.println("O bot aprendeu a comprar moedas. Ele comprou " + moedas);
        }else{
            System.out.println("O bot ainda nao aprendeu a comprar moedas. ");
        }

    }


    @Override
    public void gastarMoedas() {

        if(inteligente){
            System.out.println("O bot aprendeu a gastar moedas. ");
        }else{
            System.out.println("O bot ainda nao consegue comprar moedas. ");
        }

    }

    @Override
    public void comprarMoedas(int qtdMoedas) {

    }


    @Override
    public void interagir() {

        if(inteligente){
            System.out.println("O bot nao interage mais de forma padrao. Ele aprendeu a conversar.");
        }else{
            System.out.println("O bot esta interagindo de forma padrao. ");
        }

    }
}
