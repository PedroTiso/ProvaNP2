import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Receita> feiticaria = new HashSet<>();
        Receita receita1 = new Receita("Magia", 100);
        Receita receita2 = new Receita("FogoArdente", 300);

        feiticaria.add(receita1);
        feiticaria.add(receita2);

        Cozinheiro cozinheiro = new Cozinheiro("Pedro", "Feijoada", 100);
        cozinheiro.prepararPrato( 0);
        cozinheiro.mostrarReceitas();

        Pirata pirata = new Pirata("Miguel", "Arroz", 200);
        pirata.comer(cozinheiro, 0);
        pirata.lutar(pirata);

        Capitao capitao = new Capitao("Cris", "Lasanha", 10, 500);
        capitao.conquistarNovoSeguidor(pirata);





    }
}