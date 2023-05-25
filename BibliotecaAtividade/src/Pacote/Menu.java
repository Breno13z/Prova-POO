package Pacote;

public class Menu {

	public static void main(String[] args) {


        Livro Livro1 = new Livro("O Pequeno Principe", "Antoine de Saint-Exupéry", 93);
        Livro Livro2 = new Livro("Harry Potter e a Ordem da Fênix", "J. K. Rowling", 704);

        Usuario Usuario1 = new Usuario ("Breno", 21);
        Usuario Usuario2 = new Usuario ("Brenu", 21);

        Biblioteca Biblioteca = new Biblioteca();

        Biblioteca.adicionarLivro(Livro1);
        Biblioteca.adicionarLivro(Livro2);

        Biblioteca.exibirLivrosDisponiveis();

        Usuario1.emprestarLivro(Livro1);

        Usuario2.emprestarLivro(Livro2);

        Usuario1.emprestarLivro(Livro1);

        Usuario1.devolverLivro(Livro1);

        Biblioteca.usuariosComLivrosEmprestados();
    }
}