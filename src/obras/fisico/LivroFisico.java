package obras.fisico;

public class LivroFisico extends ExemplarFisico {
    private final String isbn;
    private final int edicao;
    private int localizacao;

    //construtor
    public LivroFisico(String titulo, String autor, String editora, int ano, String genero,
    		String sinopse, String capa_path,
    		int numTotalCopias, int numCopiasDisponiveis, Estado conservacao,
    		String isbn, int edicao, int localizacao) {
        super(titulo, autor, editora, ano, genero, sinopse, capa_path,
        		numTotalCopias, numCopiasDisponiveis, conservacao);
        this.isbn = isbn;
        this.edicao = edicao;
        this.localizacao = localizacao;
    }

    //Getters & Setters
    public String getIsbn() {
        return isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }
}