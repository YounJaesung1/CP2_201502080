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
		if (chocolate <= 0) { // 초콜릿이 0개 보다 적거나 같을 경우
			chilli = chilli - hand; // 칠리를 뽑음
		} 
		else {
			chocolate = chocolate - hand; // 초콜릿을 뽑음
			if (chocolate <= 0) { //초콜릿이 0개보다 적거나 같을 경우
				int left_hand = -chocolate; 
				chilli = chilli - left_hand; //칠리를 뽑음
			}
		}
		
	}

	@Override
	public String status() {
		// TODO Auto-generated method stub
		String chilli_string = ""; // 칠리 상태
		String chocolate_string = ""; // 초콜릿 상태
		for (int i = 0; i < this.getChilli(); i++) {
			chilli_string += "■ "; //칠리 개수
		}
		for (int i = 0; i < this.getChocolate(); i++) {
			chocolate_string += "□ "; // 초콜릿 개수
		}
		String status = "[ "+chilli_string + chocolate_string+"]";
		return status;

	}

	@Override
	public boolean isEmpty() { // 항아리 내부 아이템이 없는지 판단
		// TODO Auto-generated method stub
		if (chocolate <= 0 && chilli <= 0) { //항아리 내부에 아이템이 없을 경우
			return true;
		}
		return false;
	}

}
