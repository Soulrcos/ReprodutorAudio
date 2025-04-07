package br.com.alura.reprodutorAudio.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() > 5){
            System.out.println(audio.getTitulo() + " é preferido por todos");
        } else{
            System.out.println(audio.getTitulo() + " é bom, mas ouve depois");
        }
    }
}
