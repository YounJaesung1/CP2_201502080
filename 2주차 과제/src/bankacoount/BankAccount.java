package bankacoount;

import java.lang.Math;

public class BankAccount { // ������ Ŭ����
	private String name; // ���� �̸� 
	int fmoney; // �ܾ� 
	double plus; // ������
	
	public  BankAccount(String name, int fmoney , double plus) {
		this.name = name;	
		this.fmoney = fmoney;
		this.plus = plus;
	}
	
	public String getName() {
		return name; // �����̸� ����
		
		}
	public int getBalance() {
		return fmoney; // �ܾ� ����
	}
	public int deposit(int money) { // �Ա� �޼ҵ�
		// TODO Auto-generated method stub
		fmoney  = fmoney + money; // �Ա� �� �ܾ�
		return fmoney; // �ܾ� ����
	}
	public int withdraw(int money) { // ��� �޼ҵ�
		// TODO Auto-generated method stub
		if (fmoney < money) { // ��ݾ��� �ܾ׺��� Ŭ ��� 
			return -1; // ��ݾ��� �ܾ׺��� ũ�Ƿ� ���������� ����
		}
		fmoney = fmoney - money; //��� �� �ܾ�
		return fmoney; // �ܾ� ����
	}
	public int installmentSavingPredict(int money, int month) { // ���� �޼ҵ�
		int a = (int) (money* plus/12*(month*(month+1)/2) + money*month); // ���� ������ ���
		a += fmoney; // ������ ���� �� �ܾ�
		return a;	// �ܾ� ����	
}
	public int fixedDepositPredict(int money, int month) { // ���⿹�� �޼ҵ�
		double c = Math.pow((1+(plus/12)),month); // ���� ǥ��
		int b = (int) ((fmoney+money)*(c-1)); // �� ������ ���� ���� ������
		return b + fmoney + money;	// �ܾ� ����
	}
}
	
	