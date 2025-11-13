package tn.esprit.gestionemploye.main;

import tn.esprit.gestionemploye.entities.Employe;
import tn.esprit.gestionemploye.entities.SocieteArrayList;

import java.util.List;

public class EmployeManagement {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Lakhdhar", "Yassine", "Informatique", 3);
        Employe e2 = new Employe(2, "Jileni", "Yassine", "Marketing", 2);
        Employe e3 = new Employe(3, "Trabelsi", "Ahmed", "Informatique", 4);
        Employe e4 = new Employe(4, "Ben Salah", "Sami", "RH", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("\nAFFICHAGE DES EMPLOYÉS ");
        societe.displayEmploye();

        System.out.println("\n RECHERCHE PAR EMPLOYÉ ");
        System.out.println("e2 trouvé ? " + societe.rechercherEmploye(e2));

        System.out.println("\n RECHERCHE PAR NOM ");
        System.out.println("Nom 'salah' trouvé ? " + societe.rechercherEmploye("salah"));

        System.out.println("\n SUPPRESSION D’UN EMPLOYÉ ");
        societe.supprimerEmploye(e3);
        System.out.println("Après suppression de e3 :");
        societe.displayEmploye();

        System.out.println("\n TRI PAR ID ");
        societe.trierEmployeParId();

        System.out.println("\n TRI PAR DÉPARTEMENT / GRADE / NOM ");
        societe.trierEmployeParNomDepartementEtGrade();

        System.out.println("\nAffichage des employees par departement");
        List<Employe> employesByDepart = societe.rechercherParDepartement("Informatique");
        for (Employe e : employesByDepart) {
            System.out.println(e);
        }

    }
}