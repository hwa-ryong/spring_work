package burger_ham;

public class Price {
	int won;

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	@Override
	public String toString() {
		return won + "원";
	}
	
	
}
