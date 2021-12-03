package ecole.manager.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Enseignant sarah = new Enseignant(1,"Sarah", 6000);
        Enseignant raphael = new Enseignant(2, "Raphael", 7000);
        Enseignant maryline = new Enseignant(3, "Maryline", 7000);

        List<Enseignant> enseignantList = new ArrayList<>();
        enseignantList.add(sarah);
        enseignantList.add(raphael);
        enseignantList.add(maryline);

        Etudiant kenny = new Etudiant(1, "Kenny", 5);
        Etudiant jordan = new Etudiant(2, "Jordan", 2);
        Etudiant matthias = new Etudiant(3, "Matthias", 6);

        List<Etudiant> etudiantList = new ArrayList<>();
        etudiantList.add(kenny);
        etudiantList.add(jordan);
        etudiantList.add(matthias);

        Ecole arches = new Ecole(enseignantList, etudiantList);

        kenny.payeFrais(7000);
        jordan.payeFrais(6000);
        matthias.payeFrais(8000);
        System.out.println("Ecole des Arches a reçu chf" + arches.getTotalFraisReceve());

        System.out.println("--------------ECOLE PAYS SALAIRE--------------");

        sarah.salaireRecu(sarah.getSalaire());
        raphael.salaireRecu(raphael.getSalaire());
        maryline.salaireRecu(maryline.getSalaire());

        System.out.println("Ecole des Arches a payé pour le salaire à " + sarah.getNom() + " et maintenant école a chf" + arches.getTotalFraisReceve());

        System.out.println(jordan);
        System.out.println(raphael);
    }
}
