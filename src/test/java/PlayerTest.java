import Players.Doctor;
import Players.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Doctor doctor;

    @Before
    public void before(){
        player = new Player(doctor);
    }

    @Test
    public void canGetType(){
        assertEquals(doctor, player.getCharacterType());
    }


}
