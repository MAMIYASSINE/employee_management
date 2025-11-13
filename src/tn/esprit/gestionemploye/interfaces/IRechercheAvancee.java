package tn.esprit.gestionemploye.interfaces;

import java.util.List;

public interface IRechercheAvancee <T>{
    public List<T> rechercherParDepartement(String nomDepartement);

}
