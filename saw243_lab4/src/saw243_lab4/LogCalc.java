package saw243_lab4;
import javax.swing.JOptionPane;
public class LogCalc {

	public static void main(String[] args) {
		boolean valGreaterThanZero = true;
		boolean baseGreaterThanOne = true;
		int newBase = 0;
		int newLog = 0;
		while(valGreaterThanZero && baseGreaterThanOne){
			String base = JOptionPane.showInputDialog("Enter a base:");
			String log = JOptionPane.showInputDialog("Enter the value to calculate the logarithm:");
			newBase = Integer.parseInt(base);
			newLog = Integer.parseInt(log);
			if(newBase > 1) {
				baseGreaterThanOne = false;
			}
			if(newLog > 0) {
				valGreaterThanZero = false;
			}
			
		}
		int answer = floor(newBase, newLog);
		System.out.println(answer);

		}
		
		// TODO Auto-generated method stub

	public static int floor(int baseOfLog, int valOfLog) {
		int divisions = 0;
		while(valOfLog>=baseOfLog) {
			valOfLog = valOfLog/baseOfLog;
			divisions+=1;
		}
		return divisions;
	}

}
