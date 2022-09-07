package saw243_Assignment1;
import javax.swing.JOptionPane;
public class decomposingMoney {
	
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("enter a number representing an amount of money from 1 dollar to 9999");
		int x = Integer.parseInt(number);
		int grands = x/1000;
		int Benjamins = (x%1000)/100; 
		int sawbucks = (x%100)/10;
		int bucks = x%10;
		JOptionPane.showMessageDialog(null, grands + " grands\n" + Benjamins + " Benjamins\n" + sawbucks + " sawbucks\n" + bucks + " bucks");
		// TODO Auto-generated method stub
		
	}

}
