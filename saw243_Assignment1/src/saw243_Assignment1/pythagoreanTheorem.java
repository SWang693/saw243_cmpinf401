package saw243_Assignment1;
import javax.swing.JOptionPane;

public class pythagoreanTheorem {

	public static void main(String[] args) {
		String numberOne = JOptionPane.showInputDialog("Input side 1 length");
		String numberTwo = JOptionPane.showInputDialog("Input side 2 length");
		int a = Integer.parseInt(numberOne);
		int b = Integer.parseInt(numberTwo);
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		c = c*100;
		int r = (int) Math.round(c);
		c = r / 100.0;
		JOptionPane.showMessageDialog(null, "The hypotenuse is "+c);
		
		// TODO Auto-generated method stub

	}

}
