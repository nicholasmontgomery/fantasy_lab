package Characters;

import HealingSpells.IHeal;
import Player.Player;

import java.util.ArrayList;

public class Cleric extends Player {

    private ArrayList<IHeal> inventory;
    private IHeal healingPower;


    public Cleric(String name, int healthPoints, ArrayList<IHeal> inventory, IHeal healingPower ) {
        super(name, healthPoints);
        this.healingPower= healingPower;
    }


}
