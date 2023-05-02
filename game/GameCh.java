package game;

public class GameCh {

	int hp = 10;
	int lv = 50;
	int exp = 10;
	String[] boss;
	
	void hp(int hp) {
		this.hp = hp;
	}
	
	boolean isLeftHp() {
		if (hp == 0) {
			System.out.println("체력이 부족합니다.");
			return false;
		}
		
		System.out.println("체력이 충분합니다.");
		return true;
	}
	
	void bossSelect() {
		if(lv < 50) {
			System.out.println("valtan");
		} else {
			System.out.println("vykas");
		}
	}
	
	void fightReady() {
		System.out.println("선택완료");
		System.out.println("전투를 시작합니다.");
	}
	
	void fight() {
		while(true) {
			if(hp > 0) {
				System.out.println("공격합니다. hp잔량: " + hp);
				hp -= 1;
			} else {
				System.out.println("후퇴합니다. hp잔량: " + hp);
				return;
			}
		}
	}
	
	boolean LeftHpZero() {
		if (hp == 0) {
			System.out.println("hp를 회복하세요.");
			return false;
		}
		
		System.out.println("체력이 충분합니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(hp < 10) {
				System.out.println("회복합니다. hp잔량: " + hp);
				hp += 1;
			} else {
				System.out.println("회복완료 hp잔량: " + hp);
				return;
			}
		}
	}
	
	boolean victory() {
		if(lv < 50) {
		System.out.println("보스처치 경험치 10증가");
		} else {
			System.out.println("보스처치 경험치 5증가");
		}
		return false;
	}
	
}