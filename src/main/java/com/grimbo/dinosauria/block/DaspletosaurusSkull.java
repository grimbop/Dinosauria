package com.grimbo.dinosauria.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class DaspletosaurusSkull extends Block {
    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    private static final VoxelShape SHAPE_N = Stream.of(
            (Block.makeCuboidShape(5.5, 2, 1, 10.5, 7, 8)),
            (Block.makeCuboidShape(6, 0, 1, 10, 2, 8)),
            (Block.makeCuboidShape(5, 0, 8, 11, 3, 14)),
            (Block.makeCuboidShape(5, 3, 8, 11, 8, 14)),
            (Block.makeCuboidShape(10, 7, 6, 11, 9, 8)),
            (Block.makeCuboidShape(5, 7, 6, 6, 9, 8))
            ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1,v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            (Block.makeCuboidShape(5.5, 2, 1, 10.5, 7, 8)),
            (Block.makeCuboidShape(6, 0, 1, 10, 2, 8)),
            (Block.makeCuboidShape(5, 0, 8, 11, 3, 14)),
            (Block.makeCuboidShape(5, 3, 8, 11, 8, 14)),
            (Block.makeCuboidShape(10, 7, 6, 11, 9, 8)),
            (Block.makeCuboidShape(5, 7, 6, 6, 9, 8))
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1,v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            (Block.makeCuboidShape(5.5, 2, 1, 10.5, 7, 8)),
            (Block.makeCuboidShape(6, 0, 1, 10, 2, 8)),
            (Block.makeCuboidShape(5, 0, 8, 11, 3, 14)),
            (Block.makeCuboidShape(5, 3, 8, 11, 8, 14)),
            (Block.makeCuboidShape(10, 7, 6, 11, 9, 8)),
            (Block.makeCuboidShape(5, 7, 6, 6, 9, 8))
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1,v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            (Block.makeCuboidShape(5.5, 2, 1, 10.5, 7, 8)),
            (Block.makeCuboidShape(6, 0, 1, 10, 2, 8)),
            (Block.makeCuboidShape(5, 0, 8, 11, 3, 14)),
            (Block.makeCuboidShape(5, 3, 8, 11, 8, 14)),
            (Block.makeCuboidShape(10, 7, 6, 11, 9, 8)),
            (Block.makeCuboidShape(5, 7, 6, 6, 9, 8))
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1,v2, IBooleanFunction.OR);}).get();


    public DaspletosaurusSkull(Properties properties) {

        super(properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {

        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;

            case EAST:
                return SHAPE_E;

            case WEST:
                return SHAPE_W;

            default:
                return SHAPE_N;


        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
       return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }
    @SuppressWarnings("deprecation")
    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));

    }
    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }
    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

}
