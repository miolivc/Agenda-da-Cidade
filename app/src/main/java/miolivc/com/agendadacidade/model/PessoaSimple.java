package miolivc.com.agendadacidade.model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by laerton on 8/1/17.
 */

public class PessoaSimple {
    private long idUser, id;
    private String nome;
    private List<Telefone> telefones;
    private List<PathImagem> imagens;

    public PessoaSimple() {
        this.telefones = new LinkedList<>() ;
        this.imagens = new LinkedList<>();
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<PathImagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<PathImagem> imagens) {
        this.imagens = imagens;
    }

}
