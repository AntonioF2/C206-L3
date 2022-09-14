import static java.lang.String.valueOf;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String etiquetaPreco(){
        return "Nome: " + getNome() + " Preco: " + getPreco();
    }

}