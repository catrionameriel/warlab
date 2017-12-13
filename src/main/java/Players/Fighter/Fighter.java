package Players.Fighter;

import Players.ICharacter;

public abstract class Fighter implements ICharacter {

    private WeaponType weapon;
    private int healthPoints;

    public Fighter(WeaponType weapon, int healthPoints) {
        this.weapon = weapon;
        this.healthPoints = healthPoints;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int attack() {
        return this.weapon.getAttackPower();
    }
}
