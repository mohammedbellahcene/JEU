package personnages;

import categories.*;

public class Mage extends Personnage implements ILanceur {
    public static final int FORCE_MAX = 10;
    private int mana;

    public Mage() {

    }

    public Mage(String nom, String metier, int force, int dureeDeVie, int mana) {
        super(nom, metier, force, dureeDeVie);
        this.mana = mana;
        this.setForce(force);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String fiche() {
        return super.fiche()
                + "\tPoints de mana : " + this.mana + "\n";
    }

    @Override
    public void attaquer(Personnage cible) {
        int degats;
        if (this.getMana() >= 100) {
            degats = this.getForce() * 4;
        } else if (this.getMana() >= 50)
            degats = this.getForce() * 3;
        else if (this.getMana() >= 20)
            degats = this.getForce() * 2;
        else if (this.getMana() > 0)
            degats = this.getForce();
        else
            degats = this.getForce() / 2;

        degats = this.mana < degats ? this.mana : degats;
        if (cible instanceof ILanceur)
            cible.setDureeDeVie(cible.getDureeDeVie() - degats);
        else
            cible.esquiver(degats);

        this.setMana(this.getMana() - degats);

    }

    @Override
    public String toString() {
        return "Mage [mana=" + mana + ", toString()=" + super.toString() + "]";
    }

    @Override
    public void esquiver() {

    }

    @Override
    public boolean esquiver(int degats) {
        int nbAleatoire = (int) (Math.random() * 10 + 1);
        return nbAleatoire == 1;
    }

    @Override
    public void attaqueADistance(Personnage p) {

    }

    @Override
    public boolean esquiverADistance(int degats) {

        return false;
    }

}
