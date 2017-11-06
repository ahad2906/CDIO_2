package spil;

public class Kast {
	private int sum;
	private boolean dobbeltSeks;
	private boolean dobbeltEnere;
	private boolean erEns = false;
	private int terning1Værdi;
	private int terning2Værdi;
	
Terning terning1 = new Terning();
Terning terning2 = new Terning();
public void kastTerninger() {
	terning1.kastTerning();
	terning1Værdi = terning1.getVærdi();
	
	terning2.kastTerning();
	terning2Værdi = terning2.getVærdi();

	
	sum = terning2.getVærdi() + terning1.getVærdi();
}

public int getTerning1Værdi() {
	return terning1Værdi;
}

public int getTerning2Værdi() {
	return terning2Værdi;
}

public int getSum() {
	return sum;
}
public void dobbeltSeks() {
	if(sum==12) {
		dobbeltSeks = true;

		}
	else {
		dobbeltSeks = false;

	
	}
	
}
public boolean isDobbeltSeks() {
	return dobbeltSeks;
}
public void erDeEns() {
	if(terning1.getVærdi() == terning2.getVærdi())
		erEns = true;
	else
		erEns = false;
	
}
public boolean isErEns() {
	return erEns;
}

public void dobbeltEnere() {
	if(this.sum==2)
		dobbeltEnere = true;
	else
		dobbeltEnere = false;
}

public boolean isDobbeltEnere() {
	return dobbeltEnere;
}
	
}
