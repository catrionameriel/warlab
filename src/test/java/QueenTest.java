import Players.Regal.*;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.debugger.win32.coff.COMDATSelectionTypes;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QueenTest {

    Queen queen;

    @Before
    public void before() {
        ArrayList<CommandType> ct = new ArrayList<CommandType>();
        ct.add(CommandType.ARROW);
        ct.add(CommandType.CANNON);
        ct.add(CommandType.FIREBALL);
        ct.add(CommandType.EVERYONE);
        queen = new Queen(ct, 10);
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(35, queen.getHealthPoints());
    }

    @Test
    public void canSetHealth() {
        queen.setHealthPoints(30);
        assertEquals(30, queen.getHealthPoints());
    }

    @Test
    public void canGetHeal() {
        assertEquals(10, queen.getHeal());
    }

    @Test
    public void canSetReinforcements() {
        queen.setHeal(20);
        assertEquals(20, queen.getHeal());
    }

    @Test
    public void canGetHorseAttackValue() {
        assertEquals(20, queen.getProtectorResistance());
    }

    @Test
    public void canGetRandomNumber() {
        assertNotNull(queen.getRandomNumber());
    }

    @Test
    public void canGetRandomCommand() {
        assertNotNull(queen.getRandomCommandType());
//        assertEquals(CommandType.ARROW, king.getRandomCommandType());
    }

    @Test
    public void canGetRandomCommandAttack() {
        assertNotNull(queen.attack());
//        assertEquals(10, king.attack());
    }
}