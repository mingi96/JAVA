package game;

public class OffensePower {
	private String userId; // 아이디
	private Weapon weapon; // 무기
	private int weaponLevel; // 무기 레벨

	public OffensePower(String userId, Weapon weapon, int weaponLevel) {
		this.userId = userId;
		this.weapon = weapon;
		this.weaponLevel = weaponLevel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getWeaponLevel() {
		return weaponLevel;
	}

	public void setWeaponLevel(int weaponLevel) {
		this.weaponLevel = weaponLevel;
	}

	

	

}
