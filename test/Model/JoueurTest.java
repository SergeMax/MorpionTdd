package Model;

import org.junit.jupiter.api.Test;
import sample.Model.Joueur;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class JoueurTest {

    @Test
    public void setName(){
        Joueur joueur = new Joueur("Maxime",'x');
        joueur.setName("Touria");
        assertEquals("Touria", joueur.getNom());

    }
    @Test
    public void getName() {
        Joueur  joueur  = new  Joueur ("Maxime", 'x');
        assertEquals("Maxime", joueur.getNom());
    }
    @Test
    public void setSymbol() {
        Joueur joueur = new Joueur ("Maxime", 'x');
        joueur.setSymbol('o');
        assertEquals('o', joueur.getSymbol());
    }
    @Test
    public void getSymbol() {
        Joueur joueur  = new Joueur("Maxime", 'x');
        assertEquals('x', joueur.getSymbol());
    }

}