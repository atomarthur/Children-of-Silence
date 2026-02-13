package net.skizo.cosmod.spells;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class Spell {
    private final int ID;
    private final int MANA_USAGE;
    private final ResourceLocation TEXTURE;

    public Spell(int id, int manaUsage, ResourceLocation texture) {
        ID = id;
        MANA_USAGE = manaUsage;
        TEXTURE = texture;
    }

    public void useSpell(LivingEntity entity){

    }

    public int getId(){
        return this.ID;
    }

    public int getManaUsage(){
        return this.MANA_USAGE;
    }

    public ResourceLocation getTexture(){
        return this.TEXTURE;
    }
}