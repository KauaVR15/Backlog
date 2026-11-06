package sistema.obras;

public class Filme extends Obra{

    private String diretor;
    private String genero;
    private Double duracao;

    public Filme(){}

    public Filme(String titulo, String anoLancamento, String anotacao,
                 String diretor, String genero,  Double duracao) {

        super(titulo, anoLancamento, anotacao);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao){
        this.duracao = duracao;
    }

    @Override
    public String toString(){
        return super.toString() + "\n|Diretor: " + diretor + "\n|Genero: " + genero + "\n|Duracao: " + duracao;
    }

}
