
package miolivc.com.agendadacidade.model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Laerton_note on 25/07/2017.
 */

/***
 * Classe encarregada de cuidar dos dados de um usuário.
 * Autor: Laerton Marques de Figueiredo
 */
public class Usuario {
    private long id;
    private String login, senha, email, nome, doc;
    private boolean juridica, aceito;
    private TipoUser tipo;
    private List<Pessoa> anuncios;
    private List<PathImagem> imagens;

    public Usuario() {
        anuncios = new LinkedList<>();
        imagens = new LinkedList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public boolean isJuridica() {
        return juridica;
    }

    public void setJuridica(boolean juridica) {
        this.juridica = juridica;
    }

    public boolean isAceito() {
        return aceito;
    }

    public void setAceito(boolean aceito) {
        this.aceito = aceito;
    }

    public TipoUser getTipo() {
        return tipo;
    }

    public void setTipo(TipoUser tipo) {
        this.tipo = tipo;
    }

    public Collection<Pessoa> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Pessoa> anuncios) {
        this.anuncios = anuncios;
    }

    public Collection<PathImagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<PathImagem> imagens) {
        this.imagens = imagens;
    }
    public void addAnuncio (Pessoa pessoa){
        anuncios.add(pessoa);
    }

    public void remAnuncio(Pessoa pessoa) {
        anuncios.remove(pessoa);
    }

    public void addImagem(PathImagem imagem){
        imagens.add(imagem);
    }

    public  void remImagem(PathImagem imagem){
        imagens.remove(imagem);
    }
}
