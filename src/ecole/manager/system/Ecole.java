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
    private int totalFraisReceve;
    private int totalSalairePaye;

    /**
     * Nouvel object est cré.
     * @param enseignants list des enseignants.
     * @param etudiants list des étudiants.
     */
    public Ecole(List<Enseignant> enseignants, List<Etudiant> etudiants) {
        this.enseignants = enseignants;
        this.etudiants = etudiants;
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
     * @param enseignant enseignant d'école.
     */
    public void addEnseignant(Enseignant enseignant) {
        enseignants.add(enseignant);
    }

    public List<Etudiant> getEtudiant() {
        return etudiants;
    }

    public void setEtudiant(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public int getTotalFraisReceve() {
        return totalFraisReceve;
    }

    public void setTotalFraisReceve(int totalFraisReceve) {
        this.totalFraisReceve = totalFraisReceve;
    }

    public int getTotalSalairePaye() {
        return totalSalairePaye;
    }

    public void setTotalSalairePaye(int totalSalairePaye) {
        this.totalSalairePaye = totalSalairePaye;
    }
}