package net.esquizo.children_of_silence_mod.abilities;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;

public class Ability {

    public enum ABILITY_TYPE{
        ITEM,
        ARMOR
    }

    protected final ABILITY_TYPE abilityType;
    protected final int id;
    protected final int cooldown;
    protected final float damage;
    protected final List<Item> linkedItems;



    public Ability(ABILITY_TYPE abilityType, int id, int cooldown, float damage, List<Item> linkedItems){
        this.abilityType = abilityType;
        this.id = id;
        this.cooldown = cooldown;
        this.damage = damage;
        this.linkedItems = linkedItems;

    }

    public Ability(){
        this.abilityType = ABILITY_TYPE.ITEM;
        this.linkedItems = Arrays.asList();
        this.id = 0;
        this.cooldown = 0;
        this.damage = 0;
    }

    public int getId(){
        return this.id;
    }

    public int getCooldown(){
        return this.cooldown;
    }

    public float getDamage(){
        return this.damage;
    }

    public void use(Player player){

    }

}
