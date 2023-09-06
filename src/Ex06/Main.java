package Ex06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora crlh = new Calculadora();

        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("Insira um numero: ");
        num1 = input.nextDouble();
        System.out.print("Insira outro numero: ");
        num2 = input.nextDouble();

        System.out.println(crlh.soma(num1,num2));
        System.out.println(crlh.subtracao(num1,num2));
        System.out.println(crlh.multiplicacao(num1,num2));
        System.out.println(crlh.divisao(num1,num2));
    }
}
