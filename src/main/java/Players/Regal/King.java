package Players.Regal;

import Players.ICharacter;

import java.util.ArrayList;
import java.util.Random;

public class King extends Regal implements ICharacter{

    private int reinforcements;

    public King( ArrayList<CommandType> commandTypes, int reinforcements) {
        super(commandTypes,40, new DogProtector());
        this.reinforcements = reinforcements;
    }

    public int getReinforcements() {
        return reinforcements;
    }

    public void setReinforcements(int reinforcements) {
        this.reinforcements = reinforcements;
    }

    public int attack(){
        CommandType commandType = getRandomCommandType();
        return commandType.getAttackPower();
    }
}
