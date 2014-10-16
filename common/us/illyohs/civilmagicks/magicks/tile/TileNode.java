/**
 * Copyright (c) 2014, Anthony Anderson(Lord Illyohs)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
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
package us.illyohs.civilmagicks.magicks.tile;

import net.minecraft.nbt.NBTTagCompound;
import us.illyohs.azathoth.tile.TileOwnable;
import us.illyohs.civilmagicks.api.mana.IManaBlock;
import us.illyohs.civilmagicks.api.mana.ManaType;

public class TileNode extends TileOwnable implements IManaBlock {
    
    public TileNode() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void readFromNBT(NBTTagCompound ntc) {
        
    }
    
    @Override
    public void writeToNBT(NBTTagCompound ntc) {
        
    }
    
    @Override
    public int currentMana(int current) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxMana(int max) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int minMana(int min) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxTransfer(int max) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int minTransfer(int min) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ManaType canAccept(ManaType type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ManaType canSend(ManaType type) {
        // TODO Auto-generated method stub
        return null;
    }
    
}