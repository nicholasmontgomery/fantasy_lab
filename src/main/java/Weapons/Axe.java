package Weapons;

public class Axe implements IWeapon {

    private int swingDamage;
    private int thrustDamage;
    private int strikeDamage;


    public Axe(){
        this.swingDamage = 50;
        this.thrustDamage = 20;
        this.strikeDamage = 62;
    }


    public int strike() {
        return this.strikeDamage;
    }

    public int thrust(){
        return this.thrustDamage;
    }

    public int swing() {
        return this.swingDamage;
    }

}
