package shadows.plants2.data.enums;

import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.registries.IForgeRegistryEntry;
import shadows.placebo.interfaces.IFlowerEnum;
import shadows.placebo.interfaces.IPropertyEnum;
import shadows.placebo.interfaces.ITreeEnum;
import shadows.placebo.util.RecipeHelper;
import shadows.plants2.init.ModRegistry;

public class TheBigBookOfEnums {

    public enum Logs implements ITreeEnum {
        BLACK_KAURI,
        BRAZILLIAN_PINE,
        INCENSE_CEDAR,
        MURRAY_PINE;

        private WorldGenerator treeGen;

        @Override
        public void setTreeGen(WorldGenerator gen) {
            treeGen = gen;
        }

        @Override
        public WorldGenerator getTreeGen() {
            return treeGen;
        }

        IForgeRegistryEntry<?> thing = null;

        @Override
        public ItemStack get() {
            return RecipeHelper.makeStack(thing, 1, getMetadata());
        }

        @Override
        public void set(IForgeRegistryEntry<?> ifre) {
            thing = ifre;
        }

    }

    public enum Plants implements IFlowerEnum {
        ABELIOPHYLLUM_D(false, EnumDyeColor.WHITE),
        ALLIUM_C(true, EnumDyeColor.PURPLE),
        ABROMA_A(true, EnumDyeColor.RED),
        ABUTILON_I(true, EnumDyeColor.WHITE),
        ACAENA_S(true, EnumDyeColor.ORANGE),
        ACALYPHA_A(true, EnumDyeColor.PINK),
        ACALYPHA_R(false, EnumDyeColor.RED),
        ACANTHOLIMON_G(true, EnumDyeColor.MAGENTA),
        ACHILLEA(true, EnumDyeColor.RED),
        ACHIMENES_E(true, EnumDyeColor.RED),
        ACINOS_A(true, EnumDyeColor.PURPLE),
        ACIPHYLLA_G(true, EnumDyeColor.SILVER),
        ADENOPHORA_T(true, EnumDyeColor.MAGENTA),
        ADONIS_A(true, EnumDyeColor.ORANGE),
        AECHMEA_A(true, EnumDyeColor.RED),
        AESCHYNANTHUS_S(true, EnumDyeColor.RED),
        AETHIONEMA_S(true, EnumDyeColor.PINK),
        AGAPANTHUS_A(true, EnumDyeColor.BLUE),
        AGERATUM_C(true, EnumDyeColor.SILVER),
        AGROSTEMMA_G(true, EnumDyeColor.MAGENTA),
        AIRA_C(true, EnumDyeColor.SILVER),
        AJUGA_A(true, EnumDyeColor.PURPLE),
        ALBUCA_F(true, EnumDyeColor.GREEN),
        ALCEA_B(true, EnumDyeColor.BROWN),
        ALKANNA_T(true, EnumDyeColor.BLUE),
        ALLIARIA_P(true, EnumDyeColor.WHITE),
        ALOE_B(false, EnumDyeColor.ORANGE),
        ALOPECURUS_G(false, EnumDyeColor.YELLOW),
        ALSOBIA_D(false, EnumDyeColor.WHITE),
        ALSTROEMERIA_P(true, EnumDyeColor.RED),
        ALYOGYNE_H(true, EnumDyeColor.RED),
        AMARYLLIS_B(true, EnumDyeColor.PINK),
        AMBROSIA_T(true, EnumDyeColor.YELLOW),
        AMESIELLA_P(true, EnumDyeColor.WHITE),
        AMMOBIUM_A(true, EnumDyeColor.WHITE),
        AMPHIPAPPUS(true, EnumDyeColor.YELLOW),
        ANACYCLUS_V(true, EnumDyeColor.YELLOW),
        ANAGALLIS_A(true, EnumDyeColor.ORANGE),
        ANCHUSA_A(true, EnumDyeColor.BLUE),
        ARGOCOFFEEOPSIS_L(true, EnumDyeColor.PINK),
        ASCLEPIAS_S(true, EnumDyeColor.MAGENTA),
        ASCLEPIAS_T(true, EnumDyeColor.ORANGE),
        ASPALATHUS_V(true, EnumDyeColor.YELLOW),
        ASTILBE_C(false, EnumDyeColor.PINK),
        BARBAREA_V(true, EnumDyeColor.YELLOW),
        BEGONIA_E(true, EnumDyeColor.PINK),
        BRACHYSTELMA_S(true, EnumDyeColor.BROWN),
        CARDAMINE_C(true, EnumDyeColor.WHITE),
        CEPHALOPHYLLUM_P(true, EnumDyeColor.RED),
        CHRYSANTHEMUM_M(true, EnumDyeColor.PINK),
        CLOVE(false, EnumDyeColor.RED),
        CORYDALIS(true, EnumDyeColor.MAGENTA),
        CORYDALIS_F(true, EnumDyeColor.YELLOW),
        CRASSULA_S(true, EnumDyeColor.SILVER),
        DISA_F(true, EnumDyeColor.RED),
        EPIPOGIUM_A(true, EnumDyeColor.PINK),
        FABACEAE(true, EnumDyeColor.PURPLE),
        GALANTHUS(true, EnumDyeColor.WHITE),
        HELIOTROPIUM_P(true, EnumDyeColor.YELLOW),
        HELLEBORE(true, EnumDyeColor.PURPLE),
        HESPERIS_M(true, EnumDyeColor.PINK),
        IMPATIENS_C(false, EnumDyeColor.ORANGE),
        ISOLEPIS_B(false, EnumDyeColor.GREEN),
        NARTHECIUM_A(true, EnumDyeColor.YELLOW),
        NEMESIA_M(false, EnumDyeColor.YELLOW),
        PEONY(true, EnumDyeColor.PINK),
        PLUCHEA_G(true, EnumDyeColor.PINK),
        PSORALEA_C(true, EnumDyeColor.PURPLE),
        PSORALEA_M(false, EnumDyeColor.BLUE),
        PUERARIA_M(true, EnumDyeColor.MAGENTA),
        RHANTERIUM_E(true, EnumDyeColor.YELLOW),
        RORIPPA_S(false, EnumDyeColor.YELLOW),
        RUDBECKIA_H(true, EnumDyeColor.YELLOW),
        STREBLORRHIZA_S(false, EnumDyeColor.GRAY),
        SUMATRA_D(false, EnumDyeColor.BROWN),
        THISMIA_A(false, EnumDyeColor.ORANGE),
        TRILLIUM(true, EnumDyeColor.WHITE),
        VERATRUM_V(false, EnumDyeColor.GREEN),
        VERONICA_A(true, EnumDyeColor.LIGHT_BLUE),
        VIOLA_C(true, EnumDyeColor.PURPLE),
        ALLIUM_DRUMSTICK(true, EnumDyeColor.PINK),
        BACHELORS_BUTTON(true, EnumDyeColor.BLUE),
        BILLY_BUTTONS(true, EnumDyeColor.YELLOW),
        DELPHINIUM_BELLADONNA(true, EnumDyeColor.BLUE),
        FERNFLOWER_YARROW(true, EnumDyeColor.YELLOW),
        GERBERA_DAISY(true, EnumDyeColor.PINK),
        HYDRANGEA(true, EnumDyeColor.PURPLE),
        RED_ROVER(true, EnumDyeColor.RED),
        SNAPDRAGON(true, EnumDyeColor.RED),
        STAR_OF_BETHLEHEM(true, EnumDyeColor.WHITE),
        BARREN_STRAWBERRY(true, EnumDyeColor.LIME),
        BEARDTONGUE(true, EnumDyeColor.MAGENTA),
        FAIRY_LILY(true, EnumDyeColor.WHITE),
        ROYAL_BLUEBELL(true, EnumDyeColor.PURPLE),
        SANDBOG_DEATH_CAMAS(true, EnumDyeColor.SILVER),
        SNOWY_RIVER_WESTRINGIA(true, EnumDyeColor.GRAY),
        WELDENIA_CANDIDA(true, EnumDyeColor.WHITE),
        WILD_RICE(false, EnumDyeColor.LIME),
        YELLOWROOT(true, EnumDyeColor.MAGENTA), // new ->
        DARK_VENUS(true, EnumDyeColor.GREEN),
        FLOWERS_BACHBUTTON(true, EnumDyeColor.ORANGE),
        FLOWERSB_DAYLILYDIFF(true, EnumDyeColor.ORANGE),
        FLOWERSB_DAYLILY(true, EnumDyeColor.PINK),
        FLOWERSB_ECHINACEA(true, EnumDyeColor.YELLOW),
        FLOWERSB_FREEORANGE(true, EnumDyeColor.YELLOW),
        FLOWERSB_FREERED(true, EnumDyeColor.YELLOW),
        FLOWERSB_FREEYELLOW(true, EnumDyeColor.YELLOW),
        FLOWERSB_HYACINTH(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERS_BLEEDHEART(true, EnumDyeColor.PINK),
        FLOWERSB_LILYVALLEY(true, EnumDyeColor.WHITE),
        FLOWERSB_LUPINORANGE(true, EnumDyeColor.ORANGE),
        FLOWERSB_LUPINPURP(true, EnumDyeColor.PURPLE),
        FLOWERSB_LUPINYELL(true, EnumDyeColor.YELLOW),
        FLOWERSB_NARCISSUS(true, EnumDyeColor.YELLOW),
        FLOWERSB_NASTURTIUM(true, EnumDyeColor.ORANGE),
        FLOWERSB_PANSY(true, EnumDyeColor.PURPLE),
        FLOWERSB_VIOLET(true, EnumDyeColor.PURPLE),
        FLOWERSB_WOLFSBANE(true, EnumDyeColor.PURPLE),
        FLOWERS_CAPOPPY(true, EnumDyeColor.ORANGE),
        FLOWERSC_BORAGE(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSC_CORYDALIS(true, EnumDyeColor.YELLOW),
        FLOWERSC_GERANIUM_LIGHT(true, EnumDyeColor.MAGENTA),
        FLOWERSC_GERANIUM_PINK(true, EnumDyeColor.PINK),
        FLOWERSC_GERANIUM_RED(true, EnumDyeColor.RED),
        FLOWERSC_GILIA(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSC_LEWISIA(true, EnumDyeColor.PINK),
        FLOWERSC_LOBELIA(true, EnumDyeColor.BLUE),
        FLOWERS_COSMOS(true, EnumDyeColor.MAGENTA),
        FLOWERSC_PERRIWINKLE_DIFF(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSC_PERRIWINKLE(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSC_PETTICOAT(true, EnumDyeColor.MAGENTA),
        FLOWERSC_PITCHER(true, EnumDyeColor.MAGENTA),
        FLOWERSC_REDCLOVER_DIFF(true, EnumDyeColor.RED),
        FLOWERSC_REDCLOVER_MID(true, EnumDyeColor.RED),
        FLOWERSC_REDCLOVER(true, EnumDyeColor.RED),
        FLOWERS_CROCUSMIX(true, EnumDyeColor.YELLOW),
        FLOWERS_CROCUSPURP(true, EnumDyeColor.PURPLE),
        FLOWERS_CROCUSYELL(true, EnumDyeColor.YELLOW),
        FLOWERSC_STICKY_MONKEY(true, EnumDyeColor.ORANGE),
        FLOWERS_DAFFODIL(true, EnumDyeColor.YELLOW),
        FLOWERS_DAFFYELLOW(true, EnumDyeColor.YELLOW),
        FLOWERS_DAHLIA(true, EnumDyeColor.MAGENTA),
        FLOWERS_DAISYPURP(true, EnumDyeColor.PURPLE),
        FLOWERS_DAISYWHT(true, EnumDyeColor.PURPLE),
        FLOWERSD_CHRYS(true, EnumDyeColor.LIME),
        FLOWERSD_COMMELINA(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSD_CORYDALIS_BLUE(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSD_COSMOS_MIX(true, EnumDyeColor.MAGENTA),
        FLOWERSD_COSMOS_ORANGE(true, EnumDyeColor.ORANGE),
        FLOWERSD_COSMOS_YELLOW(true, EnumDyeColor.YELLOW),
        FLOWERSD_CYAN(true, EnumDyeColor.CYAN),
        FLOWERSD_FORGET_LIGHT(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSD_LILY_WHT(true, EnumDyeColor.GRAY),
        FLOWERSD_MAGENTA(true, EnumDyeColor.MAGENTA),
        FLOWERSD_MALLOW(true, EnumDyeColor.PURPLE),
        FLOWERSD_MORNING(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSD_ORCHID(true, EnumDyeColor.ORANGE),
        FLOWERSD_PARROT(true, EnumDyeColor.MAGENTA),
        FLOWERSD_POPPY(true, EnumDyeColor.RED),
        FLOWERSD_SALVIA(true, EnumDyeColor.PURPLE),
        FLOWERSE_BANEBERRY(true, EnumDyeColor.PINK),
        FLOWERSE_BORAGE_BLUE(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSE_BUTTON_BLUE(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSE_BUTTON_LIGHT(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSE_CLOVER_SIDE(true, EnumDyeColor.PINK),
        FLOWERSE_COWSLIP(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSE_LOBELIA_BLUE(true, EnumDyeColor.BLUE),
        FLOWERSE_LOBELIA_LIGHT(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERSE_MINT(true, EnumDyeColor.MAGENTA),
        FLOWERSE_SAGE(true, EnumDyeColor.PURPLE),
        FLOWERSE_SALVIA_MAGENTA(true, EnumDyeColor.PURPLE),
        FLOWERSE_ZINNIA_MAGENTA(true, EnumDyeColor.PURPLE),
        FLOWERSE_ZINNIA_MIX(true, EnumDyeColor.MAGENTA),
        FLOWERSE_ZINNIA_STRIPE(true, EnumDyeColor.ORANGE),
        FLOWERSE_ZINNIA_SUNNY(true, EnumDyeColor.ORANGE),
        FLOWERS_FORGET(true, EnumDyeColor.LIGHT_BLUE),
        FLOWERS_FUCHSIA(true, EnumDyeColor.PURPLE),
        FLOWERS_LANTANA(true, EnumDyeColor.ORANGE),
        FLOWERS_LILYPURP(true, EnumDyeColor.PURPLE),
        FUNGUS_BASKET(true, EnumDyeColor.RED),
        FUNGUS_CORAL(true, EnumDyeColor.PURPLE),
        FUNGUS_CRINOLINE(true, EnumDyeColor.YELLOW),
        FUNGUS_FINGERS_ONE(true, EnumDyeColor.RED),
        FUNGUS_FINGERS(true, EnumDyeColor.RED),
        FUNGUS_PIXIE_BLUE(true, EnumDyeColor.LIGHT_BLUE),
        FUNGUS_PIXIE_CYAN(true, EnumDyeColor.CYAN),
        OUCH_CLAW(true, EnumDyeColor.PINK),
        OUCH_CLAW_SPIKE(true, EnumDyeColor.WHITE),
        OUCH_HEDGEHOG(true, EnumDyeColor.PINK),
        OUCH_PARODIA(false, EnumDyeColor.LIME),
        ZENOBIA(true, EnumDyeColor.SILVER), // old
        CAMBRIDGE_BLUE(true, EnumDyeColor.CYAN),
        ;

        EnumDyeColor color;
        boolean flowers;

        Plants(boolean flowers, EnumDyeColor c) {
            color = c;
            this.flowers = flowers;
        }

        @Override
        public EnumDyeColor getColor() {
            return color;
        }

        @Override
        public boolean useForRecipes() {
            return true;
        }

        @Override
        public boolean hasFlowers() {
            return flowers;
        }

        IForgeRegistryEntry<?> thing = null;

        @Override
        public ItemStack get() {
            return RecipeHelper.makeStack(thing, 1, getMetadata());
        }

        @Override
        public void set(IForgeRegistryEntry<?> ifre) {
            thing = ifre;
        }

    }

    public enum Desert implements IFlowerEnum {
        APACHE_PLUME(true, EnumDyeColor.PURPLE),
        ARIZONA_POPPY(true, EnumDyeColor.YELLOW),
        ASIAN_MUSTARD(true, EnumDyeColor.LIME),
        BIGELOWS_MONKEY_FLOWER(true, EnumDyeColor.MAGENTA),
        BLACKTACK_PHACELIA(true, EnumDyeColor.PURPLE),
        BLAZING_STAR(true, EnumDyeColor.YELLOW),
        BLUE_FLAX(true, EnumDyeColor.LIGHT_BLUE),
        BRISTLY_FIDDLENECK(true, EnumDyeColor.YELLOW),
        BROWN_EYES(true, EnumDyeColor.BROWN),
        BUCKBRUSH(true, EnumDyeColor.SILVER),
        BUTTON_BRITTLEBUSH(true, EnumDyeColor.LIME),
        CANAIGRE(true, EnumDyeColor.ORANGE),
        CHOCOLATE_DROPS(false, EnumDyeColor.BLUE),
        CHUPAROSA(false, EnumDyeColor.ORANGE),
        CLUSTERED_BROOMRAPE(true, EnumDyeColor.YELLOW),
        COULTERS_JEWELFLOWER(true, EnumDyeColor.BROWN),
        DISTANT_SCORPIONWEED(true, EnumDyeColor.PURPLE),
        NEGLECTED_SCORPIONWEED(true, EnumDyeColor.BROWN),
        SAGEBRUSH(false, EnumDyeColor.GREEN),
        SAN_ANGELO_YUCCA(false, EnumDyeColor.GREEN),
        DESERT_ALBUCA(true, EnumDyeColor.GREEN),
        DESERT_CLOVER(true, EnumDyeColor.MAGENTA),
        DESERT_CORNFLOWER(true, EnumDyeColor.LIGHT_BLUE),
        DESERT_FLAG(true, EnumDyeColor.MAGENTA),
        DESERT_FLAME_PEA_DIFF(true, EnumDyeColor.ORANGE),
        DESERT_FLAME_PEA(true, EnumDyeColor.YELLOW),
        DESERT_NOTCH(true, EnumDyeColor.PURPLE),
        DESERT_PAINTBRUSH(true, EnumDyeColor.PINK),
        DESERT_STURT_PEA(true, EnumDyeColor.RED),
        DESERT_TINSEL(true, EnumDyeColor.BLUE),
        DESERT_TINSEL_WHT(true, EnumDyeColor.GRAY),
        DESERT_VERBENA_DIFF(true, EnumDyeColor.MAGENTA),
        DESERT_VERBENA(true, EnumDyeColor.MAGENTA),
        DESERT_YELLOWS(true, EnumDyeColor.YELLOW),
        DESERT_YUCCA(false, EnumDyeColor.GREEN),
        ;

        EnumDyeColor color;
        boolean flowers;

        Desert(boolean flowers, EnumDyeColor c) {
            color = c;
            this.flowers = flowers;
        }

        @Override
        public EnumDyeColor getColor() {
            return color;
        }

        @Override
        public boolean useForRecipes() {
            return true;
        }

        @Override
        public boolean hasFlowers() {
            return flowers;
        }

        IForgeRegistryEntry<?> thing = null;

        @Override
        public ItemStack get() {
            return RecipeHelper.makeStack(thing, 1, getMetadata());
        }

        @Override
        public void set(IForgeRegistryEntry<?> ifre) {
            thing = ifre;
        }

    }

    public enum Double implements IFlowerEnum {
        ABELIA_C(true, EnumDyeColor.WHITE),
        ABRONIA_A(true, EnumDyeColor.PURPLE),
        ACANTHUS_B(true, EnumDyeColor.PINK),
        ADENOCARPUS_F(true, EnumDyeColor.YELLOW),
        AGONIS_T(true, EnumDyeColor.WHITE),
        ALONSOA_M(true, EnumDyeColor.RED),
        BULBIL_BUGLELILY(true, EnumDyeColor.ORANGE),
        DOUBLES_COSMOS(true, EnumDyeColor.ORANGE),
        DOUBLES_GLORIOSA(true, EnumDyeColor.ORANGE),
        DOUBLES_IRIS(true, EnumDyeColor.ORANGE),
        //
        DOUBLES_LARKSPUR(true, EnumDyeColor.ORANGE),
        DOUBLES_LUPIN(true, EnumDyeColor.ORANGE),
        DOUBLES_MANZANITA(true, EnumDyeColor.ORANGE),
        DOUBLESB_CHERRY(true, EnumDyeColor.ORANGE),
        DOUBLESB_GLADIOLA_RED(true, EnumDyeColor.ORANGE),
        DOUBLESB_HAWTHORNE(true, EnumDyeColor.ORANGE),
        DOUBLESB_LILY_TALL(true, EnumDyeColor.ORANGE),
        DOUBLESB_MENDO(true, EnumDyeColor.ORANGE),
        DOUBLESB_QUINCE(true, EnumDyeColor.ORANGE),
        DOUBLESC_COSMOS_ORANGE(true, EnumDyeColor.ORANGE),
        DOUBLESC_DATURA(true, EnumDyeColor.ORANGE),
        DOUBLESC_GLADIOLA(true, EnumDyeColor.ORANGE),
        DOUBLESC_GLADIOLA_ORANGE(true, EnumDyeColor.ORANGE),
        DOUBLESC_GLADIOLA_PEACH(true, EnumDyeColor.ORANGE),
        DOUBLESC_POPPY_BLUE(true, EnumDyeColor.ORANGE),
        DOUBLESD_ALOE(true, EnumDyeColor.ORANGE),
        DOUBLESD_CACTUS_FLOWER(true, EnumDyeColor.ORANGE),
        DOUBLESD_DRY(true, EnumDyeColor.ORANGE),
        DOUBLESD_INDIGO(true, EnumDyeColor.ORANGE),
        DOUBLESD_OCOTILLO(true, EnumDyeColor.ORANGE),
        DOUBLESD_YUCCA_TALL(true, EnumDyeColor.ORANGE),
        DOUBLESP_BLUE_BELL(true, EnumDyeColor.ORANGE),
        DOUBLESP_BLUE_PURPLE(true, EnumDyeColor.ORANGE),
        DOUBLESP_DARK_BLUE(true, EnumDyeColor.ORANGE),
        DOUBLESP_DARK_MAGENTA(true, EnumDyeColor.ORANGE),
        DOUBLESP_MAGENTA(true, EnumDyeColor.ORANGE),
        DOUBLESP_MEDIUM_PINK(true, EnumDyeColor.ORANGE),
        DOUBLESS_BEAR(true, EnumDyeColor.ORANGE),
        DOUBLESS_DRY(true, EnumDyeColor.ORANGE),
        DOUBLESS_LARGE(true, EnumDyeColor.ORANGE),
        DOUBLESS_RED(true, EnumDyeColor.ORANGE),
        DOUBLESS_TINY(true, EnumDyeColor.ORANGE),
        DOUBLESS_TWO(true, EnumDyeColor.ORANGE),
        ;

        EnumDyeColor color;
        boolean flowers;

        Double(boolean flowers, EnumDyeColor c) {
            color = c;
            this.flowers = flowers;
        }

        @Override
        public EnumDyeColor getColor() {
            return color;
        }

        @Override
        public int getPredicateIndex() {
            return ordinal() / 8;
        }

        @Override
        public boolean useForRecipes() {
            return true;
        }

        @Override
        public int getMetadata() {
            return ordinal() % 8;
        }

        @Override
        public boolean hasFlowers() {
            return flowers;
        }

        IForgeRegistryEntry<?> thing = null;

        @Override
        public ItemStack get() {
            return RecipeHelper.makeStack(thing, 1, getMetadata());
        }

        @Override
        public void set(IForgeRegistryEntry<?> ifre) {
            thing = ifre;
        }

    }
/*
    public enum Generic implements IPropertyEnum {
        COTTON,
        DYE_BLACK,
        DYE_BLUE,
        DYE_BROWN,
        DYE_WHITE,
        CRYSTAL_SHARD,
        CRYSTAL_CHUNK,
        DARK_CRYSTAL_SHARD,
        DARK_CRYSTAL_CHUNK,
        CRYSTAL_STICK,
        BLAZE_PETAL,
        MAGMA_JELLY,
        SMOLDERBERRY,
        EMBERROOT,
        ;

        @Override
        public ItemStack get() {
            return new ItemStack(ModRegistry.GENERIC, 1, ordinal());
        }
    }*/

    public enum Vines implements IPropertyEnum {
        ADLUMIA_F,
        AFGEKIA_M,
        ANDROSACE_A,
        AKEBIA_Q,
        AMPELOPSIS_A;

        IForgeRegistryEntry<?> thing = null;

        @Override
        public ItemStack get() {
            return RecipeHelper.makeStack(thing);
        }

        @Override
        public void set(IForgeRegistryEntry<?> ifre) {
            thing = ifre;
        }
    }

    public enum Crops implements IPropertyEnum {
        AMARANTHUS_H,
        OKRA,
        PINEAPPLE,
        ;

        @Override
        public int getPredicateIndex() {
            return ordinal() / 2;
        }

        @Override
        public ItemStack get() {
            return ItemStack.EMPTY;
        }

    }

	/*public static enum BushSet implements IPropertyEnum, IPostInitUpdate {
		BLACKBERRY("plants2:blackberry"),
		BLUEBERRY("plants2:blueberry"),
		DECIDUOUS(""),
		EVERGREEN(""),
		HUCKLEBERRY("plants2:huckleberry"),
		RASPBERRY("plants2:raspberry");

		private StackPrimer primer;
		private String dropName;

		BushSet(String dropName) {
			this.dropName = dropName;
			Placebo.UPDATES.add(this);
		}

		public StackPrimer getHarvest() {
			return primer;
		}

		private void setItem(Item item) {
			primer = new StackPrimer(item);
		}

		@Override
		public void postInit(FMLPostInitializationEvent e) {
			setItem(ForgeRegistries.ITEMS.getValue(new ResourceLocation(dropName)));
		}

		@Override
		public ItemStack get() {
			return new ItemStack(ModRegistry.BUSH, 1, ordinal());
		}

	}*/

	/*public static enum CrystalLogs implements ITreeEnum {
		CRYSTAL,
		DARK_CRYSTAL;

		private WorldGenerator gen;

		@Override
		public WorldGenerator getTreeGen() {
			return gen;
		}

		@Override
		public void setTreeGen(WorldGenerator k) {
			gen = k;
		}

		@Override
		public ItemStack get() {
			return new ItemStack(ModRegistry.CRYSTAL_LOG, 1, ordinal());
		}

	}

	public static enum CrystalPlanks implements IPlankEnum {
		CRYSTAL,
		DARK_CRYSTAL;

		@Override
		public ItemStack get() {
			return new ItemStack(ModRegistry.CRYSTAL_PLANKS, 1, ordinal());
		}

		@Override
		public ItemStack genLogStack() {
			return new ItemStack(ModRegistry.CRYSTAL_LOG, 1, ordinal());
		}

		@Override
		public boolean isNether() {
			return false;
		}

	}*/

	/*public static enum Crystals implements IPropertyEnum {
		CRYSTAL_SHARD(true, Generic.CRYSTAL_SHARD),
		CRYSTAL_BLOCK(false),
		CRYSTAL_BRICK(false),
		DARK_CRYSTAL_SHARD(true, Generic.DARK_CRYSTAL_SHARD),
		DARK_CRYSTAL_BLOCK(false),
		DARK_CRYSTAL_BRICK(false),
		TITAN_STONE(false);

		private boolean isShard;
		private Generic drops;

		Crystals(boolean isShard, @Nullable Generic drops) {
			this.isShard = isShard;
			this.drops = drops;
		}

		Crystals(boolean isShard) {
			this(isShard, null);
		}

		public boolean isShard() {
			return isShard;
		}

		public ItemStack getDrops() {
			return drops != null ? drops.get(ThreadLocalRandom.current().nextInt(3) + 1).copy() : ItemStack.EMPTY;
		}

		@Override
		public ItemStack get() {
			return new ItemStack(ModRegistry.CRYSTAL, 1, ordinal());
		}

	}*/

}
