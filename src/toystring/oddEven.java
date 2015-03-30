package toystring;
import java.util.Scanner;
public class oddEven {

	public static void main(String[] args) {
		Scanner numberscan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = numberscan.nextInt();
		if(num !=0){
			if(num%2==0){
				System.out.println(num +" is even");
			}
			else {
				System.out.println(num +" is odd");
			}
		}
		else{
			System.out.println("Number must not be 0");
		}
	}

}
