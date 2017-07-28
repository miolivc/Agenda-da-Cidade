
package miolivc.com.agendadacidade.model;

/**
 * Created by Laerton_note on 25/07/2017.
 */

public class Telefone {
    private String obs, variante, tipo, numero;

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;

        Telefone telefone = (Telefone) o;

        return getNumero() != null ? getNumero().equals(telefone.getNumero()) : telefone.getNumero() == null;

    }

    @Override
    public int hashCode() {
        return getNumero() != null ? getNumero().hashCode() : 0;
    }
}

