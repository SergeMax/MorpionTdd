package sample.Model;

import java.util.ArrayList;

public class Plateau {

    public ArrayList<int[]> plateau = new ArrayList();

    public Plateau(ArrayList<int[]> plateau) {
        int[] ligne = {3, 3, 3};
        this.plateau.add(ligne);
        this.plateau.add(ligne);
        this.plateau.add(ligne);
        this.plateau = plateau;
    }

}
