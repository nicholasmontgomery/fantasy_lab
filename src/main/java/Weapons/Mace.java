package Weapons;

public class Mace implements IWeapon {

    private int swingDamage;
    private int thrustDamage;
    private int strikeDamage;


    public Mace() {
        this.swingDamage = 70;
        this.thrustDamage = 25;
        this.strikeDamage = 55;
    }

    public int strike() {
        return strikeDamage;
    }

    public int thrust() {
        return thrustDamage;
    }

    public int swing() {
        return swingDamage;
    }
}
