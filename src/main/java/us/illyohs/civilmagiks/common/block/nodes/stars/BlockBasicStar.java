package us.illyohs.civilmagiks.common.block.nodes.stars;

import us.illyohs.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagiks.common.block.tile.star.TileBasicStar;
import us.illyohs.civilmagiks.common.core.lib.LibStrings;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockBasicStar extends StarBlock {

    public BlockBasicStar() {
        setUnlocalizedName(LibStrings.STAR_BASIC);
        setCreativeTab(CivilTab.BLOCKS);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileBasicStar();
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    public int getRenderType() {
        return 0;
    }
}