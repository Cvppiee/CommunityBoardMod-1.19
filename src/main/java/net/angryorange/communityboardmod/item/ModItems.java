package net.angryorange.communityboardmod.item;

import net.angryorange.communityboardmod.CommunityBoardMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CommunityBoardMod.MOD_ID);

//how to add item
    //public static final RegistryObject<Item> (NAMEOFITEM) = ITEMS.register( bus: "name",
            //() -> new Item(new Item.Properties().(choose));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}