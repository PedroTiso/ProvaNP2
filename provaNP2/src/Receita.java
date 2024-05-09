public class Receita {

    //Criando os atributos da classe Receita
    private String nome;
    private int dificuldade;

    // Construtor da classe Receita
    public Receita(String nome, int dificuldade){
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    // Metodos get e set da classe Receita

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
