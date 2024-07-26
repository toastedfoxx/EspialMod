package net.willowisp2002.espial.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.willowisp2002.espial.Espial;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Espial.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//mainly for items that use 2d textures and aren't placeable, you can put blocks/block entities here if you want though

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
            new ResourceLocation("item/generated")).texture("Layer0",
                new ResourceLocation(Espial.MOD_ID, "item/" + item.getId().getPath()));
    }
}
