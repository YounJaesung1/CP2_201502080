package star;

import java.util.Scanner;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int line; 
		int x;
		int y; 
		int blank; // ��ĭ
		int star=1; // ��
		
		System.out.print("��� �ٷ� ���� ����ұ��?: "); // �Է� �ȳ� ���
		x = input.nextInt();  
		
		if(x <= 0){ 
			x = 9;
		} // x�� 0���� ���� ����
		blank = x/2; // ���� �ʱⰪ ����
		
		for( line = 0; line < x; line++ ){
			if( line < x/2){ // ���� ���γѹ��� �Է¹��� ������ ���� 1/2���� ���� ���
				for ( int i = 0; i < blank; i++) {  
						System.out.print(" ");
					} // ��ĭ �� ��ŭ �ݺ�
				for(int j = 0; j < star; j++) {
					System.out.print("*");
				} // ���� �� ��ŭ �ݺ�
				blank = blank - 1; // ��ĭ�� �ϳ��� ����
				star = star + 2 ; // ���� �ΰ��� ����
			}		
			else { 
				for (int i = 0; i < blank; i++) {
					System.out.print(" "); //��ĭ �� ��ŭ �ݺ�
				}	
				for (int j = 0; j < star; j++) {
					System.out.print("*"); // ���� ����ŭ �ݺ�             
				}
				blank = blank + 1; // ��ĭ�� �ϳ��� ����
				star = star - 2; // ���� �ΰ��� ����
				}
		System.out.println();
		}
		}
}



	
		
			
			
		
		
		
	


	

		
		
		
	
