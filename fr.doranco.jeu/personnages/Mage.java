package personnages;

import categories.*;

public class Mage extends Personnage implements ILanceur {
    private int mana;

    public Mage() {
        super();
    }

    public Mage(String nom, String metier, int force, int dureeDeVie, int mana) {
        super(nom, metier, force, dureeDeVie);
        this.mana = mana;
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

    public void attaquer(Personnage cible) {
        int degats;
        if (this.getMana() >= 100) {
            degats = this.getForce() * 4;
        } else if (this.getMana() >= 51 && this.getMana() < 100)
            degats = this.getForce() * 3;

        cible.setDureeDeVie(cible.getDureeDeVie() - this.getForce());
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
