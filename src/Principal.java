import br.com.alura.reprodutorAudio.modulos.Musica;
import br.com.alura.reprodutorAudio.modulos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        Podcast podcast = new Podcast();

        musica.setTitulo("Happier Than Ever");
        musica.setArtista("Billie Eilish");
        musica.setDuracao("4:58");
        musica.setClassificacao("Pop");

        musica.curtir();
        musica.curtir();
        musica.reproduzir();

        System.out.println("\nLikes: " + musica.getCurtidas() + "\nVisualizações: " + musica.getTotalDeReproducao() + "\n");

        podcast.setTitulo("Podpah - Billie Eilish");
        podcast.setAutor("Podpah");
        podcast.setConvidado("Billie Eilish");
        podcast.setDuracao("01:58:30");
        podcast.setClassificacao("Podcast");

        podcast.curtir();
        podcast.curtir();
        podcast.reproduzir();

        System.out.println("\nLikes: " + podcast.getCurtidas() + "\nVisualizações: " + podcast.getTotalDeReproducao() + "\n");
    }
}