package tn.esprit.gestionemploye.comparator;

import tn.esprit.gestionemploye.entities.Departement;

import java.util.Comparator;

public class DepartementsNomNombreEmployesComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement d1, Departement d2) {
        int dne=d1.getNomDepartement().compareToIgnoreCase(d2.getNomDepartement());
        if (dne==0){
            dne=Integer.compare(d1.getNombreEmployes(),d2.getNombreEmployes());
        }
        return dne;
    }
}
