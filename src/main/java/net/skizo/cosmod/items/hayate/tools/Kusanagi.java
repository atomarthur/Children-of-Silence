package net.skizo.cosmod.items.hayate.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.skizo.cosmod.screen.SpellBookMenu;
import yesman.epicfight.world.item.WeaponItem;

public class Kusanagi extends WeaponItem {
    public Kusanagi(Tier tier, int damageIn, float speedIn, Properties builder) {
        super(tier, damageIn, speedIn, builder);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!world.isClientSide) {
            NetworkHooks.openScreen(
                    (ServerPlayer) player,
                    new SimpleMenuProvider(
                            (windowId, inv, p) -> new SpellBookMenu(windowId, inv),
                            Component.literal(stack.getDisplayName().getString()).withStyle(ChatFormatting.WHITE)
                    ),
                    buffer -> {
                        buffer.writeItem(stack);
                    }
            );
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), world.isClientSide());
    }
}