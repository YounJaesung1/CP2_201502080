package chocolatejargame;

import java.util.Random;
import java.util.Scanner;

public class ChocolateJarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChocolateJar chocolateJar = new ChocolateJar(); //������Ŭ�������� �����ڸ� �ҷ���
		Scanner sc = new Scanner(System.in); // ȭ�鿡�� ���� ���� �Է� �ϱ� ���� ���
		int n = 1; // ���� Ƚ��
		int maxtake, take; // ��ǻ�Ͱ� �̱� ���� ����
		int x; // ���ݸ��� ������ ���� �Է°�

		System.out.println("������ �����մϴ�."); 
		System.out.println("�׾Ƹ����� 14���� �������� �ֽ��ϴ�.");
		System.out.println("[ �� �� �� �� �� �� �� �� �� �� �� �� �� �� ]");
		System.out.println("1~3���� �������� ���� �� ������ ĥ���� ������ �й��մϴ�.");
		System.out.println("���� !!");
		// �׾Ƹ� ���� �� ���� �� ����

		while (chocolateJar.isEmpty() == false) { // while���� �̿��� �׾Ƹ��� �� �� ���� ���� ����
			System.out.println("+------ " + n + "��° ��! ------+"); 
			System.out.print("�� ���� �������?(1~3)  "); 
			x = sc.nextInt(); // ���ݸ��� ������ ���� �Է°�
			if (x > 0 && x <= 3) { //���ݸ��� 1~3�� �� �Է�
				chocolateJar.takeItem(x); // ���ݸ��� x����ŭ ����
				System.out.println("�÷��̾�� " + x + "���� ���ݸ��� ���½��ϴ�. ");
				System.out.println(chocolateJar.status()); //���ݸ��� ������ ���� �׾Ƹ� ���� 
				if (chocolateJar.getChocolate() == 0 && chocolateJar.getChilli() == 1) {
					System.out.println("�÷��̾� �¸�!"); // �÷��̾ ���ݸ��� ������  �׾Ƹ��� ���ݸ��� 0���̰� ĥ���� 1���̸� �÷��̾� �¸�
					break; //���� ����
				}
				if (chocolateJar.getChilli() <= 0) { // ���� �� �÷��̾ ĥ���� �̾�����
					System.out.println("��ǻ�� �¸�!"); 
					break; //���� ����
				}
				
				maxtake = Math.min(3, chocolateJar.getItem() - 1);
				Random random = new Random();
				take = random.nextInt(1000) % maxtake % 3 + 1; //��ǻ�Ͱ� ���� ���� ���� �ڵ�
				chocolateJar.takeItem(take); // ��ǻ�Ͱ� �̴� ����
				System.out.println("��ǻ�ʹ� " + take + "���� ���ݸ��� ���½��ϴ�.");
				System.out.println(chocolateJar.status()); //���ݸ��� ������ ���� �׾Ƹ� ����
				
				if (chocolateJar.getChocolate() == 0 && chocolateJar.getChilli() == 1) {
					System.out.println("��ǻ�� �¸�!"); //��ǻ�Ͱ� ���ݸ��� ������  �׾Ƹ��� ���ݸ��� 0���̰� ĥ���� 1���̸� ��ǻ�� �¸�
					break; //���� ����`
				}
				if (chocolateJar.getChilli() <= 0) { //���� �� ��ǻ�Ͱ� ĥ���� �̾��� ��
					System.out.println("�÷��̾� �¸�!");
					break; //���� ����
				}
			}

			n = n + 1; // n������ n+1�� �������� �Ѿ

		}
	}
}
