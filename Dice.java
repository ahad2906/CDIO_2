//The code for our dice class from CDIO1
package game;

//If another type of dice is wanted change the MAX_VALUE to the desired max number on the dice, and the MIN_VALUE to the lowest desired number on the dice.
public class Dice {
	private int value;
	private final int MAX_VALUE = 6;
	private final int MIN_VALUE = 1;
	
	public int getVALUE() {
		return VALUE;
	}
	public void throwDice()
	{
		value =(int)(Math.random()*MAX_VALUE)+MIN_VALUE;//(int) = cast -> hurtig måde at konvertere datatyper på.
	}
}
