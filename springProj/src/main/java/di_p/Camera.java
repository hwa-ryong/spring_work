package di_p;

public class Camera {
	
	String name;
	int pixel;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getPixel() {
		return pixel;
	}


	public void setPixel(int pixel) {
		
		this.pixel = pixel;
	}


	@Override	
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
		
	
}
