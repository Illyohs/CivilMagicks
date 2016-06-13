/**
  * Copyright (c) 2016, Anthony Anderson(Illyohs)
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
  */
package us.illyohs.civilmagiks.common.core.util

import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.Item

class CivilItem(name: String, hasSub: Boolean, tabs: CreativeTabs) extends Item {

  this.setRegistryName(name)
  this.setUnlocalizedName(ModInfo.MOD_ID + ":" + name)
  this.setHasSubtypes(hasSub)
  if(tabs != null) {
    this.setCreativeTab(tabs)
  }
}