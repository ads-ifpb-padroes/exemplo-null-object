package br.com.edu.ifpb.padroes.nullobject;

import java.util.Optional;

/**
 * Created by diogomoreira on 18/07/16.
 */
public class Loader {

    public static void main(String[] args) throws RegraLivroException {

//        ServicoLivro s = new ServicoLivro();
//        s.devolverLivro("716826");

        LivroDAO dao = new LivroDAO();
        Livro livro = new LivroConcreto();
        Optional<Livro> livroPossivelmentNulo = Optional.ofNullable(livro);

        livroPossivelmentNulo.ifPresent((valor) -> System.out.println(valor.toString()));
    }

}
