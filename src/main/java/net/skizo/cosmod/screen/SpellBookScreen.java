package net.skizo.cosmod.screen;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.skizo.cosmod.COSMOD;

public class SpellBookScreen extends AbstractContainerScreen<SpellBookMenu> {
    public SpellBookScreen(SpellBookMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);

        this.imageWidth = 256;
        this.imageHeight = 250;
    }

    private ResourceLocation getScreenTexture() {
        return new ResourceLocation(COSMOD.MODID, "textures/gui/spell_book.png");
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;

        guiGraphics.blit(getScreenTexture(), x, y, 0, 0, this.imageWidth, this.imageHeight, 512, 512);
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, this.title, 8, 6, 0x404040, false);
        guiGraphics.drawString(this.font, this.playerInventoryTitle, 8, this.imageHeight - 96 + 2, 0x404040, false);
    }
}
