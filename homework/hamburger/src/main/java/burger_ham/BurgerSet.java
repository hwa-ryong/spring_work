package burger_ham;

public class BurgerSet {
	String name;
	Burger bg;
	Drink dr;
	Side sd;
	Setname sn;
	Price pr;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Burger getBg() {
		return bg;
	}
	public void setBg(Burger bg) {
		this.bg = bg;
	}
	public Drink getDr() {
		return dr;
	}
	public void setDr(Drink dr) {
		this.dr = dr;
	}
	public Side getSd() {
		return sd;
	}
	public void setSd(Side sd) {
		this.sd = sd;
	}
	public Setname getSn() {
		return sn;
	}
	public void setSn(Setname sn) {
		this.sn = sn;
	}
	public Price getPr() {
		return pr;
	}
	public void setPr(Price pr) {
		this.pr = pr;
	}
	
	
	@Override
	public String toString() {
		return "BurgerSet [name=" + name + ", bg=" + bg + ", dr=" + dr + ", sd=" + sd + ", sn=" + sn + ", pr=" + pr
				+ "]";
	}
	
	
	
	
}
