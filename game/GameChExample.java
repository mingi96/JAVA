package game;

public class GameChExample {

	public static void main(String[] args) {
		String[] boss = {"valtan", "vykas"};
		GameCh myChar = new GameCh();
		
		if(myChar.isLeftHp()) {

			System.out.println("상대를 선택하세요.");
			myChar.bossSelect();
		}
		
		myChar.fightReady();
	
		myChar.fight();
		
		myChar.LeftHpZero();
		
		myChar.run();
		
		System.out.println("다시 전투를 시작합니다.");
		
		myChar.victory();
		
		
		
	}

}
