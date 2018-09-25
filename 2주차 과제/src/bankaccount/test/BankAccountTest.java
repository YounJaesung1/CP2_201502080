package bankaccount.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bankacoount.BankAccount;

class BankAccountTest { // 테스트 클래스

	@Test
	void testGetName() {
		BankAccount account = new BankAccount("윤재성" , 300000, 0.1); 
		assertEquals("윤재성", account.getName()); // 계좌 이름이 "윤재성" 인지 점검
	}

	@Test
	void testGetBalance() {
		BankAccount account = new BankAccount("윤재성" , 300000, 0.1);
		assertEquals(300000,account.getBalance()); // 잔액이 300000 인지 점검
	}

	@Test
	void testDeposit() {
		BankAccount account = new BankAccount("윤재성" , 300000, 0.1); 
		int money = 100000; // 입금 금액
		assertEquals(400000, account.deposit(money)); // 100000 입금 후 잔액이 400000이 맞는지 점검
	}

	@Test
	void testWithdraw() {
		BankAccount account = new BankAccount("윤재성", 300000, 0.1);
		int money = 100000; //출금 금액
		assertEquals(200000, account.withdraw(money)); // 100000출금 후 잔액이 200000이 맞는지 점검
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount account = new BankAccount("윤재성", 300000, 0.1);
		int money = 10000;
		int month = 12; 
		assertEquals(426500, account.installmentSavingPredict(money,month)); // 매월 10000원씩 12개월동안 적금 할 경우 잔액이 426500이 되는지 점검
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount account = new BankAccount("윤재성", 300000, 0.1);
		int money = 10000;
		int month = 12;
		assertEquals(342461, account.fixedDepositPredict(money, month)); // 매월 10000원씩 12개월동안 정기예금 할 경우 잔액이 342461이 되는지 점검
	}

}
