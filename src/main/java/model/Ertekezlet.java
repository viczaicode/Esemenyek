//kesz


package model;

import java.time.LocalDateTime;

public final class Ertekezlet extends Esemeny {

    private int Ertekezlettipus;

    public Ertekezlet(String nev, LocalDateTime datum, String helyszin, int Ertekezlettipus) {
        super(nev, datum, helyszin);
        this.Ertekezlettipus = Ertekezlettipus;
    }

    public int getErtekezletTipus() {
        return this.Ertekezlettipus;
    }

    @Override
    public String getTipus() {
        return "Értekezlet - " + Ertekezlettipus;
    }
}