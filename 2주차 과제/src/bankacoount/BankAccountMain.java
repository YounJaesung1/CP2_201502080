package bankacoount;

public class BankAccountMain { // ��� Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("���缺" , 300000, 0.1); //�����ڸ� BankAccount Ŭ�������� �ҷ��� (�����̸�, �ܾ�,������)
		int money, month; 
		
		System.out.println("���� ������ " +account.getName()+ " �̰�, �ܾ���" +account.getBalance()+ " �Դϴ�. \n"); // �����̸�,�ܾ�, ������ ���
	
		money = 100000; 
		account.deposit(money); // �Ա� �޼ҵ� 
		System.out.println("���¿� "+money+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�."); //�Ա� ���
		
		money = 100000;
		if (account.withdraw(money) < 0) {
			System.out.println("�ܾ��� �����մϴ�."); // ��ݾ��� �ܾ׺��� ������� �ܾ� ���� ���� �߻� 
		}else {
			System.out.println("���¿� "+money+"���� ����Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");	
		} // �̿��� ��� ���������� ��� ���
		
		money = 10000;
		month = 12;
		System.out.println("�ſ� "+money+"���� "+month+"���� �����ϸ�, �ܾ��� "+account.installmentSavingPredict(money,month)+"���� �ɰ��Դϴ�."); //���� ���
		
		money = 2000000;
		month = 24;
		System.out.println(money+"���� "+month+"���� ���� �����ϸ�, �ܾ��� "+account.fixedDepositPredict(money, month)+"���� �ɰ��Դϴ�."); //  ���� ���� ���
	}
}



