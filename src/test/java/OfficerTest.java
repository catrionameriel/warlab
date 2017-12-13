import Players.Fighter.Commander;
import Players.Fighter.Officer;
import Players.Fighter.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OfficerTest {

    Officer officer;

    @Before
    public void before() {
        officer = new Officer(25);
    }

    @Test
    public void canGetArmour() {
        assertEquals(25, officer.getArmour());
    }

    @Test
    public void canSetArmour() {
        officer.setArmour(15);
        assertEquals(15, officer.getArmour());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(50, officer.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        officer.setHealthPoints(30);
        assertEquals(30, officer.getHealthPoints());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.MUSKET, officer.getWeapon());
    }

    @Test
    public void canGetAttackPower() {
        assertEquals(20, officer.attack());
    }

}