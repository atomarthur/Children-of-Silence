package net.skizo.cosmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skizo.cosmod.COSMOD;
import net.skizo.cosmod.items.hayate.tools.Kusanagi;
import net.skizo.cosmod.items.misc.SpellItem;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, COSMOD.MODID);

    public static final RegistryObject<Item> KUSANAGI = ITEMS.register("kusanagi",
            () -> new Kusanagi(Tiers.DIAMOND, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> aaa = ITEMS.register("aaa",
            () -> new SpellItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}