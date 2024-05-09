import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Cozinheiro extends Pirata {

    // Criação do ArrayList referente a receita
     private ArrayList<Receita> livroDeReceitas;

     // Construtor da classe Cozinehiro
     public Cozinheiro(String nome, String comidaFavorita, int poder){
         super(nome, comidaFavorita, poder);
         this.livroDeReceitas = new ArrayList<>();
     }

    // Get e Set -> caso necessário

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }

    public void setLivroDeReceitas(ArrayList<Receita> livroDeReceitas) {
        this.livroDeReceitas = livroDeReceitas;
    }

    // Metodos da classe Cozinheiro

    public String prepararPrato(int index){
         livroDeReceitas.indexOf(index);
        System.out.println(index);
        return prepararPrato(index);
    }

    public void mostrarReceitas(){
        for(Receita receita: livroDeReceitas){
            try{
                System.out.println(livroDeReceitas.set(0, receita));
            } catch (NullPointerException e){
                System.out.println("Erro " + e);
            }

        }
    }
}
