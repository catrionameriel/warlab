package Players;

import java.util.ArrayList;

public class Doctor implements ICharacter{

    private int healthPoints;
    private ArrayList<String> medicalKit;
    private int punchForce;

    public Doctor() {
        this.healthPoints = 20;
        this.medicalKit = new ArrayList<>();
        this.punchForce = 5;

    }

    @Override
    public int attack() {
        return this.punchForce;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int newHealth) {
        this.healthPoints = newHealth;
    }

    public int getNumInMedicalKit() {
        return this.medicalKit.size();
    }

    public void addToMedicalKit(String item) {
        this.medicalKit.add(item);
    }

    public void useItem(String item) {
        this.medicalKit.remove(item);
    }
}
