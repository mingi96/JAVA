package game;

import java.util.ArrayList;

public class OffensePower {
	private int userId; //아이디
	private Weapon weapon; //무기
	private int rankingPoint; //랭킹 점수
	
	public OffensePower(int userId, Weapon weapon, int rankingPoint) {
		this.userId = userId;
		this.weapon = weapon;
		this.rankingPoint = rankingPoint;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getRankingPoint() {
		return rankingPoint;
	}

	public void setRankingPoint(int rankingPoint) {
		this.rankingPoint = rankingPoint;
	}

	
	
	
}
