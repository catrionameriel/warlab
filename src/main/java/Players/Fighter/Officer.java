package Players.Fighter;

import Players.ICharacter;

public class Officer extends Fighter implements ICharacter {

    private int armour;

    public Officer(int armour) {
        super(WeaponType.MUSKET, 50);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
