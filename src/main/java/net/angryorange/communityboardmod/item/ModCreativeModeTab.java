package net.angryorange.communityboardmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CB_TAB = new CreativeModeTab("cbtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.);
        }
    };
}
//pause for now