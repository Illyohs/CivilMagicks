/**
 * Copyright (c) 2014, Anthony Anderson(Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package us.illyohs.civilmagiks.common.block;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import us.illyohs.civilmagiks.client.core.creativetab.CivilTab;
import us.illyohs.civilmagiks.common.block.nodes.BlockElementalBasin;
import us.illyohs.civilmagiks.common.block.nodes.stars.BlockBasicStar;
import us.illyohs.civilmagiks.common.block.nodes.stars.StarBlock;
import us.illyohs.civilmagiks.common.block.tile.TileElementalBasin;
import us.illyohs.civilmagiks.common.block.tile.star.TileBasicStar;
import us.illyohs.civilmagiks.common.block.world.BlockClearFarmland;
import us.illyohs.civilmagiks.common.block.world.BlockManaStone;

import us.illyohs.libilly.block.BaseBlock;

public class ModBlocks {


    public static StarBlock starBasic;

    public static BaseBlock basin;
    public static BaseBlock clearFarmland;
    public static BaseBlock manaStone;

    public static void init() {

        // basin = new BlockElementalBasin();

        starBasic = new BlockBasicStar();

        basin = new BlockElementalBasin(Material.rock, "elementalbasin", 3, 2, 4, false, CivilTab.BLOCKS);
        manaStone = new BlockManaStone(Material.rock, "manastone", 3, 1, 0.5f, false, CivilTab.BLOCKS);
        clearFarmland = new BlockClearFarmland(Material.grass, "clearsoil", 3, 2, 0, true, CivilTab.BLOCKS);

        gameRegBlock();
        gameRegTile();
    }

    private static void gameRegBlock() {
        GameRegistry.registerBlock(manaStone, "manastone");
        GameRegistry.registerBlock(starBasic, "starbasic");
        GameRegistry.registerBlock(basin, "elementalbasin");
        GameRegistry.registerBlock(clearFarmland, "clearsoil");
    }

    private static void gameRegTile() {
        GameRegistry.registerTileEntity(TileBasicStar.class, "tilebasicstar");
        GameRegistry.registerTileEntity(TileElementalBasin.class, "tileelementalstar");
    }

}