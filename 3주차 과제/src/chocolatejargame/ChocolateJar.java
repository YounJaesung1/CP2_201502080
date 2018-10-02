package chocolatejargame;

public class ChocolateJar implements Jar {

	private int chocolate;
	private int chilli;

	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}

	public ChocolateJar(int chocolate) {
		this.chocolate = chocolate;
		this.chilli = 1;
	}

	@Override
	public int getItem() {
		// TODO Auto-generated method stub
		return chocolate + chilli;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getChilli() {
		return chilli;
	}

	@Override
	public void takeItem(int hand) {
		// TODO Auto-generated method stub
		if (chocolate <= 0) { // ���ݸ��� 0�� ���� ���ų� ���� ���
			chilli = chilli - hand; // ĥ���� ����
		} 
		else {
			chocolate = chocolate - hand; // ���ݸ��� ����
			if (chocolate <= 0) { //���ݸ��� 0������ ���ų� ���� ���
				int left_hand = -chocolate; 
				chilli = chilli - left_hand; //ĥ���� ����
			}
		}
		
	}

	@Override
	public String status() {
		// TODO Auto-generated method stub
		String chilli_string = ""; // ĥ�� ����
		String chocolate_string = ""; // ���ݸ� ����
		for (int i = 0; i < this.getChilli(); i++) {
			chilli_string += "�� "; //ĥ�� ����
		}
		for (int i = 0; i < this.getChocolate(); i++) {
			chocolate_string += "�� "; // ���ݸ� ����
		}
		String status = "[ "+chilli_string + chocolate_string+"]";
		return status;

	}

	@Override
	public boolean isEmpty() { // �׾Ƹ� ���� �������� ������ �Ǵ�
		// TODO Auto-generated method stub
		if (chocolate <= 0 && chilli <= 0) { //�׾Ƹ� ���ο� �������� ���� ���
			return true;
		}
		return false;
	}

}
