package game;

import java.util.ArrayList;

public class Weapon {
	private String weaponName; //무기 이름
	private int weaponLevel; //무기 레벨
	private ArrayList<User> userList = new ArrayList<>(); //무기를 가지고 있는 유저 리스트
	
	public Weapon(String weaponName, int weaponLevel) {
		this.weaponName = weaponName;
		this.weaponLevel = weaponLevel;
	}
	
	//각각의 무기를 보유중인 유저
	public void register(User user) {
		userList.add(user);
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getWeaponLevel() {
		return weaponLevel;
	}

	public void setWeaponLevel(int weaponLevel) {
		this.weaponLevel = weaponLevel;
	}

	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
	
	
}
