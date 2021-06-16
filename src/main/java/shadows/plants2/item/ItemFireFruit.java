package shadows.plants2.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import shadows.placebo.interfaces.IHasRecipe;
import shadows.placebo.util.PlaceboUtil;
import shadows.plants2.Plants2;

public class ItemFireFruit extends ItemFoodBase implements IHasRecipe {

    public ItemFireFruit() {
        super("fire_fruit", 5, 0.8F);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public void initRecipes(Register<IRecipe> e) {
        Plants2.HELPER.addShapeless(new ItemStack(this, 1, 1), Items.SNOWBALL, this);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (stack.getMetadata() == 0) player.setFire(6);
        super.onFoodEaten(stack, world, player);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void initModels(ModelRegistryEvent e) {
        PlaceboUtil.sMRL("items", this, 0, "item=" + getRegistryName().getPath());
        PlaceboUtil.sMRL("items", this, 1, "item=" + getRegistryName().getPath() + "_cold");
    }

    @Override
    public String getTranslationKey(ItemStack stack) {
        return super.getTranslationKey() + (stack.getMetadata() == 1 ? "_cold" : "");
    }

}
