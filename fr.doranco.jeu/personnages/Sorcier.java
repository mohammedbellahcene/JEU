package personnages;

public class Sorcier extends Mage {
    private int magieNoire;

    public Sorcier() {

    }

    public Sorcier(String nom, String metier, int force, int dureeDeVie, int mana, int magieNoire) {
        super(nom, metier, force, dureeDeVie, mana);
        this.magieNoire = magieNoire;
    }

    public int getMagieNoire() {
        return magieNoire;
    }

    public void setMagieNoire(int magieNoire) {
        this.magieNoire = magieNoire;
    }

    public String fiche() {
        return super.fiche()
                + "Points de magie noire : " + this.magieNoire + "\n";
    }

    @Override
    public String toString() {
        return "Sorcier [magieNoire=" + magieNoire + super.toString() + "]";
    }

}
