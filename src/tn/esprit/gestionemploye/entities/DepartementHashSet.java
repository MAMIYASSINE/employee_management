package tn.esprit.gestionemploye.entities;

import tn.esprit.gestionemploye.comparator.DepartementsNomNombreEmployesComparator;
import tn.esprit.gestionemploye.services.IDepartement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    Set<Departement> departements=new HashSet<>();

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        Iterator<Departement> iterator=departements.iterator();
        while(iterator.hasNext()){
            Departement departement=iterator.next();
            if(departement.getNomDepartement().equals(nomDepartement)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        Iterator<Departement> iterator=departements.iterator();
        while(iterator.hasNext()){
            Departement departement1=iterator.next();
            if(departement1.equals(departement)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {

        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        Iterator<Departement> iterator=departements.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Override
    public void trierDepartementsParId() {
        TreeSet<Departement> Treedepartements=new TreeSet<>(departements);
        Iterator<Departement> iterator=Treedepartements.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        TreeSet<Departement> departementTreeParNom = new TreeSet<>(new DepartementsNomNombreEmployesComparator());
        departementTreeParNom.addAll(departements);
        Iterator<Departement> iterator=departementTreeParNom.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
