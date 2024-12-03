import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando Autor
        Autor autor = new Autor("Jessica Felix", 35);

        // Criando Livro
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        // Criando Usuario
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando Data
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        // Realizando Emprestimo
        try {
            Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

            // Exibindo Detalhes do Empréstimo
            System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
            System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
            System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
            System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
            System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
            System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
            System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
