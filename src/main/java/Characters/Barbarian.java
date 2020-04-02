package Characters;

import Player.Player;
import Weapons.IWeapon;

import java.util.ArrayList;

public class Barbarian extends Warrior {


    private IWeapon activeWeapon;

    public Barbarian(String name, int healthPoints, ArrayList<IWeapon> inventory, IWeapon activeWeapon){
        super(name, healthPoints, inventory);
        this.activeWeapon = activeWeapon;
    }

    public void pickUp(IWeapon weapon){
        this.inventory.add(weapon);
    }

    public int countInventory() {
        return this.inventory.size();
    }

    public void reduceHealth(int attackValue){
        int newHealth = this.getHealthPoints() - attackValue;
        this.setHealthPoints(newHealth);
    }

}
