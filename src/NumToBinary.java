import java.util.Scanner;

public class NumToBinary {

	public static void main(String[] args) {
		int i, j, hex = 1, lastDigit, num, count = 0, sum = 0;
		String num1;
		int[] arr = new int[300];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		sc.close();
		
		num1 =Integer.toString(num);
		hex = 1;
		
		for(i = 0; i < num1.length(); i++) {
			lastDigit = num % 10;
			num = num / 10;
			for(j = 0; j < lastDigit; j++) {
				arr[count] = hex;
				count++;
			}
			hex  = hex * 10;
		}
		
		for(i = 0; i < count; i++) {
			System.out.print(arr[i]+" \t");
			sum = sum + arr[i];
		}
		System.out.println("\nSum = " + sum);

	}

}
