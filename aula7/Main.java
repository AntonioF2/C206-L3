public class Main {


    public static void main(String[] args) {

        Produto[] items = new Produto[4];

        Produto p1 = new Notebook("Positivo",150,30,"integrada","celeron");
        Produto p2 = new Camiseta("Hering",100,"Rosa","P");
        Produto p3 = new Notebook("Samsung",300,200,"hdr ultra","I3");
        Produto p4 = new Camiseta("Hollister",220,"Roxo","M");


        items[0] = p1;
        items[1] = p2;
        items[2] = p3;
        items[3] = p4;

        int aux;

        for(aux = 0; aux < items.length;aux++){
            if(items[aux] != null){
                if(items[aux] instanceof Notebook){
                    Notebook laptop =(Notebook) items[aux];
                    System.out.println(laptop.etiquetaPreco());
                }
                else if(items[aux] instanceof Camiseta){
                    Camiseta camisa = (Camiseta) items[aux];
                    System.out.println(camisa.etiquetaPreco());
                }
            }
        }

    }
}