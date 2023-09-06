package Ex03;

public class Main {

    public static void main(String[] args) {

        //4º etapa: dar acesso ao usuário para inserir a informação, obtendo um novo retangulo
        Retangulo retanguloUser = new Retangulo(8, 10);

        //5º etapa: Calcular os dados do usuário
        //Calcular a área
        System.out.println("Area: " + retanguloUser.getAltura() * retanguloUser.getLargura());

        //Calcular o perimetro
        System.out.println("Perimetro: " + (retanguloUser.getAltura() + retanguloUser.getLargura()) * 2);
    }
}
