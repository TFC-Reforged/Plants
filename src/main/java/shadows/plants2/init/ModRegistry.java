package shadows.plants2.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import shadows.placebo.interfaces.IHasRecipe;
import shadows.placebo.item.ItemBigEnum;
import shadows.plants2.Plants2;
import shadows.plants2.block.*;
import shadows.plants2.data.PlantConfig;
import shadows.plants2.data.enums.TheBigBookOfEnums.Double;
import shadows.plants2.data.enums.TheBigBookOfEnums.*;
import shadows.plants2.item.ItemPlantball;
//import shadows.plants2.potion.PotionTypeBase;
import shadows.plants2.tile.TileBrewingCauldron;
import shadows.plants2.tile.TileFlowerpot;

public class ModRegistry {

    public static final BlockEnumBush<Plants> PLANT_0 = new BlockEnumFlower<>("cosmetic_0", EnumPlantType.Plains, Plants.class, 0);
    public static final BlockEnumBush<Plants> PLANT_1 = new BlockEnumFlower<>("cosmetic_1", EnumPlantType.Plains, Plants.class, 1);
    public static final BlockEnumBush<Plants> PLANT_2 = new BlockEnumFlower<>("cosmetic_2", EnumPlantType.Plains, Plants.class, 2);
    public static final BlockEnumBush<Plants> PLANT_3 = new BlockEnumFlower<>("cosmetic_3", EnumPlantType.Plains, Plants.class, 3);
    public static final BlockEnumBush<Plants> PLANT_4 = new BlockEnumFlower<>("cosmetic_4", EnumPlantType.Plains, Plants.class, 4);
    public static final BlockEnumBush<Plants> PLANT_5 = new BlockEnumFlower<>("cosmetic_5", EnumPlantType.Plains, Plants.class, 5);
    public static final BlockEnumBush<Plants> PLANT_6 = new BlockEnumFlower<>("cosmetic_6", EnumPlantType.Plains, Plants.class, 6);
    public static final BlockEnumBush<Plants> PLANT_7 = new BlockEnumFlower<>("cosmetic_7", EnumPlantType.Plains, Plants.class, 7);
    public static final BlockEnumBush<Plants> PLANT_8 = new BlockEnumFlower<>("cosmetic_8", EnumPlantType.Plains, Plants.class, 8);
    public static final BlockEnumBush<Plants> PLANT_9 = new BlockEnumFlower<>("cosmetic_9", EnumPlantType.Plains, Plants.class, 9);
    public static final BlockEnumBush<Plants> PLANT_10 = new BlockEnumFlower<>("cosmetic_10", EnumPlantType.Plains, Plants.class, 10);
    public static final BlockEnumBush<Plants> PLANT_11 = new BlockEnumFlower<>("cosmetic_11", EnumPlantType.Plains, Plants.class, 11);
    //public static final BlockEnumBush<Plants> PLANT_12 = new BlockEnumFlower<>("cosmetic_12", EnumPlantType.Plains, Plants.class, 12);
    //public static final BlockEnumBush<Plants> PLANT_13 = new BlockEnumFlower<>("cosmetic_13", EnumPlantType.Plains, Plants.class, 13);
    //public static final BlockEnumBush<Plants> PLANT_14 = new BlockEnumFlower<>("cosmetic_14", EnumPlantType.Plains, Plants.class, 14);
    //public static final BlockEnumBush<Plants> PLANT_15 = new BlockEnumFlower<>("cosmetic_15", EnumPlantType.Plains, Plants.class, 15);
    //public static final BlockEnumBush<Plants> PLANT_16 = new BlockEnumFlower<>("cosmetic_16", EnumPlantType.Plains, Plants.class, 16);

    public static final BlockEnumBush<Desert> DESERT_0 = new BlockEnumFlower<>("desert_0", EnumPlantType.Desert, Desert.class, 0);
    public static final BlockEnumBush<Desert> DESERT_1 = new BlockEnumFlower<>("desert_1", EnumPlantType.Desert, Desert.class, 1);
    public static final BlockEnumBush<Desert> DESERT_2 = new BlockEnumFlower<>("desert_2", EnumPlantType.Desert, Desert.class, 2);
    //public static final BlockEnumBush<Desert> DESERT_3 = new BlockEnumFlower<>("desert_3", EnumPlantType.Desert, Desert.class, 3);

