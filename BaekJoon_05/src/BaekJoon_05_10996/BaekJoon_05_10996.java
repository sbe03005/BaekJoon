package BaekJoon_05_10996;

import java.util.Scanner;

public class BaekJoon_05_10996 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j%2 == 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			for (int j = 0; j < n; j++) {
				if(j%2 == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
