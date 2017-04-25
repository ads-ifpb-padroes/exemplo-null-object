package br.com.edu.ifpb.padroes.nullobject;

public interface Livro {
	
	void emprestar() throws RegraLivroException;
	
	void devolver() throws RegraLivroException;

}
