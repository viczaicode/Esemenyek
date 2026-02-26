package model;

import java.time.LocalDateTime;

public final class Konferencia extends Esemeny {

    private final int resztvevokSzama;

    public Konferencia(String nev, LocalDateTime datum, String helyszin, int resztvevokSzama) {
        super(nev, datum, helyszin);
        if (resztvevokSzama < 0) {
            throw new IllegalArgumentException("reszvetok szama nem lehet negativ!!!!!!!!!!!");
        }
        this.resztvevokSzama = resztvevokSzama;
    }

    public int getResztvevokSzama() {
        return resztvevokSzama;
    }

    @Override
    public String getTipus() {
        return "Konferencia";
    }
}
