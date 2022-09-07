package saw243_Assignment1;
import javax.swing.JOptionPane;

public class areaAndPerimeter {

	public static void main(String[] args) {
		String radius = JOptionPane.showInputDialog("Input radius");
		int x = Integer.parseInt(radius);
		double r = x;
		double p = 2*Math.PI*r;
		double a = Math.PI*r*r;
		p = p*100;
		int perimeter = (int) Math.round(p);
		p = perimeter / 100.0;
		a = a*100;
		int area = (int) Math.round(a);
		a = area / 100.0;
		JOptionPane.showMessageDialog(null, "The circle with radius " + r + " has an area of " + a + " and a perimeter of " + p);
		
		
		// TODO Auto-generated method stub
		
	}

}
