import Players.Fighter.Officer;
import Players.Fighter.Soldier;
import Players.Fighter.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoldierTest {

    Soldier soldier;

    @Before
    public void before() {
        soldier = new Soldier(10);
    }

    @Test
    public void canGetSpeed() {
        assertEquals(10, soldier.getSpeed());
    }

    @Test
    public void canSetSpeed() {
        soldier.setSpeed(15);
        assertEquals(15, soldier.getSpeed());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(30, soldier.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        soldier.setHealthPoints(35);
        assertEquals(35, soldier.getHealthPoints());
    }

    @Test
    public void canGetWeaponType() {
        assertEquals(WeaponType.SWORD, soldier.getWeapon());
    }

    @Test
    public void canGetAttackPower() {
        assertEquals(15, soldier.attack());
    }

}