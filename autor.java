package model;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livrosEscritos = new ArrayList<>();

    public Autor(String nome, int idade) {
        super(nome, idade);
    }

    public void adicionarLivro(Livro livro) {
        livrosEscritos.add(livro);
    }

    public List<Livro> getLivrosEscritos() {
        return livrosEscritos;
    }
}
