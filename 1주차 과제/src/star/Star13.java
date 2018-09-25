package star;

import java.util.Scanner;

public class Star13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int line; 
		int x;
		int y; 
		int blank; // 빈칸
		int star=1; // 별
		
		System.out.print("몇개의 줄로 별을 출력할까요?: "); // 입력 안내 출력
		x = input.nextInt();  
		
		if(x <= 0){ 
			x = 9;
		} // x가 0이하 인지 점검
		blank = x/2; // 변수 초기값 생성
		
		for( line = 0; line < x; line++ ){
			if( line < x/2){ // 현재 라인넘버가 입력받은 라인의 수의 1/2보다 작을 경우
				for ( int i = 0; i < blank; i++) {  
						System.out.print(" ");
					} // 빈칸 수 만큼 반복
				for(int j = 0; j < star; j++) {
					System.out.print("*");
				} // 별의 수 만큼 반복
				blank = blank - 1; // 빈칸이 하나씩 감소
				star = star + 2 ; // 별이 두개씩 증가
			}		
			else { 
				for (int i = 0; i < blank; i++) {
					System.out.print(" "); //빈칸 수 만큼 반복
				}	
				for (int j = 0; j < star; j++) {
					System.out.print("*"); // 별의 수만큼 반복             
				}
				blank = blank + 1; // 빈칸이 하나씩 감소
				star = star - 2; // 별이 두개씩 감소
				}
		System.out.println();
		}
		}
}



	
		
			
			
		
		
		
	


	

		
		
		
	
