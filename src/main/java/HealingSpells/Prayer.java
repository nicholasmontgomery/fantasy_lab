package HealingSpells;

import Characters.Warrior;
import Player.Player;

public class Prayer implements IHeal {

    private int healingPower;

    public Prayer(){
        this.healingPower = 20;
    }

    public void heal(Player character) {
        character.setHealthPoints(character.getHealthPoints() + this.healingPower);
    }
}
