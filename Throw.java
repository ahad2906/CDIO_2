package game;

public class Throw {
	private int sum;
	private int dice1Value;
	private int dice2Value;
	
Dice dice1 = new Dice();
Dice dice2 = new Dice();
public void throwDice() {
	dice1.throwDice();
	dice1Value = dice1.getValue();
	
	dice2.throwDice();
	dice2Value = dice2.getValue();

	
	sum = dice1.getValue() + dice2.getValue();
}

public int getDice1Value() {
	return dice1Value;
}

public int getDice2Value() {
	return dice2Value;
}

public int getSum() {
	return sum;
}
	

}
