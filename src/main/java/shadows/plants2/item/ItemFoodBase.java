package shadows.plants2.item;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import shadows.placebo.client.IHasModel;
import shadows.plants2.Plants2;
import shadows.plants2.data.PlantConstants;

public class ItemFoodBase extends ItemFood implements IHasModel {

    protected final int heal;

    public ItemFoodBase(String name, int amount, float saturationMultiplier) {
        super(amount, saturationMultiplier, false);
        setTranslationKey(Plants2.MODID + "." + name);
        heal = Plants2.CONFIG.getInt("Food Value - " + name, "Food", amount, 1, 20, "The amount of hunger a " + name + " will restore.");
        setRegistryName(name);
        setCreativeTab(PlantConstants.TAB);
        Plants2.INFO.getItemList().add(this);
    }

    public ItemFoodBase(String name, int amount, float saturationMultiplier, PotionEffect potion, float potionChance) {
        this(name, amount, saturationMultiplier);
        setPotionEffect(potion, potionChance);
    }

    @Override
    public int getHealAmount(ItemStack stack) {
        return heal;
    }
}
