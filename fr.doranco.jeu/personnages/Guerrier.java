package personnages;

import outils.Fonctions;

public class Guerrier extends Personnage {
    int armure;

    public Guerrier() {
        super();

    }

    public Guerrier(String nom, String metier, int force, int dureeDeVie, int armure) {
        super(nom, metier, force, dureeDeVie);

        this.setArmature(armure);

    }

    public int getArmature() {
        return armure;
    }

    public void setArmature(int armure) {
        if (armure >= 1 && armure <= 5)
            this.armure = armure;
        else if (armure < 1)
            this.armure = 1;
        else if (armure > 5)
            this.armure = 5;

    }

    public String fiche() {
        return super.fiche() + "\tPoints d'armure : " + this.armure + "\n";

    }

    @Override
    public String toString() {
        return "Guerrier [armure=" + armure + super.toString() + "]";
    }

    @Override
    public void esquiver() {

    }

    @Override
    public boolean esquiver(int degats) {
        int nbAleatoire;
        if (this.getForce() >= 15)
            nbAleatoire = Fonctions.aleatoire(1, 4);
        else if (this.getForce() >= 13)
            nbAleatoire = Fonctions.aleatoire(1, 8);
        else
            nbAleatoire = Fonctions.aleatoire(1, 10);
        if (nbAleatoire == 1)
            this.setDureeDeVie(getDureeDeVie() - (degats / 2));
        else
            this.setDureeDeVie(getDureeDeVie() - degats);
        return (nbAleatoire == 1);
    }

}
