package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> LivrosDisponiveis;

    public Biblioteca() {
        this.LivrosDisponiveis = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        LivrosDisponiveis.add(livro);
        System.out.println("Livro adicionado com sucesso.");
    }

    public void exibirLivrosDisponiveis() {
        if (LivrosDisponiveis.isEmpty()) {
            System.out.println("A biblioteca não possui nenhu livro disponível.");
        } else {
            System.out.println("Os livros disponíveis são:");
            for (Livro livro : LivrosDisponiveis) {
                System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Numero de páginas: " + livro.getNumPaginas());
            }
        }
    }

    public void usuariosComLivrosEmprestados() {
        List<Usuario> Usuarios = new ArrayList<>();
        for (Livro Livro : LivrosDisponiveis) {
            for (Usuario Usuario : Livro.getLivrosEmprestados()) {
                if (!Usuarios.contains(Usuario)) {
                    Usuarios.add(Usuario);
                }
            }
        }
        if (Usuarios.isEmpty()) {
            System.out.println("Não há nehum usuário com livro emprestado.");
        } else {
            System.out.println("Os usuários com livros emprestados são:");
            for (Usuario Usuario : Usuarios) {
                System.out.println("Nome: " + Usuario.getNome() + ", Idade: " + Usuario.getIdade());
            }
        }

	}
}