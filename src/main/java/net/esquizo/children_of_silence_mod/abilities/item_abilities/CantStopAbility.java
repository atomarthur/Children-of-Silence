package net.esquizo.children_of_silence_mod.abilities.item_abilities;

import net.esquizo.children_of_silence_mod.Init.ItemInit;
import net.esquizo.children_of_silence_mod.abilities.Ability;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

import java.util.Arrays;
import java.util.List;

public class CantStopAbility extends Ability {

    public CantStopAbility(){
        super(ABILITY_TYPE.ITEM, 1, 8*20, 15, List.of(ItemInit.ELVEN_KATANA.get().asItem()));
    }

    @Override
    public void use(Player player){
        if (!player.level().isClientSide){
            float yaw = player.getYRot();
            double radians = Math.toRadians(yaw);
            double x = -Math.sin(radians);
            double z = Math.cos(radians);
            Vec3 angle = new Vec3(x, 0, z).normalize();
            Vec3 force = angle.scale(5);

            player.setDeltaMovement(force);
        }
    }

}
