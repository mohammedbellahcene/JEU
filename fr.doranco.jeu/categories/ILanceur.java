
package categories;

import personnages.Personnage;

public interface ILanceur {
    public int TEST = 2;

    public void attaqueADistance(Personnage p);

    public boolean esquiverADistance(int degats);

    default void test() {
        System.out.println("cette méthode est déclarée dans l'intérface ILanceur");
    }

    static void essai() {
        System.out.println("méthode statique ILanceur");
    }
}
