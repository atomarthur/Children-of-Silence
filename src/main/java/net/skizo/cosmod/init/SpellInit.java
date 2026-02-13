package net.skizo.cosmod.init;

import net.skizo.cosmod.spells.Fireball;
import net.skizo.cosmod.spells.Spell;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SpellInit {
    private static final Map<Integer, Supplier<Spell>> SPELLS = new HashMap<>();

    public static void register(Supplier<Spell> spellSupplier){
        int id = spellSupplier.get().getId();
        if(!SPELLS.containsKey(id)){
            SPELLS.put(id, spellSupplier);
        }
    }

    public static Spell getSpell(int id){
        Supplier<Spell> supplier = SPELLS.get(id);
        return supplier != null ? supplier.get() : null;
    }

    public static void init(){
        register(Fireball::new);
    }
}
