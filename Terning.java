//genbruger terning fra CDIO1
package spil;

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
