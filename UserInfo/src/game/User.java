package game;

import java.util.ArrayList;

public class User {
	private String userId; //아이디
	private String job; //직업
	
	private ArrayList<OffensePower> offensePowerList = new ArrayList<OffensePower>(); //유저 각각의 공격력
	
	public User(String userId, String job) {
		this.userId = userId;
		this.job = job;
	}
	
	public void addWeaponOffensePower(OffensePower offensepower) {
		offensePowerList.add(offensepower);
	}

	//getter, setter 메소드
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public ArrayList<OffensePower> getOffensePowerList() {
		return offensePowerList;
	}

	public void setOffensePowerList(ArrayList<OffensePower> offensePowerList) {
		this.offensePowerList = offensePowerList;
	}
	
	
}
