public abstract class Personagem {

    public static int cont;
    protected int id;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected String nome;
    protected int vida;
    protected int moedas;

    public Personagem(int id, String nome, int vida, int moedas) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.moedas = moedas;
    }

    public void mostraInfo(){
    }


    public abstract void fazMissao();


}



