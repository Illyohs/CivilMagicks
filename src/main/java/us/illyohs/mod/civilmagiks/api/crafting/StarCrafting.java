/**
 * Copyright (c) 2015, Anthony Anderson(Illyohs)
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
package us.illyohs.mod.civilmagiks.api.crafting;

import net.minecraft.item.ItemStack;

public class StarCrafting {

    public ItemStack   catlyst;
    public ItemStack[] inputs;
    public ItemStack   outputs;
    public boolean     isManaRequired;
    public int         manaRequired;

    public StarCrafting(ItemStack catlyst, ItemStack[] inputs, ItemStack outputs, boolean isManaRequired, int manaRequired) {
        this.catlyst        = catlyst;
        this.inputs         = inputs;
        this.outputs        = outputs;
        this.isManaRequired = isManaRequired;
        this.manaRequired   = manaRequired;
    }
    
    public ItemStack getCatlyst(ItemStack catlyst) {
        return catlyst;
    }
    
    public ItemStack[] getInputs() {
        return inputs;
    }
    
    public ItemStack getOutput() {
        return outputs;
    }
    
    public Boolean isManaRequired() {
        return isManaRequired;
    }
    
    public int manaRequired() {
        return manaRequired;
    }

}