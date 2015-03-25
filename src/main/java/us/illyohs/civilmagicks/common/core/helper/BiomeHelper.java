/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
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
package us.illyohs.civilmagicks.common.core.helper;

import us.illyohs.civilmagicks.api.mana.BiomeManaRegistry;
import us.illyohs.civilmagicks.api.mana.ManaType;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeHelper {
    
    public World        world;
    public BiomeGenBase biome;
    ManaType            type = ManaType.NEUTRAL;
    
    /**
     * This gets the current biome location
     * @param pos
     * @return biome 
     */
    public BiomeGenBase getBiome(BlockPos pos) {
//        BiomeGenBase biome = world.getBiomeGenForCoords(x, z); 
    	BiomeGenBase biome = world.getBiomeGenForCoords(pos);
        return biome;
    }
    
    /**
     * This gets the mana type for each biome
     * @param biome
     * @return 
     */
    public ManaType getManaFromBiomeType(BiomeGenBase biome) {
        for(ManaType type : BiomeManaRegistry.biomeManaRegistry.keySet()) 
            if (BiomeManaRegistry.biomeManaRegistry.get(type).equals(biome)) {
                return type;
            }
        return type;

        
    }

}
