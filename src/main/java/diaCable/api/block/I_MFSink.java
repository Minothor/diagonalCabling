package RPower.api.power.block;

import java.util.List;

import RPower.api.power.block.cable.I_PipeDirection;
import RPower.api.power.core.I_MFCommon;
import RPower.api.power.core.MFPacket;


public interface I_MFSink extends I_MFCommon {
	
	public boolean takePacket(MFPacket packet);
	public double flowLimit();
	public void powerBleed(double excess);

}
