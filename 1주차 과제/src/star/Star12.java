package star;

import java.util.Scanner;

public class Star12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y;
		
		System.out.print("��� �ٷ� ���� ����ұ��?:  ");
		y = input.nextInt();
		
		if (y <= 0) {
			y=5;
		}
		for (int i = y; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
		
		