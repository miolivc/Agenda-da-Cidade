package miolivc.com.agendadacidade.model;

import java.util.LinkedList;

/**
 * Created by Laerton_note on 25/07/2017.
 */

public class Pessoa {
    private long lista, id;
    private EnumStatus status;
    private String nome, obs;
    private List<Telefone> telefones;

    public Pessoa() {
        telefones = new LinkedList<>();
    }

    public long getLista() {
        return lista;
    }

    public void setLista(long lista) {
        this.lista = lista;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
