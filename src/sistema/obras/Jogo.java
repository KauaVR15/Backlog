package sistema.obras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogo extends Obra {
    private String desenvolvedora;
    private String plataforma;
    private Double horasCampanha;

    public Jogo(){}

    public Jogo(String titulo, String anoLancamento, String anotacao,
                String desenvolvedora, String plataforma, Double horasCampanha){

        super(titulo, anoLancamento, anotacao);
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.horasCampanha = horasCampanha;

    }

    public String getDesenvolvedora(){
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora){
        this.desenvolvedora = desenvolvedora;
    }

    public String getPlataforma(){
        return plataforma;
    }

    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }

    public Double getHorasCampanha(){
        return horasCampanha;
    }

    public void setHorasCampanha(Double horasCampanha){
        this.horasCampanha = horasCampanha;
    }

    @Override
    public String toString(){
        return super.toString() + "\n|Desenvolvedora: " + desenvolvedora +
                "\n|Plataforma: " + plataforma + "\n|Total horas: " + horasCampanha;
    }

}
