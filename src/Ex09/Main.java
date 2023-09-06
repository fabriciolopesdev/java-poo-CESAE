package Ex09;

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto("camisa", 20, 1);


        //letra b: No método main, crie um objeto dessa classe Produto e chame o método para comprar 5 unidades.
        produto1.comprar(5);
        produto1.exibirDetalhe();
        System.out.println(" ");

        // letra c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock
        produto1.vender(2);
        produto1.exibirDetalhe();
        System.out.println(" ");

       // letra d. Invoque o método para comprar 10 unidades.
        produto1.comprar(10);
        produto1.exibirDetalhe();
        System.out.println(" ");

        // letra e. Invoque o método para vender 35 unidades.
        produto1.vender(35);
        produto1.exibirDetalhe();
        System.out.println(" ");
    }
}
