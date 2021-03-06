package RPower.api.power.core;


import java.util.Stack;

public class MFPacket
{
	public static final double POWERLIMIT = 2048; 
	private E_MFPacketType packetType;
	private Stack<Byte> packetOrigin;
	private double buffer;

	public MFPacket(E_MFPacketType type)
	{
		setType(type);
		setBuffer(0);
		packetOrigin = new Stack();
		packetOrigin.add((byte)-1);
		
	}

	public E_MFPacketType getType()
	{
		return packetType;
		
	}
	
	public void setType(E_MFPacketType type)
	{
		packetType=type;
	}
	
	public double getBuffer()
	{
		return buffer;
	}	
	
	public void setBuffer(double amount)
	{
		if(amount<0)
			amount=0;
		buffer=amount;
		
	}

	public Stack<Byte> getOrigin()
	{
		return packetOrigin;
	}
}
