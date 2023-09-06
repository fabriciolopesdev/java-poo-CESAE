package Ex02;

import Ex01.Pessoa;

public class Main {

    public static void main(String[] args) {

        //A classe
        Cao cao1 = new Cao("Bud", "indefinido");
        Cao cao2 = new Cao("Brisa", "pinsher");
        Cao cao3 = new Cao("Meg", "cooker");

        System.out.println("***** Detalhes do cao 1 *****");
        System.out.println(cao1.getNome());
        System.out.println(cao1.getRaca());
       /* System.out.println(cao1.getLadrar()); não precisa porque vai ser impresso na classe
        com o get pelo o return */

        cao1.setLadrar("ruff"); //sempre para fazer uma alteração. Ele coloca alguma coisa dentro

        System.out.println(" ");

        System.out.println("***** Detalhes do cao 2 *****");
        System.out.println(cao2.getNome());
        System.out.println(cao2.getRaca());
        //System.out.println(cao2.getLadrar());

        cao2.setLadrar("woof woff"); //sempre para fazer uma alteração. Ele coloca alguma coisa dentro

        System.out.println(" ");

        System.out.println("***** Detalhes do cao 3 *****");
        System.out.println(cao3.getNome());
        System.out.println(cao3.getRaca());

        cao3.setLadrar("hahaha");
    }
}
