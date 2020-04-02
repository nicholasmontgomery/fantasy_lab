package Weapons;

public class Sword implements IWeapon {

    private int swingDamage;
    private int thrustDamage;
    private int strikeDamage;


    public Sword() {
        this.swingDamage = 43;
        this.thrustDamage = 75;
        this.strikeDamage = 31;
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