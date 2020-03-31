import org.junit.jupiter.api.Test;
import sample.Model.Joueur;
import sample.Model.Plateau;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void joueurPosePion(){
        Joueur joueur = new Joueur();
        Plateau plateau = new Plateau();


        System.out.println(plateau.getPlateau().get(0));

     //   assertEquals(11, joueur.posePion(joueur.pion, plateau. ));
    }

}
