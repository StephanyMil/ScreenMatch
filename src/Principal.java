import com.github.StephanyMil.ScreenMatch.calculos.CalculadoraDeTempo;
import com.github.StephanyMil.ScreenMatch.calculos.FiltroRecomendacao;
import com.github.StephanyMil.ScreenMatch.modelos.Episodio;
import com.github.StephanyMil.ScreenMatch.modelos.Filme;
import com.github.StephanyMil.ScreenMatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.mediaDasAvaliacoes());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("The Vampire Diaries");
        minhaSerie.setAnoDeLancamento(2012);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(8);
        minhaSerie.setEpisodiosPorTemporada(22);
        minhaSerie.setMinutosPorEpisodio(42);
        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVizualizacoes(8000);
        filtro.filtra(episodio);
    }
}
