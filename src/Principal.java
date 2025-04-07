import br.com.alura.reprodutorAudio.modelos.MinhasPreferidas;
import br.com.alura.reprodutorAudio.modelos.Musica;
import br.com.alura.reprodutorAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();
        MinhasPreferidas preferidas = new MinhasPreferidas();

        musica.setTitulo("Happier Than Ever");
        musica.setArtista("Billie Eilish");
        musica.setDuracao("4:58");
        musica.setGenero("Pop");

        for (int i = 0; i < 2000; i++) {
            musica.reproduzir();
        }
        musica.curtir();

        System.out.println("\nLikes: " + musica.getCurtidas() + "\nVisualizações: " + musica.getTotalDeReproducao());
        preferidas.inclui(musica);

        podcast.setTitulo("Podpah - Billie Eilish");
        podcast.setHost("Podpah");
        podcast.setDescricao("Billie Eilish");
        podcast.setDuracao("01:58:30");

        podcast.curtir();
        podcast.curtir();
        podcast.reproduzir();

        System.out.println("\nLikes: " + podcast.getCurtidas() + "\nVisualizações: " + podcast.getTotalDeReproducao());
        preferidas.inclui(podcast);
        System.out.println("\n");
    }
}