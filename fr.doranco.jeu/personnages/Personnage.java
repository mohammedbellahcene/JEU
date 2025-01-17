package personnages;

import java.util.RandomAccess;

import categories.Race;

public abstract class Personnage implements Cloneable {
    public static final int FORCE_MAX = 20;
    public static final int FORCE_MIN = 1;
    private String nom;
    private String metier;
    private int force;
    private int dureeDeVie;
    private Race race;

    public Personnage() {

    }

    public Personnage(String nom, String metier, int force, int dureeDeVie) {

        this.nom = nom;
        this.metier = metier;
        this.force = force;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void attaquer(Personnage cible) {
        cible.setDureeDeVie(cible.getDureeDeVie() - this.getForce());
    }

    public abstract void esquiver();

    public abstract boolean esquiver(int degats);

    public String fiche() {
        return ("\tNom : " + nom + "\n\tMétier : " + metier + "\n\tPoints de force : " + force + "\n\tPoints de vie : "
                + dureeDeVie + "\n");
    }

    @Override
    public Personnage clone() throws CloneNotSupportedException {
        return (Personnage) super.clone();
    }

    @Override
    public String toString() {
        return ""
                + "Personnage [nom=" + nom + ", metier=" + metier + ", force=" + force + ", dureeDeVie=" + dureeDeVie
                + "]";
    }

}
