package Characters;

import Weapons.IWeapon;

import java.util.ArrayList;

public class Knight extends Warrior {

    private IWeapon activeWeapon;

    public Knight(String name, int healthPoints, ArrayList inventory, IWeapon activeWeapon){
        super(name, healthPoints, inventory);
        this.activeWeapon = activeWeapon;
    }

}
