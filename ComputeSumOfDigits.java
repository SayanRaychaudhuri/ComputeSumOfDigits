import java.util.*;
public class ComputeSumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Type an integer: ");
		int number = input.nextInt();
        int sum = 0;
        for (int i=1;i<11;i++){
		int places = number % (int)Math.pow(10, i) / (int)Math.pow(10,i-1);
        sum+=places;
        }
        System.out.println("Digit sum is " + sum);
        main(null);
        }

}
