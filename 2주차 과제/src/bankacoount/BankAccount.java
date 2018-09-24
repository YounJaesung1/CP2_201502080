package bankacoount;

import java.lang.Math;

public class BankAccount { // 생성자 클래스
	private String name; // 계좌 이름 
	int fmoney; // 잔액 
	double plus; // 이자율
	
	public  BankAccount(String name, int fmoney , double plus) {
		this.name = name;	
		this.fmoney = fmoney;
		this.plus = plus;
	}
	
	public String getName() {
		return name; // 계좌이름 리턴
		
		}
	public int getBalance() {
		return fmoney; // 잔액 리턴
	}
	public int deposit(int money) { // 입금 메소드
		// TODO Auto-generated method stub
		fmoney  = fmoney + money; // 입금 후 잔액
		return fmoney; // 잔액 리턴
	}
	public int withdraw(int money) { // 출금 메소드
		// TODO Auto-generated method stub
		if (fmoney < money) { // 출금액이 잔액보다 클 경우 
			return -1; // 출금액이 잔액보다 크므로 음수값으로 리턴
		}
		fmoney = fmoney - money; //출금 후 잔액
		return fmoney; // 잔액 리턴
	}
	public int installmentSavingPredict(int money, int month) { // 적금 메소드
		int a = (int) (money* plus/12*(month*(month+1)/2) + money*month); // 적금 원리금 계산
		a += fmoney; // 적금을 넣은 후 잔액
		return a;	// 잔액 리턴	
}
	public int fixedDepositPredict(int money, int month) { // 정기예금 메소드
		double c = Math.pow((1+(plus/12)),month); // 제곱 표현
		int b = (int) ((fmoney+money)*(c-1)); // 월 복리식 정기 예금 총이자
		return b + fmoney + money;	// 잔액 리턴
	}
}
	
	