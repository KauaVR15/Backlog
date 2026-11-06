package sistema.obras;

public abstract class Obra{

    private String titulo;
    private String anoLancamento;
    private String anotacao;

    public Obra(){}

    public Obra(String titulo, String anoLancamento, String anotacao){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.anotacao = anotacao;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao){
        this.anotacao = anotacao;
    }

    @Override
    public String toString(){
        return "|Titulo: " + titulo + "\n|Data de Lançamento: " + anoLancamento
                + "\n|Anotação: " + anotacao;
    }
}