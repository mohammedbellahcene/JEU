
package personnages;

import categories.*;

public class Archer extends Guerrier implements ILanceur {

    @Override
    public void attaqueADistance(Personnage p) {

    }

    @Override
    public boolean esquiverADistance(int degats) {

        return false;
    }

}
