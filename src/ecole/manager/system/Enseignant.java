package ecole.manager.system;

/**
 * Créé par Candas le 25/11/2021.
 * Cette classe est responsable du suivi
 * du nom, de l'id, de salaire d'enseignants
 */

public class Enseignant {

    private int id;
    private String nom;
    private int salaire;
    private int salaireRecu;

    /**
     * Creer un nouvel object d'enseignant.
     * @param id pour ensignant.
     * @param nom nom d'enseignant.
     * @param salaire salaire d'enseignant.
     */

    public Enseignant(int id, String nom, int salaire){
        this.id = id;
        this.nom = nom;
        this.salaire = salaire;
        this.salaireRecu = 0;
    }

    /**
     *
     * @return de l'id de enseignant.
     */

    public int getId(){
        return id;
    }

    /**
     *
     * @return du nom d'ensignant.
     */
    public String getNom(){
        return nom;
    }

    /**
     *
     * @return de la salaire d'enseignant.
     */
    public int getSalaire(){
        return salaire;
    }

    /**
     *set a salaire.
     * @param salaire d'enseignant.
     */

    public void setSalaire(int salaire){
        this.salaire = salaire;
    }

    /**
     * Ajouter le salaireRecu
     * Soustrait de l'argent total gagné par l'école.
     * @param salaire
     */

    public void salaireRecu(int salaire){
        salaireRecu += salaire;
        Ecole.updateSalairePaye(salaire);
    }

    public String toString(){
        return "Nom d'enseignant : " + nom +
                " salaire payé jusqu'à présent chf" + salaireRecu;
    }


}
