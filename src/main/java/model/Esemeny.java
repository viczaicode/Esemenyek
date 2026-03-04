//kesz

package model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Esemeny {

    private final UUID id;
    private final String nev;
    private final LocalDateTime datum;
    private final String helyszin;

    protected Esemeny(String nev, LocalDateTime datum, String helyszin) {
        this.id = UUID.randomUUID();
        this.nev = nev;
        this.datum = datum;
        this.helyszin = helyszin;
    }

    public UUID getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public abstract String getTipus();

    @Override
    public String toString() {
        return id + " | " + nev + " | " + datum + " | " + helyszin;
    }
}