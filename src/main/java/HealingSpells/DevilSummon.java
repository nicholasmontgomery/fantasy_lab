package HealingSpells;

import Characters.Warrior;
import Player.Player;

public class DevilSummon implements IHeal {

    private int healingPower;

    public DevilSummon(){
        this.healingPower = 50;
    }


    public void heal(Player character) {
        character.setHealthPoints(character.getHealthPoints() + this.healingPower);
    }
}
