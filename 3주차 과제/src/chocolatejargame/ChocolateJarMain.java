package chocolatejargame;

import java.util.Random;
import java.util.Scanner;

public class ChocolateJarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocolateJar chocolateJar = new ChocolateJar(); //생성자클래스에서 생성자를 불러옴
		Scanner sc = new Scanner(System.in); // 화면에서 뽑을 개수 입력 하기 위해 사용
		int n = 1; // 시행 횟수
		int maxtake, take; // 컴퓨터가 뽑기 위한 변수
		int x; // 초콜릿을 꺼내기 위한 입력값

		System.out.println("게임을 시작합니다."); 
		System.out.println("항아리에는 14개의 아이템이 있습니다.");
		System.out.println("[ ■ □ □ □ □ □ □ □ □ □ □ □ □ □ ]");
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.");
		System.out.println("시작 !!");
		// 항아리 상태 및 게임 룰 설명

		while (chocolateJar.isEmpty() == false) { // while문을 이용해 항아리가 빌 때 까지 게임 진행
			System.out.println("+------ " + n + "번째 턴! ------+"); 
			System.out.print("몇 개를 뽑을까요?(1~3)  "); 
			x = sc.nextInt(); // 초콜릿을 꺼내기 위한 입력값
			if (x > 0 && x <= 3) { //초콜릿을 1~3개 만 입력
				chocolateJar.takeItem(x); // 초콜릿을 x개만큼 꺼냄
				System.out.println("플레이어는 " + x + "개의 초콜릿을 꺼냈습니다. ");
				System.out.println(chocolateJar.status()); //초콜릿을 꺼냄에 따른 항아리 상태 
				if (chocolateJar.getChocolate() == 0 && chocolateJar.getChilli() == 1) {
					System.out.println("플레이어 승리!"); // 플레이어가 초콜릿을 꺼내고  항아리에 초콜릿이 0개이고 칠리가 1개이면 플레이어 승리
					break; //시행 종료
				}
				if (chocolateJar.getChilli() <= 0) { // 게임 중 플레이어가 칠리를 뽑았을때
					System.out.println("컴퓨터 승리!"); 
					break; //시행 종료
				}
				
				maxtake = Math.min(3, chocolateJar.getItem() - 1);
				Random random = new Random();
				take = random.nextInt(1000) % maxtake % 3 + 1; //컴퓨터가 뽑을 수를 정할 코드
				chocolateJar.takeItem(take); // 컴퓨터가 뽑는 개수
				System.out.println("컴퓨터는 " + take + "개의 초콜릿을 꺼냈습니다.");
				System.out.println(chocolateJar.status()); //초콜릿을 꺼냄에 따른 항아리 상태
				
				if (chocolateJar.getChocolate() == 0 && chocolateJar.getChilli() == 1) {
					System.out.println("컴퓨터 승리!"); //컴퓨터가 초콜릿을 꺼내고  항아리에 초콜릿이 0개이고 칠리가 1개이면 컴퓨터 승리
					break; //시행 종료`
				}
				if (chocolateJar.getChilli() <= 0) { //게임 중 컴퓨터가 칠리를 뽑았을 때
					System.out.println("플레이어 승리!");
					break; //시행 종료
				}
			}

			n = n + 1; // n번에서 n+1번 시행으로 넘어감

		}
	}
}
