package shadows.plants2.util;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import shadows.placebo.block.IEnumBlock;
import shadows.plants2.Plants2;

import java.util.ArrayList;

public class ControlledList extends ArrayList<IBlockState> {

    private static final long serialVersionUID = 1L;

    @Override
    public boolean add(IBlockState state) {
        if (Plants2.BLOCK_CONFIG.getBoolean("Allow " + translate(state), Configuration.CATEGORY_GENERAL, true, "If this blockstate will generate"))
            return super.add(state);
        return false;
    }

    @Override
    public void add(int index, IBlockState state) {
        if (Plants2.BLOCK_CONFIG.getBoolean("Allow " + translate(state), Configuration.CATEGORY_GENERAL, true, "If this blockstate will generate"))
            super.add(index, state);
    }

    private String translate(IBlockState state) {
        Item i = Item.getItemFromBlock(state.getBlock());
        String translate = PlantUtil.sneakyConfigTranslate(state.getBlock().getPickBlock(state, null, null, null, null).getTranslationKey() + ".name");
        if (i == Items.AIR || "invalid.name".equals(translate))
            return state.getBlock().getRegistryName() + "[type=" + ((IEnumBlock<?>) state.getBlock()).getValue(state).getName() + "]";
        return translate;
    }

}
