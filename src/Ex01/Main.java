package Ex01;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Vitor", 24, 1.7);
        Pessoa pessoa2 = new Pessoa ("Fabricio", 36,1.8);

        System.out.println("***** Detalhes da Pessoa 1 *****");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getAltura());

        System.out.println("***** Detalhes da Pessoa 2 *****");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getAltura());
    }
}
