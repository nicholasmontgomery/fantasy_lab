package Characters;

import Weapons.IWeapon;
import Player.Player;
import Player.AllegianceType;

import java.util.ArrayList;

public abstract class Warrior extends Player {

    protected ArrayList<IWeapon> inventory;

    public Warrior(String name, int healthPoints, AllegianceType allegiance, ArrayList<IWeapon> inventory){
        super(name, healthPoints, allegiance);
        this.inventory = inventory;

    }

    public ArrayList<IWeapon> getInventory() {
        return inventory;
    }

}
