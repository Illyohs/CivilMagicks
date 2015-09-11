package us.illyohs.mod.civilmagiks.api.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import us.illyohs.mod.civilmagiks.api.mana.IManaBlock;
import us.illyohs.mod.civilmagiks.api.mana.ManaType;

/**
 * This is the base class for all nodes within the ManaNetwork
 */
public class TileNode extends TileBase implements IUpdatePlayerListBox, IManaBlock {

    int mana;

    @Override
    public void update() {

    }
    
    @Override
    public void onModDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {

    }
    
    @Override
    public void readFromModNBT(NBTTagCompound bNBT) {
        mana = bNBT.getInteger("mana");
    }
    
    @Override
    public void writeToModNBT(NBTTagCompound bNBT) {
        bNBT.setInteger("mana", mana);
    }

    @Override
    public int addMana(int add) {
        return getCurrentMana() + add;
    }

    @Override
    public int subtractMana(int subtract) {
        return getCurrentMana() - subtract;
    }

    @Override
    public int getCurrentMana() {
        return mana;
    }

    @Override
    public ManaType canAcceptManaType() {
        return null;
    }

}