package saw243_lab7;
import java.util.Scanner;
import java.util.Random;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("how many items will be entered"); 
		int a = sc.nextInt();
		double[] myArray = new double[a];
		Random rd = new Random(); // creating Random object
	    for (int i = 0; i < myArray.length; i++) {
	       myArray[i] = rd.nextDouble(1000); // storing random integers in an array
	    }
	    
	    System.out.println();
	    System.out.println(max(myArray));
	    System.out.println(min(myArray));
	    System.out.println(sum(myArray));
	    System.out.println(ave(myArray));
	    
	    sc.close();
	}
	public static double max(double [] data) {
		double maxVal = 0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]>maxVal) {
				maxVal = data[i];
			}
		}
		return maxVal;
	}
	public static double min(double [] data) {
		double minVal = 0;
		for(int i=0;i<data.length;i++)
		{
			if(minVal == 0) {
				minVal = data[i];
			}
			if(data[i]<minVal) {
				minVal = data[i];
			}
		}
		return minVal;
	}
	public static double sum(double [] data) {
		double sum = 0;
		for(int i=0;i<data.length;i++)
		{
			sum += data[i];
		}
		return sum;
	}
	public static double ave(double [] data) {
		double aveSum = sum(data);
		double average = aveSum/data.length;
		return average;
		
	}

}
