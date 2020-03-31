package sample.Model;

import java.util.ArrayList;

public class Plateau extends ArrayList{

    public ArrayList<int[]> plateau = new ArrayList();

    public Plateau() {
        int[] ligne = {3, 3, 3};
        this.plateau.add(ligne);
        this.plateau.add(ligne);
        this.plateau.add(ligne);

    }

    public ArrayList<int[]> getPlateau() {
        return plateau;
    }
}
