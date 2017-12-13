package Battlefield;

public abstract class Battlefields {

    private String name;
    private String condition;
    private int territoryPoints;

    public Battlefields(String name, String condition, int territoryPoints) {
        this.name = name;
        this.condition = condition;
        this.territoryPoints = territoryPoints;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public int getTerritoryPoints() {
        return territoryPoints;
    }
}
