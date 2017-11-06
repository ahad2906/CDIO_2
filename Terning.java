//The code for our dice class from CDIO1
package spil;

//If another type of dice is wanted change the MAX_VALUE to the desired max number on the dice, and the MIN_VALUE to the lowest desired number on the dice.
public class Terning {
	private int værdi;
	private final int MAX_VÆRDI = 6;
	private final int MIN_VÆRDI = 1;
	
	public int getVærdi() {
		return værdi;
	}
	public void kastTerning()
	{
		værdi =(int)(Math.random()*MAX_VÆRDI)+MIN_VÆRDI;//(int) = cast -> hurtig måde at konvertere datatyper på.
	}
}
