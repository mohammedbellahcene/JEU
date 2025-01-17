package personnages;

import categories.*;

public class Arbaletrier extends Guerrier implements ILanceur {

    @Override
    public void attaqueADistance(Personnage p) {

    }

    @Override
    public boolean esquiverADistance(int degats) {

        return false;
    }

}
