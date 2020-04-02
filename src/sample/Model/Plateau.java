package sample.Model;



public class Plateau {

    private final int Taille_Plateau = 9;
    private Joueur[] action;

    public Plateau() {
        action = new Joueur[Taille_Plateau];

    }
    public boolean CaseValide(int Case) {
        return (1 <= Case && Case <= Taille_Plateau);
    }

    public void setCase(Joueur joueur, int Case) {
        if (!CaseValide(Case))
            throw new IllegalArgumentException(" Case choisie en dehors du tableau ");
        else if (action[Case - 1] != null)
            throw new IllegalArgumentException("La case est déjà occupée");
        action[Case - 1] = joueur;
    }
    public Joueur getCase(int Case) {
        if (!CaseValide(Case))
            throw new IllegalArgumentException("Case choisie en dehors du tableau ");
        return action[Case - 1];
    }


    public Joueur gagnant() {
        if (action [0] != null && action [0] == action [1] && action [1] == action [2])
            return action[0];
        if (action[3] != null && action[3] == action[4] && action[4] == action[5])
            return action[3];
        if (action[6] != null && action[6] == action[7] && action[7] == action[8])
            return action[6];

        // Verticale
        if (action[0] != null && action[0] == action[3] && action[3] == action[6])
            return action[0];
        if (action[1] != null && action[1] == action[4] && action[4] == action[7])
            return action[1];
        if (action[2] != null && action[2] == action[5] && action[5] == action[8])
            return action[2];

        //Diagonale
        if (action[0] != null && action[0] == action[4] && action[4] == action[8])
            return action[0];
        if (action[2] != null && action[2] == action[4] && action[4] == action[6])
            return action[2];

        //Aucun gagnant trouvé
        return null;
    }
    public boolean pleine() {
        for (Joueur joueur: action) {
            if (joueur == null)
                return false;
        }
        return true;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < action.length; i++) {
            if (action[i] == null) {
                sb.append(i + 1);
            } else {
                sb.append(action[i].getSymbol());
            }

            if ((i + 1) % 3 == 0 && i != action.length - 1) {
                sb.append(System.lineSeparator());
            } else if (i != action.length - 1) {
                sb.append(' ');
            }
        }

        return sb.toString();
    }

}



