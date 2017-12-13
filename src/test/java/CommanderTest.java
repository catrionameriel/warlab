import Players.Fighter.Commander;
import Players.Fighter.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommanderTest {

    Commander commander;

    @Before
    public void before(){
        commander = new Commander(true);
    }

    @Test
    public void canGetBattlehorn(){
        assertEquals(true, commander.getBattleHorn());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, commander.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        commander.setHealthPoints(80);
        assertEquals(80, commander.getHealthPoints());
    }

    @Test
    public void canGetWeaponType(){
        assertEquals(WeaponType.TREBUCHET, commander.getWeapon());
    }

    
}
