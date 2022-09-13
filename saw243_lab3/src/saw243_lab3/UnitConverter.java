package saw243_lab3;
import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input a distance or a weight amount");
		System.out.println(input + " = " + convertNumber(input));
		// TODO Auto-generated method stub

	}
	public static String convertNumber(String input) {
		String result = "";
		String[] arrOfStr = input.split(" ");
		double preconverted = Double.parseDouble(arrOfStr[0]);
		if(arrOfStr[1].equals("cm")) {															
			preconverted *= 0.393701;
			String converted = Double.toString(preconverted);
			String inches = " in";
			result = converted + inches;
		}
		else if(arrOfStr[1].equals("in")) {															
			preconverted *= 2.54;
			String converted = Double.toString(preconverted);
			String newUnit = " cm";
			result = converted + newUnit;
		}
		else if(arrOfStr[1].equals("yd")) {															
			preconverted *= 0.9144;
			String converted = Double.toString(preconverted);
			String newUnit = " m";
			result = converted + newUnit;
		}
		else if(arrOfStr[1].equals("m")) {															
			preconverted *= 1.0936133;
			String converted = Double.toString(preconverted);
			String newUnit = " yd";
			result = converted + newUnit;
		}
		else if(arrOfStr[1].equals("oz")) {															
			preconverted *= 28.3495231;
			String converted = Double.toString(preconverted);
			String newUnit = " gm";
			result = converted + newUnit;
		}
		else if(arrOfStr[1].equals("gm")) {															
			preconverted *= 0.03527396;
			String converted = Double.toString(preconverted);
			String newUnit = " oz";
			result = converted + newUnit;
		}
		else if(arrOfStr[1].equals("lb")) {															
			preconverted *= 0.45359237;
			String converted = Double.toString(preconverted);
			String newUnit = " kg";
			result = converted + newUnit;
		}
		else{															
			preconverted *= 2.20462262;
			String converted = Double.toString(preconverted);
			String newUnit = " lb";
			result = converted + newUnit;
		}
		return result;
	}

}
