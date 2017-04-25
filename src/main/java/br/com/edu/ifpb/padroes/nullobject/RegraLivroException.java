package br.com.edu.ifpb.padroes.nullobject;

/**
 * Created by diogomoreira on 18/07/16.
 */
public class RegraLivroException extends Exception {

    public RegraLivroException(String message) {
        super(message);
    }

    public RegraLivroException(String message, Throwable cause) {
        super(message, cause);
    }
}
