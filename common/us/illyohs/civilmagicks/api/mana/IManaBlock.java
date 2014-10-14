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
package us.illyohs.civilmagicks.api.mana;

public interface IManaBlock {

    /**
     * The current amount of mana a block has
     * 
     * @param current
     * @return
     */
    public int currentMana(int current);

    /**
     * The maximum amount of mana a tile can hold
     * 
     * @param max
     * @return
     */
    public int maxMana(int max);

    /**
     * The minimum amount of mana an item cans hold
     * 
     * @param min
     * @return
     * 
     *         Note from Anthony: Why?!?! A friend told me to add this...
     *         apparently she has plans don't really see the point
     */
    public int minMana(int min);

    /**
     * The maximum amount of mana a block can transfer
     * 
     * @param max
     * @return
     */
    public int maxTransfer(int max);

    /**
     * The minimum amount of mana a Block can transfer
     * 
     * @param min
     * @return
     */
    public int minTransfer(int min);

    /**
     * The type of mana the block can accept
     * 
     * @param type
     * @return
     */
    public ManaType canAccept(ManaType type);

    /**
     * The type of mana the Block can send
     * 
     * @param type
     * @return
     */
    public ManaType canSend(ManaType type);

}