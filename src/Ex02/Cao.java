package Ex02;

public class Cao {

    private String nome;

    private String raca;

    private String ladrar;

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.ladrar = "au au au";
    }

    //criação do MÉTODO CONSTRUTOR para ser invocado no main
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    /*public String getLadrar() {
        return ladrar;
    }*/

    public void setLadrar(String latirRecebidoDoMain) { //aqui define o que quero receber no set do main
        System.out.println(latirRecebidoDoMain); //o que eu recebi eu vou printar
    }
}
