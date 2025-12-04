package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.AffectationHashMap;
import tn.esprit.gestionemploye.entities.Departement;
import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.SocieteArrayList;

import java.util.List;

public class EmployeManagement {
    public static void main(String[] args) {
//        SocieteArrayList societe = new SocieteArrayList();
//
//        Employe e1 = new Employe(1, "Lakhdhar", "Yassine", "Informatique", 3);
//        Employe e2 = new Employe(2, "Jileni", "Yassine", "Marketing", 2);
//        Employe e3 = new Employe(3, "Trabelsi", "Ahmed", "Informatique", 4);
//        Employe e4 = new Employe(4, "Ben Salah", "Sami", "RH", 1);
//
//        societe.ajouterEmploye(e1);
//        societe.ajouterEmploye(e2);
//        societe.ajouterEmploye(e3);
//        societe.ajouterEmploye(e4);
//
//        System.out.println("\nAFFICHAGE DES EMPLOYÉS ");
//        societe.displayEmploye();
//
//        System.out.println("\n RECHERCHE PAR EMPLOYÉ ");
//        System.out.println("e2 trouvé ? " + societe.rechercherEmploye(e2));
//
//        System.out.println("\n RECHERCHE PAR NOM ");
//        System.out.println("Nom 'salah' trouvé ? " + societe.rechercherEmploye("salah"));
//
//        System.out.println("\n SUPPRESSION D’UN EMPLOYÉ ");
//        societe.supprimerEmploye(e3);
//        System.out.println("Après suppression de e3 :");
//        societe.displayEmploye();
//
//        System.out.println("\n TRI PAR ID ");
//        societe.trierEmployeParId();
//
//        System.out.println("\n TRI PAR DÉPARTEMENT / GRADE / NOM ");
//        societe.trierEmployeParNomDepartementEtGrade();
//
//        System.out.println("\nAffichage des employees par departement");
//        List<Employe> employesByDepart = societe.rechercherParDepartement("Informatique");
//        for (Employe e : employesByDepart) {
//            System.out.println(e);
//        }

        AffectationHashMap map = new AffectationHashMap();

        Employe e1 = new Employe(1, "Lakhdhar", "Yassine", "Informatique", 3);
        Employe e2 = new Employe(2, "Jileni", "Yassine", "Marketing", 2);
        Employe e3 = new Employe(3, "Trabelsi", "Ahmed", "Informatique", 4);

        Departement d1 = new Departement(10, "Informatique", 20);
        Departement d2 = new Departement(20, "Marketing", 15);
        Departement d3 = new Departement(30, "RH", 10);

        // 2. Affectation
        map.ajouterEmployeDepartement(e1, d1);
        map.ajouterEmployeDepartement(e2, d2);
        map.ajouterEmployeDepartement(e3, d1);

        System.out.println("\n Affichage des affectations");
        map.afficherEmployesEtDepartements();

        System.out.println("\n Test double affectation");
        map.ajouterEmployeDepartement(e1, d3);

        System.out.println("\n Suppression employé e2");
        map.supprimerEmploye(e2);

        System.out.println("\n Suppression affectation e3 → d1");
        map.supprimerEmployeEtDepartement(e3, d1);

        System.out.println("\n Liste des employés restants");
        map.afficherEmployes();

        System.out.println("\n Liste des départements");
        map.afficherDepartements();

        System.out.println("\n Recherche employé e1 : " + map.rechercherEmploye(e1));

        System.out.println(" Recherche département d2 : " + map.rechercherDepartement(d2));

        System.out.println("\n Map triée par ID employé");
        System.out.println(map.trierMap());
    }

}
