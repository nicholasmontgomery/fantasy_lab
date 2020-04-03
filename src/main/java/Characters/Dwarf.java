package Characters;

import Weapons.IWeapon;
import Player.AllegianceType;

import java.util.ArrayList;

public class Dwarf extends Warrior {

    private IWeapon activeWeapon;

    public Dwarf(String name, int healthPoints, AllegianceType allegiance, ArrayList inventory, IWeapon activeWeapon){
        super(name, healthPoints, allegiance, inventory);
        this.activeWeapon = activeWeapon;
    }
}
