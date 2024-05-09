public class Espadachim extends Pirata implements Comandar {

    // Atributo da classe
    private String nomeDaEspada;

    // Construtor da classe
    public Espadachim(String nome, String comidaFavorita, int poder, String nomeDaEspada){
        super(nome, comidaFavorita, poder);
        this.nomeDaEspada = nomeDaEspada;
    }

    // Get e Set da classe

    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    public void setNomeDaEspada(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }

    @Override
    public void darOrdens(){
        System.out.println("O imediato esta ordenando os tripulantes");
    }

    @Override
    public void mudarRota(){
        System.out.println("O imediato esta mudando a rota");
    }


}
