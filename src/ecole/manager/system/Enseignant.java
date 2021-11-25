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

}
