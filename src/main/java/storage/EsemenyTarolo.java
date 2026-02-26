package storage;

import model.Esemeny;


import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EsemenyTarolo {

    private final Map<UUID, Esemeny> esemenyek = new HashMap<>();

    public void hozzaadEsemeny(Esemeny e) {
        esemenyek.put(e.getId(), e);
    }

    public Esemeny getEsemenyById(UUID id) {
        return esemenyek.get(id);
    }

    public List<Esemeny> getOsszesEsemeny() {
        return List.copyOf(esemenyek.values());
    }

    public List<Esemeny> getEsemenyekDatumSzerint(LocalDate date) {
        return esemenyek.values()
                .stream()
                .filter(e -> e.getDatum().toLocalDate().equals(date))  //EZ A STREAM AI VOLT NEM TUDTAM VOLNA MAGAMTOL MEGIRNI TESZTHEZ KELLETT!
                .collect(Collectors.toList());
    }

}