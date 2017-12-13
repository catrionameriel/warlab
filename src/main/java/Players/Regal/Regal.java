package Players.Regal;

import java.util.ArrayList;
import java.util.Random;

public abstract class Regal {

    protected ArrayList<CommandType> commandTypes;
    private int healthPoints;
    private Protector protector;

    public Regal(ArrayList<CommandType> commandTypes, int healthPoints, Protector protector){
        this.commandTypes = commandTypes;
        this.healthPoints = healthPoints;
        this.protector = protector;
    }

    public ArrayList<CommandType> getCommandType() {
        return commandTypes;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Protector getProtector() {
        return protector;
    }

    public int getProtectorResistance() {
        return protector.getResistance();
    }

    public int getRandomNumber(){
        Random commandIndex = new Random();
        int number = commandIndex.nextInt(4);
        return number;
    }
    public CommandType getRandomCommandType() {
        int number = this.getRandomNumber();
        return this.commandTypes.get(number);
    }
}
