package Ex08;

public class Aluno {

    //atributos do aluno
    private String nome;

    private int idade;

    private String curso;

    private double media;


    /**
     *Método constructor para aluno
     * @param nome
     * @param idade
     * @param curso
     * @param media
     */
    //método constructor para receber os 4 atributos como parâmetro
    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    //método situação para dizer aprovado ou reprovado
    public void Situacao() {
        if (media >= 9.5) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }

}
