package Players.Fighter;

public enum WeaponType {

    TREBUCHET("Trebuchet", 50),
    SWORD("Sword", 15),
    MUSKET("Musket", 20);


    private String type;
    private int attackPower;

    WeaponType(String type, int attackPower){
        this.type = type;
        this.attackPower = attackPower;
    }

    public String getType(){
        return type;
    }

    public int getAttackPower(){
            return attackPower;
    }



}
