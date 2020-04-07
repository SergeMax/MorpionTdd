package Model;

import org.junit.jupiter.api.Test;
import sample.Model.Joueur;
import sample.Model.Partie;
import sample.Model.Plateau;
import sample.MyExceptions.illegalArgument;

import static org.junit.jupiter.api.Assertions.*;

public class  PartieTest {


    @Test
    public void testNewPartie() {

        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertNotNull(partie);

    }


    @Test
    public void testgetNomPartie() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertEquals("Partie 1", partie.getNomPartie());

    }

    @Test
    public void testgetNomPartieErreur() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertNotEquals("Partieeee", partie.getNomPartie());

    }

    @Test
    public void testgetNomJoueur1() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Touria", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertEquals("Maxime", partie.getJoueur1().getNom());

    }

    @Test
    public void testgetNomJoueur1Erreur() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Touria", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertNotEquals("Meee", partie.getJoueur1().getNom());

    }

    @Test
    public void testgetNomJoueur2() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Touria", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertEquals("Touria", partie.getJoueur2().getNom());

    }

    @Test
    public void testgetNomJoueur2Erreur() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Touria", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);
        assertNotEquals("Meee", partie.getJoueur2().getNom());

    }

    @Test
    public void testsetNomPartie() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertEquals("Partie Test", partie.setNomPartie("Partie Test"));

    }

    @Test
    public void testsetJoueur1() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertEquals(joueur1, partie.setJoueur1(joueur1));

    }

    @Test
    public void testsetJoueurError2() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertNotEquals(joueur2, partie.setJoueur1(joueur1));

    }

    @Test
    public void testsetJoueur() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertEquals(joueur2, partie.setJoueur2(joueur2));

    }

    @Test
    public void testsetJoueurError() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertNotEquals(joueur1, partie.setJoueur2(joueur2));

    }


    @Test
    public void testsetNomPartieError() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);

        assertNotEquals("Partie", partie.setNomPartie("Partie Test"));

    }


    @Test
    public void testPartieFinie() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);


        try {
            partie.getPlateau().setCase(joueur1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            partie.getPlateau().setCase(joueur1, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            partie.getPlateau().setCase(joueur1, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }

        assertNull(partie.getPlateau().gagnant());

    }

    @Test
    public void testPartiePasFinie() {


        Joueur joueur1 = new Joueur("Maxime", 'x');
        Joueur joueur2 = new Joueur("Maxime", 'x');
        Plateau plateau = new Plateau();


        Partie partie = new Partie("Partie 1", joueur1, joueur2, plateau);


        try {
            partie.getPlateau().setCase(joueur1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            partie.getPlateau().setCase(joueur1, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            partie.getPlateau().setCase(joueur1, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }

        assertNotNull(partie.getPlateau().gagnant());

    }


}