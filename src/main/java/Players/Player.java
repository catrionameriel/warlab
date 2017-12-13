package Players;

public class Player {

    private int healthPoints;
    private ICharacter characterType;

    public Player(int healthPoints, ICharacter characterType) {
        this.healthPoints = healthPoints;
        this.characterType = characterType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ICharacter getCharacterType() {
        return characterType;
    }

    public void setCharacterType(ICharacter characterType) {
        this.characterType = characterType;
    }
}
