import java.util.ArrayList;
import java.util.Collections;

public class Pirata {
    // Atributos da classe Pirata
    private String nome;
    private String comidaFavorita;
    private int poder;

    // Construtor da classe Cozinheiro
    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    //  Metodos da classe Pirata
    public void comer(Cozinheiro cozinheiro, int index) {
        // Não soube esse Feranndo, vou ir em um atendimento seu pra ver como faz
    }

    public Pirata lutar(Pirata pirata) {
        return pirata;
    }

    // Gets e Sets da classe Pirata


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }
}
