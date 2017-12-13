package Players.Regal;

public enum CommandType {

    EVERYONE("Everyone", 50),
    ARROW("Arrow", 10),
    CANNON("Cannon", 20),
    FIREBALL("Fireball", 25);

    private String type;
    private int attackPower;

    CommandType(String type, int attackPower){
        this.type = type;
        this.attackPower = attackPower;
    }

    public String getType() {
        return type;
    }

    public int getAttackPower() {
        return attackPower;
    }
}
