package game;

import java.util.ArrayList;

public class Game {
	//내부에 school 객체를 생성해준다.
	private static Game instance = new Game();
	
	private static String GAME_NAME = "Ezen Game"; //게임 이름
	private  ArrayList<User> userList = new ArrayList<>(); //게임에 가입한 유저
	private ArrayList<Weapon> weaponList = new ArrayList<>(); //게임에 등록된 무기
	
	private Game() {}
	
	public static Game getInstance() {
		if(instance == null) {
			instance = new Game();
		}
		return instance;
	}
	
	//가입한 유저
	public void addUser(User user) {
		userList.add(user);
	}
	
	//유저 리스트 출력
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	//무기 등록
	public void addRanking(Weapon ranking) {
		weaponList.add(ranking);
	}
	
	//무기 리스트 출력
	public ArrayList<Weapon> getRankingList() {
		return weaponList;
	}
}
