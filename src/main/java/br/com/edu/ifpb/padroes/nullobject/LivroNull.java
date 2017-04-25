package br.com.edu.ifpb.padroes.nullobject;

/**
 * {@link LivroNull} atende as necessidades de interface mas não realiza nenhuma
 * operação, mantendo o estado do sistema.
 * 
 * @author diogomoreira
 *
 */
public class LivroNull implements Livro {

	private static Livro LIVRO_NULO = new LivroNull();

	public void emprestar() throws RegraLivroException {
		throw new RegraLivroException("Livro não existe");
	}

	public void devolver() throws RegraLivroException {
		throw new RegraLivroException("Livro não existe");
	}

	public static Livro getInstance() {
		return LIVRO_NULO;
	}
}
