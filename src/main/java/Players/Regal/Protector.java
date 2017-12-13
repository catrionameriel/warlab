package Players.Regal;

public abstract class Protector {

    private int resistance;

    public Protector(int resistance){
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }
}
