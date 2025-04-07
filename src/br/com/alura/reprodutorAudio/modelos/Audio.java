package br.com.alura.reprodutorAudio.modelos;

public class Audio {
    private String titulo;
    private String duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;


    // SETTER

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
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

    public int getClassificacao() {
        return classificacao;
    }

    // METODOS

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducao++;
    }


}
