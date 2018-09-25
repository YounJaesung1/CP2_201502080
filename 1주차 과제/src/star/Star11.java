package star;

import java.util.Scanner;

public class Star11 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		int star = 1;
		
		System.out.print("몇개의 줄로 별을 출력할까요?:  ");
		x = sc.nextInt();
	
		if (x <= 0) {
			x=5;
		}
		
	for(int line = 0; line < x; line++ ) {
			
		for(int i = 0; i< star; i++) {
			System.out.print("*");
		}
		star = star + 1;	
		System.out.println();
	}
		
		

	}

}