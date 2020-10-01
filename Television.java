/** 
*The purpose of this class is to model a television
*Your name and today’s date
*/

public class Television 
{
	private String MANUFACTURER;
	private int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;
	//Sets television screen size, power, volume, channel
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
		
	}
	//sets station 
	public void setChannel(int station)
	{
		this.channel = station;
	}
	//sets power objects to be off until turned on
	public void power()
	{
		powerOn = !powerOn;
	}
	//increase volume by 1
	public void increaseVolume()
	{
		volume += 1;
	}
	//decrease volume by 1
	public void decreaseVolume()
	{
		volume -= 1;
	}
	//return channel
	public int getChannel()
	{
		return channel;
	}
	//return volume
	public int getVolume()
	{
		return volume;
	}
	//return manufacturer
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	//return screen size
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
}


	