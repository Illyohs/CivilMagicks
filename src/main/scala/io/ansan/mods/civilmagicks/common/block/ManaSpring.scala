/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.ansan.mods.civilmagicks.common.block

import io.ansan.mods.civilmagicks.api.mana.ManaType
import io.ansan.mods.civilmagicks.common.util.BiomeManaLocator
import net.minecraft.block.AbstractBlock.Properties
import net.minecraft.block.{Block, BlockState}
import net.minecraft.tileentity.{ITickableTileEntity, TileEntity}
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.shapes.{ISelectionContext, VoxelShape, VoxelShapes}
import net.minecraft.world.IBlockReader

class BlockManaSpring(properties: Properties) extends Block(properties) {

  override def getShape(state: BlockState, world: IBlockReader, pos: BlockPos, context: ISelectionContext): VoxelShape =
      VoxelShapes.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D)

  //NOTE ENTITYBLOCK_ANIMATED is TESR
//  override def getRenderType(state: BlockState): BlockRenderType = BlockRenderType.ENTITYBLOCK_ANIMATED

//  override def isNormalCube(state: BlockState, worldIn: IBlockReader, pos: BlockPos): Boolean = false

//  override def getRenderLayer: BlockRenderLayer = BlockRenderLayer.TRANSLUCENT

  override def createTileEntity(state: BlockState, world: IBlockReader): TileEntity = new TileManaSpring
}

class TileManaSpring extends TileEntity(ModTileTypes.MANA_SPRING) with ITickableTileEntity {

  override def tick(): Unit = {}

  /**
    * Gets a random ManaType for the current biome
    * @return ManaType
    */
  def getMana: ManaType = BiomeManaLocator.getRandomManaType(this.getLevel, this.getBlockPos)
}
