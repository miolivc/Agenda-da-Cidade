package miolivc.com.agendadacidade.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by laerton on 8/1/17.
 */


public class AlfabectResult
{
    private String letra ;
    private List<PessoaSimple> listaPessoaSimples;

    public AlfabectResult() {
        this.listaPessoaSimples = new LinkedList<>();

    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public List<PessoaSimple> getListaPessoaSimples() {
        return listaPessoaSimples;
    }

    public void setListaPessoaSimples(List<PessoaSimple> listaPessoaSimples) {
        this.listaPessoaSimples = listaPessoaSimples;
    }
}
