package saw243_lab6;

public class MyRectangle {
	private int startX;
	private int startY;
	private int width;
	private int height;
	
	public MyRectangle() {
		this.startX = 0;
		this.startY = 0;
		this.width = 0;
		this.height = 0;
	}
	
	public MyRectangle(int startX, int startY, int width, int height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
	}
	public boolean isInside(int X, int Y) {
		boolean inside = false;
		if(X <= (startX+width) && X >= startX && Y >= (startY) && Y <= startY+height) {
			inside =  true;
		}	
		return inside;
	}
	public void setSize(int newWidth, int newHeight) {
		this.width = newWidth;
		this.height = newHeight;
	}
	public void setPosition(int newX, int newY) {
		this.startX = newX;
		this.startY = newY;
	}
}