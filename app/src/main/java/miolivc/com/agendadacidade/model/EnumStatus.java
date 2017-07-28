package miolivc.com.agendadacidade.model;

/**
 * Created by Laerton_note on 25/07/2017.
 */

public enum EnumStatus {
    INCLUI(0), ALTERADO(1), EXCLUIDO(2),NONE(3);
    private long value ;

    EnumStatus(long value) {
        this.value = value;
    }
}
