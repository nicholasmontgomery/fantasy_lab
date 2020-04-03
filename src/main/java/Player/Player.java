package Player;

public abstract class Player {

    private String name;
    private int healthPoints;
    private AllegianceType allegiance;

    public Player(String name, int healthPoints, AllegianceType allegiance){
        this.name = name;
        this.healthPoints = healthPoints;
        this.allegiance = allegiance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public AllegianceType getAllegiance(){
        return this.allegiance;
    }

    public void setAllegiance(AllegianceType newAllegiance){
        this.allegiance = newAllegiance;
    }
}
