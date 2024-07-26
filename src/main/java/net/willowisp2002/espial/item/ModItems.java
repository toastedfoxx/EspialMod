package net.willowisp2002.espial.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.willowisp2002.espial.Espial;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, Espial.MOD_ID);
//each instance here adds a new item, so you can just copy paste the two lines
    public static final RegistryObject<Item> PURPORIAL = ITEMS.register("purporial",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPORIAL_ROUGH = ITEMS.register("rough_purporial",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
