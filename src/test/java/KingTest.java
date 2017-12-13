import Players.Regal.CommandType;
import Players.Regal.DogProtector;
import Players.Regal.King;
import Players.Regal.Protector;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.debugger.win32.coff.COMDATSelectionTypes;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class KingTest {

    King king;

    @Before
    public void before(){
        ArrayList<CommandType> ct = new ArrayList<CommandType>();
        ct.add(CommandType.ARROW);
        ct.add(CommandType.CANNON);
        ct.add(CommandType.FIREBALL);
        ct.add(CommandType.EVERYONE);
        king = new King(ct,30);
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
    }

    @Test
    public void canGetRandomCommand(){
        assertNotNull(king.getRandomCommandType());
//        assertEquals(CommandType.ARROW, king.getRandomCommandType());
    }

    @Test
    public void canGetRandomCommandAttack(){
        assertNotNull(king.attack());
//        assertEquals(10, king.attack());
    }


}
