public class Capitao extends Pirata implements Comandar {

    // Atributos da classe Capitao

    private int numeroDeSeguidores;

    // Construtor da classe Cpitao
    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores){
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    // Método get e set da classe Capitao

    public int getNumeroDeSeguidores() {
        return numeroDeSeguidores;
    }

    public void setNumeroDeSeguidores(int numeroDeSeguidores) {
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    // Metodo da classe

    public void conquistarNovoSeguidor(Pirata pirata){

        if(pirata.getPoder() < numeroDeSeguidores){
            numeroDeSeguidores++;
        } else {
            System.out.println("Não foi possivel conquistar um novo seguidor");
        }

    }

    @Override
    public void darOrdens(){
        System.out.println("O capitao esta ordenando X tripulantes");
    }

    @Override
    public void mudarRota(){
        System.out.println("O capitão esta mudando a rota");
    }
}
