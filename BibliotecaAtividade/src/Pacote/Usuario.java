package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
    private String Nome;
    private int Idade;
    private List<Livro> LivrosEmprestados;

    public Usuario(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.LivrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro Livro) {
        if (LivrosEmprestados.contains(Livro)) {
            System.out.println("Você já possui este livro emprestado.");
        } else if (LivrosEmprestados.size() >= 3) {
            System.out.println("Você já atingiu o limite de 3 livros emprestados.");
        } else {
            LivrosEmprestados.add(Livro);
            System.out.println("Livro emprestado com sucesso.");
        }
    }

    public void devolverLivro(Livro Livro) {
        if (LivrosEmprestados.contains(Livro)) {
            LivrosEmprestados.remove(Livro);
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("Você não possui este livro emprestado.");
        }
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public List<Livro> getLivrosEmprestados() {
        return LivrosEmprestados;
    }
}