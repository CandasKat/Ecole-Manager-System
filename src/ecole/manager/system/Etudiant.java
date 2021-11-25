package ecole.manager.system;

/**
 * Créé par Candas le 25/11/2021.
 * Cette classe est responsable du suivi des frais scolarité,
 * du nom, de la note et de frais payés
 * des étudiants.
 */

public class Etudiant {
    private int id;
    private String nom;
    private int notes;
    private int fraisPaye;
    private int fraisTotal;

    /**
     * pour créer un nouvel élève en initialisant.
     * Frais pour toutes les étudiantes est 30.000-.
     * Frais payés initialisant est 0.
     * @param id id pour etudiant: unique.
     * @param nom nom d'étudiant.
     * @param notes les notes d'étudiant.
     */

    public Etudiant(int id, String nom, int notes){
        this.fraisPaye = 0;
        this.fraisTotal = 30000;
        this.id = id;
        this.nom = nom;
        this.notes = notes;

    }

    //Ne va pas modifier le nom de l'étudiant, l'id' de l'étudiant

    public void setNotes(int notes){
        this.notes = notes;
    }

    /**
     * continuez à ajouter les frais au champ fraisPaye.
     * Ajouter le frais dans le frais payée.
     * L'école receivra le frais
     * @param frais le frais que les étudiants pay.
     */

    public  void updateFraisPaye (int frais){
        fraisPaye += frais;
    }

    /**
     *
     * @return id d'étudiant.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return nom d'étudiant.
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return note d'étudiant.
     */

    public int getNotes() {
        return notes;
    }

    /**
     *
     * @return frais payée par étudiant.
     */

    public int getFraisPaye() {
        return fraisPaye;
    }

    /**
     *
     * @return frais payée total par étudiant.
     */
    public int getFraisTotal() {
        return fraisTotal;
    }
}
