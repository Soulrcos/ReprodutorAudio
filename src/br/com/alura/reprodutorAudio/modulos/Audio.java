package br.com.alura.reprodutorAudio.modulos;

public class Audio {
    private String titulo;
    private String duracao;
    private int totalDeReproducao;
    private int curtidas;
    private String classificacao;


    // SETTER

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    // GETTER

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    // METODOS

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo: " + titulo + "\nDuração: " + duracao);
        this.totalDeReproducao++;
    }
}
