package br.com.edu.ifpb.padroes.nullobject;

import java.util.List;

public class ServicoLivro {
	
	private LivroDAO dao;
	
	public ServicoLivro() {
		this.dao = new LivroDAO();
	}
	
	public void devolverLivro(String isbn) throws RegraLivroException {
		Livro livro = this.dao.recuperarLivro(isbn);
		livro.devolver();
	}
	
	public List<Livro> recuperarLivros() {
		return this.dao.recuperarTodos();
	}

}
