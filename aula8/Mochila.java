public class Mochila {

    private int qtditens;
    private int capacidade;

    public int getQtditens() {
        return qtditens;
    }

    public void setQtditens(int qtditens) {
        this.qtditens = qtditens;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Mochila(int qtditens, int capacidade) {
        this.qtditens = qtditens;
        this.capacidade = capacidade;
    }

    public void mostraInfo(){
        System.out.println("Mochila possui " + getQtditens() + " itens e " + getCapacidade() + " de capacidade");

    }
}
