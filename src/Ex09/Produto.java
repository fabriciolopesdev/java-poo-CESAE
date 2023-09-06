package Ex09;

public class Produto {

    //atributos do produto
    private String nome;

    private double preco;

    private int qtdEstoque = 0;


    /**
     * método constructor para produto
     *
     * @param nome
     * @param preco
     * @param qtdEstoque
     */
    //método constructor
    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }


    //método para comprar
    public void comprar(int quantidade) {
    this.qtdEstoque += quantidade;
    }

    //método para vender
    public void vender(int quantidade) {
        //verificar se a quantidade desejada tem em estoque
        if (qtdEstoque >= quantidade) {
           /* letra a: Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
            atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
            é possível por quebra de stock do produto. */
            this.qtdEstoque -= quantidade ; //se vender, atualiza o estoque
            System.out.println("Ha em estoque: " + qtdEstoque);

        } else {
            //não pode vender.
            System.out.println("Nao e possivel por quebra de stock do produto: ");
        }
    }

    //método para exibir os detalhes
    public void exibirDetalhe() {
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.qtdEstoque);
    }

}
