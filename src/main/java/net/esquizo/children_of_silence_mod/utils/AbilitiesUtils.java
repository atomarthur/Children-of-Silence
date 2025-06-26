package net.esquizo.children_of_silence_mod.utils;

import net.esquizo.children_of_silence_mod.Init.ItemInit;
import net.esquizo.children_of_silence_mod.abilities.Ability;
import net.esquizo.children_of_silence_mod.abilities.item_abilities.CantStopAbility;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class AbilitiesUtils {

    private static Map<Item, Ability> ITEM_ABILITIES = new HashMap<>();
    static {
        ITEM_ABILITIES.put(ItemInit.ELVEN_KATANA.get().asItem(), new CantStopAbility());
    }
    public static boolean hasItemAbility(Item item){
        return ITEM_ABILITIES.containsKey(item);
    }


}
