package Ex04;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Circulo circuloUser = new Circulo(4);


        //Calcular o Perímetro
        System.out.println("Perimetro: " + (circuloUser.getRaio()*2*3.14));

        //Calcular a Área
        System.out.println("Area: "+ (circuloUser.getRaio()* circuloUser.getRaio())*3.14);
    }
}
