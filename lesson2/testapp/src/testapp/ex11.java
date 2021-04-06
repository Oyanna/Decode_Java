package testapp;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ведите число : ");
		int num = in.nextInt();
		
		System.out.printf("Инкремент введенного числа : %d", ++num);
			
	}

}