    //By AIBaster
    public static final BlockEnumBush<Double> DOUBLE_0 = new BlockEnumDoubleFlower<>("double_0", EnumPlantType.Plains, Double.class, 0);
    public static final BlockEnumBush<Double> DOUBLE_1 = new BlockEnumDoubleFlower<>("double_1", EnumPlantType.Plains, Double.class, 1);
    public static final BlockEnumBush<Double> DOUBLE_2 = new BlockEnumDoubleFlower<>("double_2", EnumPlantType.Plains, Double.class, 2);
    public static final BlockEnumBush<Double> DOUBLE_3 = new BlockEnumDoubleFlower<>("double_3", EnumPlantType.Plains, Double.class, 3);
    public static final BlockEnumBush<Double> DOUBLE_4 = new BlockEnumDoubleFlower<>("double_4", EnumPlantType.Plains, Double.class, 4);
    public static final BlockEnumBush<Double> DOUBLE_5 = new BlockEnumDoubleFlower<>("double_5", EnumPlantType.Plains, Double.class, 5);

    //public static final ItemBigEnum<Generic> GENERIC = new ItemBigEnum<>("generic", Generic.values(), Plants2.INFO);
    public static final Item PLANTBALL = new ItemPlantball();

    public static final Block ADLUMIA_F = new BlockCustomVine("adlumia_f", Vines.ADLUMIA_F);
    public static final Block AFGEKIA_M = new BlockCustomVine("afgekia_m", Vines.AFGEKIA_M);
    public static final Block ANDROSACE_A = new BlockCustomVine("androsace_a", Vines.ANDROSACE_A);

    //public static final BlockFlowerpot FLOWERPOT = new BlockFlowerpot();
    //public static final BlockJar JAR = new BlockJar();

    //public static final BlockCataplant CATAPLANT = new BlockCataplant();

    /*public static final PotionType WITHER = new PotionTypeBase("wither", new PotionEffect(MobEffects.WITHER, 3600));
    public static final PotionType REGEN_HEAL = new PotionTypeBase("regen_heal", new PotionEffect(MobEffects.REGENERATION, 1600), new PotionEffect(MobEffects.INSTANT_HEALTH));
    public static final PotionType CAULDRON_BREW = new PotionTypeBase("cauldron_brew");
    public static final PotionType LEV = new PotionTypeBase("levitation", new PotionEffect(MobEffects.LEVITATION, 400));*/

    //public static final Block BREWING_CAULDRON = new BlockBrewingCauldron();

    @SubscribeEvent
    public void onBlockRegister(Register<Block> e) {
        Plants2.INFO.getBlockList().register(e.getRegistry());
    }

    @SubscribeEvent
    public void onItemRegister(Register<Item> e) {
        Plants2.INFO.getItemList().register(e.getRegistry());
    }

    @SubscribeEvent
    public void onRecipeRegister(Register<IRecipe> e) {
        Plants2.INFO.getRecipeList().register(e.getRegistry());
    }

    @SubscribeEvent
    public void onPotionRegister(Register<PotionType> e) {
        Plants2.INFO.getPotionTypeList().register(e.getRegistry());
    }

    public static void oreDict(FMLInitializationEvent e) {
        /*OreDictionary.registerOre("dyeBlue", Generic.DYE_BLUE.get());
        OreDictionary.registerOre("dye", Generic.DYE_BLUE.get());
        OreDictionary.registerOre("dyeBlack", Generic.DYE_BLACK.get());
        OreDictionary.registerOre("dye", Generic.DYE_BLACK.get());
        OreDictionary.registerOre("dyeBrown", Generic.DYE_BROWN.get());
        OreDictionary.registerOre("dye", Generic.DYE_BROWN.get());
        OreDictionary.registerOre("dyeWhite", Generic.DYE_WHITE.get());
        OreDictionary.registerOre("dye", Generic.DYE_WHITE.get());*/

        for (Block block : ForgeRegistries.BLOCKS) {
            if (block instanceof BlockBush && Item.getItemFromBlock(block) != Items.AIR) {
                OreDictionary.registerOre("plant", new ItemStack(block, 1, OreDictionary.WILDCARD_VALUE));
            }
        }
    }


    public static void recipes(Register<IRecipe> e) {
        for (Block block : Plants2.INFO.getBlockList()) {
            if (block instanceof IHasRecipe) ((IHasRecipe) block).initRecipes(e);
        }
        for (Item item : Plants2.INFO.getItemList()) {
            if (item instanceof IHasRecipe) ((IHasRecipe) item).initRecipes(e);
        }
        //Plants2.HELPER.addSimpleShapeless(new ItemStack(Items.STRING, 2), Generic.COTTON.get(), 5);
    }

    public static void generators(FMLPostInitializationEvent e) {
        if (!PlantConfig.gen) return;
    }

    public static void tiles(FMLPreInitializationEvent e) {
        GameRegistry.registerTileEntity(TileFlowerpot.class, new ResourceLocation(Plants2.MODID, "flowerpot"));
        GameRegistry.registerTileEntity(TileBrewingCauldron.class, new ResourceLocation(Plants2.MODID, "brewing_cauldron"));
    }
}
