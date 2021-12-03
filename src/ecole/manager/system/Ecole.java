package ecole.manager.system;

import java.util.List;

/**
 * Les étudiants et les enseignants.
 * Implements les enseignants et
 * les étududiats avec un ArrayList.
 * Crée par Candas le 25/11/2021.
 */
public class Ecole {
    private List<Enseignant> enseignants;
    private List<Etudiant> etudiants;
    private static int totalFraisReceve;
    private static int totalSalairePaye;

    /**
     * Nouvel object est cré.
     * @param enseignants list des enseignants.
     * @param etudiants list des étudiants.
     */
    public Ecole(List<Enseignant> enseignants, List<Etudiant> etudiants) {
        this.enseignants = enseignants;
        this.etudiants = etudiants;
        totalFraisReceve = 0;
        totalSalairePaye = 0;
    }

    /**
     *
     * @return Le list d'enseignant d'école.
     */
    public List<Enseignant> getEnseignant() {
        return enseignants;
    }

    /**
     * Ajouter un enseignant à l'école.
     * @param enseignant enseignant d'école a été ajouté.
     */
    public void addEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
    }

    /**
     *
     * @return list de étudiant dans l'école.
     */

    public List<Etudiant> getEtudiant() {
        return etudiants;
    }

    /**
     *Ajouter un étudiant à l'école
     * @param etudiant
     */

    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    /**
     *
     * @return de l'argent total reçu par l'école
     */


    public int getTotalFraisReceve() {
        return totalFraisReceve;
    }

    /**
     *Ajouter le total frais reçu par l'école
     * @param fraisReceve somme d'argent ajoutée
     */

    public static void updateTotalFraisReceve(int fraisReceve) {
        totalFraisReceve += fraisReceve;
    }

    /**
     * Montant total d'argent dépensé
     * @return le total
     */

    public int getTotalSalairePaye() {
        return totalSalairePaye;
    }

    /**
     * Mettre à jour le montant d'argent dépensé par l'école.
     * C'est le montant que l'école verse aux enseignants.
     * @param salairePaye montant d'argent dépensé par l'école.
     */

    public static void updateSalairePaye(int salairePaye) {
        totalFraisReceve -= salairePaye;
    }
}