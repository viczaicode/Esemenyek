//kesz

package model;

import java.time.LocalDateTime;

public final class Tanora extends Esemeny {

    private final String tanarNeve;

    public Tanora(String nev, LocalDateTime datum, String helyszin, String tanarNeve) {
        super(nev, datum, helyszin);
        this.tanarNeve = tanarNeve;
    }

    public String getTanarNeve() {
        return tanarNeve;
    }

    @Override
    public String getTipus() {
        return "Tanóra";
    }
}