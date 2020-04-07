package Model;

import sample.MyExceptions.illegalArgument;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sample.Model.Joueur;
import sample.Model.Plateau;


public class PlateauTest {

    @Test
    public void CaseInoccuper() {
        Plateau plateau = new Plateau();
        Joueur  joueur = new Joueur("Test", 'x');
        int Case = 1;
        try {
            plateau.setCase(joueur, Case);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            assertEquals(plateau.getCase(Case).getNom(), joueur.getNom());
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAlternanceCase() {
        Plateau plateau = new Plateau();
        Joueur j1 = new Joueur("Maxime", 'x');
        Joueur j2 = new Joueur("Touria", 'o');
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                try {
                    plateau.setCase(j1, i);
                } catch (illegalArgument e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    plateau.setCase(j2, i);
                } catch (illegalArgument e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                try {
                    assertEquals(plateau.getCase(i), j1);
                } catch (illegalArgument e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    assertEquals(plateau.getCase(i), j2);
                } catch (illegalArgument e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testPasGagant() {
        Joueur j1 = new  Joueur("Maxime", 'x');
        Joueur j2 = new  Joueur("Touria", 'o');

        //Pas Gagant
        Plateau plateau = new Plateau ();
        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), null);

        //Tableau plein pas de gagant
        plateau = new Plateau();
        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), null);

        plateau = new Plateau();
        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), null);

        plateau = new Plateau();
        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), null);

        plateau = new Plateau();
        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j1, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), null);

        plateau = new Plateau();
        try {
            plateau .setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j1, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j2, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j1, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j1, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j2, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j1, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau .setCase(j2, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals( plateau.gagnant(), null);
    }
    @Test
    public void testHorizontalGagant() {
        Joueur joueur = new Joueur("Test", 'x');

        //Première horizontale
       Plateau plateau = new Plateau();
        try {
            plateau.setCase(joueur, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);

        //Deuxième horizontale
        plateau = new Plateau();
        try {
            plateau.setCase(joueur, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);

        //Troisième horizontale
        plateau = new Plateau();
        try {
            plateau.setCase(joueur, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);
    }
    @Test
    public void testVerticaleGagnant() {
        Joueur joueur = new Joueur("Test", 'x');

        //Première verticale
        Plateau plateau = new Plateau();
        try {
            plateau.setCase(joueur, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);

        //Deuxième verticale
        plateau = new Plateau();
        try {
            plateau.setCase(joueur, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);

        //Troisième verticale
        plateau = new Plateau();
        try {
            plateau.setCase(joueur, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);
    }
    @Test
    public void testDiagonaleGagnant() {
        Joueur joueur = new Joueur("Test", 'x');

        //Première diagonale
        Plateau plateau = new Plateau();
        try {
            plateau.setCase(joueur, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);

        //Deuxième diagonale
        plateau = new Plateau();
        try {
            plateau.setCase(joueur, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        assertEquals(plateau.gagnant(), joueur);
    }
    @Test
    public void testPlateauPlein() {
        Plateau plateau = new Plateau();
        Joueur joueur= new Joueur("Test", 'x');

        try {
            plateau.setCase(joueur, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 4);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 6);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 8);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }

        assertEquals(plateau.pleine(), true);
    }
    @Test
    public void testPlateauVide() {
        Plateau plateau = new Plateau();
        assertEquals(plateau.pleine(), false);
    }
    @Test
    public void testTableauMoitierPlein() {
        Plateau plateau = new Plateau();
        Joueur joueur = new Joueur("Teste", 'x');

        try {
            plateau.setCase(joueur, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 3);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 5);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 7);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(joueur, 9);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }

        assertEquals(plateau.pleine(), false);
    }

    @Test
    public void testNegativeCase() {
        try {
            Plateau plateau = new Plateau();
            Joueur joueur = new Joueur("Test", 'x');
            plateau.setCase(joueur, -1);
        }
        catch (illegalArgument ex) {
            String expectedMessage = "Case choisie en dehors du plateau";
            assertEquals(expectedMessage, ex.getMessage());
        }
    }

    @Test
    public void testCaseOccuper() {
        try {
            Plateau plateau = new Plateau();
            Joueur joueur = new Joueur("Test", 'x');
            plateau.setCase(joueur, 1);
            plateau.setCase(joueur, 1);

        }
        catch (illegalArgument ex) {
            String expectedMessage = "La case est déjà occupée";
            assertEquals(expectedMessage, ex.getMessage());
        }

    }

    @Test
    public void testToString() {
        Plateau plateau = new Plateau();
        Joueur j1 = new  Joueur("Maxime", 'x');
        Joueur j2 = new  Joueur("Touria", 'o');

        assertEquals(plateau.toString(),
                "1 2 3" + System.lineSeparator()
                        + "4 5 6" + System.lineSeparator()
                        + "7 8 9");

        try {
            plateau.setCase(j1, 1);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }
        try {
            plateau.setCase(j2, 2);
        } catch (illegalArgument e) {
            e.printStackTrace();
        }

        assertEquals(plateau.toString(),
                "x o 3" + System.lineSeparator()
                        + "4 5 6" + System.lineSeparator()
                        + "7 8 9");
    }
    @Test
    public void testgetCaseInvalide() {
        try {
            Plateau plateau = new Plateau();
            plateau.getCase(10);

        }
        catch (illegalArgument ex) {
            String expectedMessage = "Case choisie en dehors du plateau";
            assertEquals(expectedMessage, ex.getMessage());
        }
    }


}
