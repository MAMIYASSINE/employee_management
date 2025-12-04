package tn.esprit.gestionemploye.entities;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class AffectationHashMap {
    private Map<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("⚠️ Employé déjà affecté à un département : "
                    + affectations.get(e).getNomDepartement());
        } else {
            affectations.put(e, d);
            System.out.println(" Affectation ajoutée : " + e.getNom() +
                    " → " + d.getNomDepartement());
        }
    }

    public void afficherEmployesEtDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation trouvée.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println(" Employé supprimé : " + e.getNom());
        } else {
            System.out.println(" Employé non trouvé.");
        }
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
            System.out.println(" Affectation supprimée : " + e.getNom() +
                    " - " + d.getNomDepartement());
        } else {
            System.out.println(" Cette affectation n'existe pas.");
        }
    }

    public void afficherEmployes() {
        Set<Employe> employees = affectations.keySet();
        if (employees.isEmpty()) {
            System.out.println("Liste vide.");
            return;
        }
        employees.forEach(System.out::println);
    }

    public void afficherDepartements() {
        if (affectations.isEmpty()) {
            System.out.println("Liste vide.");
            return;
        }
        affectations.values().forEach(System.out::println);
    }
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
