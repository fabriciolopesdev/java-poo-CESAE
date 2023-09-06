package Ex03;

public class Retangulo {

    // 1 evento: instanciar o retangulo
    private int altura;

    private int largura;

    // 2º evento: construir o método
    //alt + insert (Constructor)
    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    //3º evento: receber a informação do usuário
    //alt + insert (Getter)
    public int getAltura() {
        return altura;
    }
    public int getLargura() {
        return largura;
    }
    // *** não foi criado método pois foi calcular no main, conforme pedido no exercício
}
