package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.comparator.EmployeDepartementComparator;
import tn.esprit.gestionemploye.comparator.EmployeGradeComparator;
import tn.esprit.gestionemploye.comparator.EmployeNomComparator;
import tn.esprit.gestionemploye.interfaces.IGestion;
import tn.esprit.gestionemploye.interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> employees=new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {

        employees.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employees) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employees.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employees.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for (Employe employee : employees) {
            System.out.println(employee);
        }

    }

    @Override
    public void trierEmployeParId() {

        Collections.sort(employees);
        System.out.println(employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        System.out.println("Trier par departement");
        employees.sort(new EmployeDepartementComparator().thenComparing(new EmployeDepartementComparator()));
        System.out.println(employees);
        System.out.println("Trier par Grade");
        employees.sort(new EmployeGradeComparator().thenComparing(new EmployeGradeComparator()));
        System.out.println(employees);
        System.out.println("Trier par Nom");
        employees.sort(new EmployeNomComparator().thenComparing(new EmployeNomComparator()));
        System.out.println(employees);

    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> employeesByDepart=new ArrayList<>();
        for (Employe e : employees) {
            if(e.getNomDepartement().equals(nomDepartement)){
                employeesByDepart.add(e);
            }
        }
        return employeesByDepart;
    }
}
