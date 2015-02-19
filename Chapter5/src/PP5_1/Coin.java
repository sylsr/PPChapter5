package PP5_1;


public class Coin
{
	private final int HEADS=0;
	private boolean face;
	public Coin()
	{
		flip();
	}
	public void flip()
	{
		int randomHelp=(int) (Math.random()*2);
		if(randomHelp==0)
		{
			this.face=false;
		}
		else
		{
			this.face=true;
		}
	}
	public boolean isHeads()
	{
		return (face==true);
	}
	public String toString()
	{
		return (face==true)?"Heads" : "Tails";
	}
}
