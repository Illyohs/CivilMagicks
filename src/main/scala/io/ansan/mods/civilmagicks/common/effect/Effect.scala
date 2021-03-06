/*
 * Copyright (c) 2019 (Anthony Anderson)
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *  License, v. 2.0. If a copy of the MPL was not distributed with this
 *  file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package io.ansan.mods.civilmagicks.common.effect

import io.ansan.mods.civilmagicks.api.effect.IEffect
import net.minecraft.util.ResourceLocation

abstract class Effect(key: String, description: String, isBottleAble: Boolean) extends IEffect {
  override def getKey: ResourceLocation = new ResourceLocation("civilmagicks:effect_" + this.key)

  override def isBottleAble: Boolean = this.isBottleAble

  override def getDescription: String = this.description
}
