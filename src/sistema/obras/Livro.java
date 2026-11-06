package sistema.obras;

public class Livro extends Obra{

    private String autor;
    private String editora;
    private String quantidadePaginas;

    public Livro(){}

    public Livro(String titulo, String anoLancamento, String anotacao,
                 String autor, String editora, String quantidadePaginas){

        super(titulo, anoLancamento, anotacao);
        this.autor = autor;
        this.editora = editora;
        this.quantidadePaginas = quantidadePaginas;

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEitora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public void setQuantidadePaginas(String quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String toString(){
        return super.toString() + "\n|Autor: " + autor  + "\n|Editora: " + editora + "\n|QuantidadePaginas: " + quantidadePaginas;
    }
}
