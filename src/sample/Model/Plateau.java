package sample.Model;

import java.util.ArrayList;

public class Plateau extends ArrayList{

    public ArrayList<int[]> plateau = new ArrayList();

    public Plateau() {
        int[] ligne = {1, 1, 1};
        this.plateau.add(ligne);
        this.plateau.add(ligne);
        this.plateau.add(ligne);

    }

    public ArrayList<int[]> getPlateau() {
        return plateau;
    }

    @Override
    public String toString() {
String tabString = "";
        for(int i = 0; i < plateau.size(); i++)
        {
            for(int j = 0; j < plateau.size(); j++)
            {
               tabString = tabString + plateau.get(i)[j];

            }
            tabString = tabString +"\n";
        }
        return tabString;


    }
}
