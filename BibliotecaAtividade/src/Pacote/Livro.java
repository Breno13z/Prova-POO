package Pacote;

public class Livro {
	
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public Livro(String Titulo, String Autor, int NumPaginas) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

	public Usuario[] getLivrosEmprestados() {

		return null;
	}
}
