package miolivc.com.agendadacidade.model;

/**
 * Created by Laerton_note on 25/07/2017.
 */

/***
 * Enum de tipo e usuário.
 */
public enum TipoUser {
    ANUNCIANTE(0), ADMINSITRADOR(1);
    public int valor;
    TipoUser(int valor){
        this.valor = valor;
    }
}
