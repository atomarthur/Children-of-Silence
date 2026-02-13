package net.skizo.cosmod.spells;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.skizo.cosmod.COSMOD;

public class Fireball extends Spell{
    public Fireball() {
        super(1, 10, new ResourceLocation(COSMOD.MODID, ""));
    }

    @Override
    public void useSpell(LivingEntity entity){

    }
}
