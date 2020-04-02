package Characters;

import Weapons.IWeapon;
import Player.Player;

import java.util.ArrayList;

public abstract class Warrior extends Player {

    protected ArrayList<IWeapon> inventory;

    public Warrior(String name, int healthPoints, ArrayList<IWeapon> inventory){
        super(name, healthPoints);
        this.inventory = inventory;

    }

    public ArrayList<IWeapon> getInventory() {
        return inventory;
    }

}
