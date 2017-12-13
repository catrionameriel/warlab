package Players.Regal;

import Players.ICharacter;

import java.util.ArrayList;



public class Queen extends Regal implements ICharacter {

    private int heal;

    public Queen(ArrayList<CommandType> commandTypes, int heal) {
        super(commandTypes, 35, new HorseProtector());
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int attack(){
        CommandType commandType = getRandomCommandType();
        return commandType.getAttackPower();
    }
}
