package Players.Fighter;

import Players.ICharacter;

public class Commander extends Fighter implements ICharacter {
   
    private boolean battleHorn;
    
    public Commander(boolean battleHorn) {
        super(WeaponType.TREBUCHET, 100);
        this.battleHorn = battleHorn;
    }

    @Override
    public int attack() {
        return 0;
    }

    public boolean getBattleHorn() {
        return battleHorn;
    }
}
