package model;

import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataRetirada, Date dataDevolucao) {
        if (!livro.isDisponivel()) {
            throw new IllegalArgumentException("O livro não está disponível");
        }
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        livro.setDisponivel(false);
        usuario.adicionarEmprestimo(this);
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
