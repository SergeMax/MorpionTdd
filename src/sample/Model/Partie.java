package sample.Model;

public class Partie {

public String nomPartie;
public  Joueur joueur1;
public  Joueur joueur2;
public Plateau plateau;

    public Partie(String nomPartie, Joueur joueur1, Joueur joueur2, Plateau plateau) {

        this.nomPartie = nomPartie;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.plateau = plateau;
    }

    public String getNomPartie() {
        return nomPartie;
    }



    public Joueur getJoueur1() {
        return joueur1;
    }

    public Joueur setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
        return joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;

    }

    public Joueur setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
        return joueur2;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public String setNomPartie(String partie_test) {
        this.nomPartie = partie_test;
        return partie_test;
    }
}
