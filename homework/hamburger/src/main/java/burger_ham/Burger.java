package burger_ham;

public class Burger {
	String name, type;
	int cal;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	
	@Override
	public String toString() {
		return "Burger [name=" + name + ", type=" + type + ", cal=" + cal + "]";
	}
	
	
	
}
