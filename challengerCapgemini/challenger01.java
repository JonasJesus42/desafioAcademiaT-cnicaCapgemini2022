package challengerCapgemini;

import java.util.Scanner;

public class challenger01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int n = 0;
		int coll = 1;
		int row = 1;
		int init = 0;
		
			
		System.out.print("n: ");
		n = input.nextInt();
		input.close();
		
		
		while(row <= n){
			coll = 1;
			while(coll <= n){
				init = n - row + 1;
				if(coll >= init){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				coll++;
			}
			System.out.print("\n");
			row++;
		}
		
	  }
}
