package br.com.alura.reprodutorAudio.modulos;

public class Podcast extends Audio{
    private String autor;
    private String convidado;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
