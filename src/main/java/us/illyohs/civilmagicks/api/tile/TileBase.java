package us.illyohs.civilmagicks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public abstract class TileBase extends TileEntity {

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        readFromModNBT(nbt);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        writeToModNBT(nbt);
    }

    public abstract void readFromModNBT(NBTTagCompound bNBT);
    
    public abstract void writeToModNBT(NBTTagCompound bNBT);
}