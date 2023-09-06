package Ex05;

public class Carro {
    private String marca;

    private String modelo;

    private String ano;


    /**
     * metodo constructor para carro
     *
     * @param marca  marca do carro
     * @param modelo modelo do carro
     * @param ano    ano de fabrico do carro
     */
    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro() {

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    // método criado para ligar
    public void Ligar() {
        System.out.println("O carro esta ligado.");
    }
}





