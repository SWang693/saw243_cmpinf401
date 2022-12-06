package saw243_lab10;
import java.util.Random;
public class recursionSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(-123));
		int[] array = {1,2,3,4,5};		
		printArrayElements(array, 0);
	}
	public static int sumOfDigits(int x) {
		if(x < 0) {
			x *= -1;
			return x%10 + sumOfDigits(x/10);
		}
		if(x != 0) {
			return x%10 + sumOfDigits(x/10);
		}
		return 0;
	}
	public static void printArrayElements(int[] a, int index) {
		if(a.length == index) {
			return;
		}
		System.out.println(a[index]);
		printArrayElements(a, index+1);
	}
	

}
