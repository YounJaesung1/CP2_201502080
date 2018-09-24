package bankaccount.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import bankacoount.BankAccount;

class BankAccountTest { // �׽�Ʈ Ŭ����

	@Test
	void testGetName() {
		BankAccount account = new BankAccount("���缺" , 300000, 0.1); 
		assertEquals("���缺", account.getName()); // ���� �̸��� "���缺" ���� ����
	}

	@Test
	void testGetBalance() {
		BankAccount account = new BankAccount("���缺" , 300000, 0.1);
		assertEquals(300000,account.getBalance()); // �ܾ��� 300000 ���� ����
	}

	@Test
	void testDeposit() {
		BankAccount account = new BankAccount("���缺" , 300000, 0.1); 
		int money = 100000; // �Ա� �ݾ�
		assertEquals(400000, account.deposit(money)); // 100000 �Ա� �� �ܾ��� 400000�� �´��� ����
	}

	@Test
	void testWithdraw() {
		BankAccount account = new BankAccount("���缺", 300000, 0.1);
		int money = 100000; //��� �ݾ�
		assertEquals(200000, account.withdraw(money)); // 100000��� �� �ܾ��� 200000�� �´��� ����
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount account = new BankAccount("���缺", 300000, 0.1);
		int money = 10000;
		int month = 12; 
		assertEquals(426500, account.installmentSavingPredict(money,month)); // �ſ� 10000���� 12�������� ���� �� ��� �ܾ��� 426500�� �Ǵ��� ����
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount account = new BankAccount("���缺", 300000, 0.1);
		int money = 10000;
		int month = 12;
		assertEquals(342461, account.fixedDepositPredict(money, month)); // �ſ� 10000���� 12�������� ���⿹�� �� ��� �ܾ��� 342461�� �Ǵ��� ����
	}

}
