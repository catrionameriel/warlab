package Players;

public class Player {

    private ICharacter characterType;

    public Player( ICharacter characterType) {
        this.characterType = characterType;
    }


    public ICharacter getCharacterType() {
        return characterType;
    }

    public void setCharacterType(ICharacter characterType) {
        this.characterType = characterType;
    }
}
