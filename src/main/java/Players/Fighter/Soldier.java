package Players.Fighter;

import Players.ICharacter;

public class Soldier extends Fighter implements ICharacter {

    private int speed;

    public Soldier(int speed) {
        super(WeaponType.SWORD, 30);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
