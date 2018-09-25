package bankacoount;

public class BankAccountMain { // 출력 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("윤재성" , 300000, 0.1); //생성자를 BankAccount 클래스에서 불러옴 (계좌이름, 잔액,이자율)
		int money, month; 
		
		System.out.println("계좌 주인은 " +account.getName()+ " 이고, 잔액은" +account.getBalance()+ " 입니다. \n"); // 계좌이름,잔액, 이자율 출력
	
		money = 100000; 
		account.deposit(money); // 입금 메소드 
		System.out.println("계좌에 "+money+"원을 입금하여, 잔액이 "+account.getBalance()+"원이 되었습니다."); //입금 출력
		
		money = 100000;
		if (account.withdraw(money) < 0) {
			System.out.println("잔액이 부족합니다."); // 출금액이 잔액보다 많은경우 잔액 부족 오류 발생 
		}else {
			System.out.println("계좌에 "+money+"원을 출금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");	
		} // 이외의 경우 정상적으로 출금 출력
		
		money = 10000;
		month = 12;
		System.out.println("매월 "+money+"원씩 "+month+"개월 적금하면, 잔액이 "+account.installmentSavingPredict(money,month)+"원이 될것입니다."); //적금 출력
		
		money = 2000000;
		month = 24;
		System.out.println(money+"원을 "+month+"개월 정기 예금하면, 잔액이 "+account.fixedDepositPredict(money, month)+"원이 될것입니다."); //  정기 예금 출력
	}
}



