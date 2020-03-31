import org.junit.jupiter.api.Test;
import sample.Model.Joueur;

import static org.junit.jupiter.api.Assertions.*;

public class JoueurTest {

    @Test
    public void joueurPosePion(){
        Joueur joueur = new Joueur();


        assertEquals(11, joueur.posePion(joueur.pion, ));
    }

}
