import Players.Regal.DogProtector;
import Players.Regal.King;
import Players.Regal.Protector;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KingTest {

    King king;

    @Before
    public void before(){
        king = new King(new ArrayList<>(),30);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(40, king.getHealthPoints());
    }

    @Test
    public void canSetHealth(){
        king.setHealthPoints(30);
        assertEquals(30, king.getHealthPoints());
    }

    @Test
    public void canGetReinforcements(){
        assertEquals(30, king.getReinforcements());
    }

    @Test
    public void canSetReinforcements(){
        king.setReinforcements(20);
        assertEquals(20, king.getReinforcements());
    }

    @Test
    public void canGetDogAttackValue(){
        assertEquals(15, king.getProtectorResistance());
    }

    @Test
    public void canGetRandomNumber(){
        assertNotNull(king.getRandomNumber());
        assertEquals(2, king.getRandomNumber());
    }


}
