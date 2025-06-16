package net.esquizo.children_of_silence_mod.items.draken;

import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CowboyCoatRender extends GeoArmorRenderer<CowboyCoatItem> {
    public CowboyCoatRender() {
        super(new CowboyCoatModel());
    }
}
