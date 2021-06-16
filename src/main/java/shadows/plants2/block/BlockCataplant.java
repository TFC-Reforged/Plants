package shadows.plants2.block;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import shadows.plants2.data.PlantConfig;

public class BlockCataplant extends BushBase {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    public BlockCataplant() {
        super("cataplant");
        setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public void onEntityCollision(World world, BlockPos pos, IBlockState state, Entity entity) {
        world.playSound(pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_WATERLILY_PLACE, SoundCategory.BLOCKS, 1, 1, false);
        EnumFacing face = state.getValue(FACING);
        int x = face.getDirectionVec().getX();
        int z = face.getDirectionVec().getZ();
        entity.addVelocity(x * PlantConfig.catapultPower, 0.08 * PlantConfig.catapultPower, z * PlantConfig.catapultPower);
        entity.velocityChanged = true;
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(FACING, EnumFacing.HORIZONTALS[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public boolean placeStateAt(IBlockState state, World world, BlockPos pos) {
        return world.setBlockState(pos, state.withRotation(Rotation.values()[world.rand.nextInt(4)]));
    }

}
