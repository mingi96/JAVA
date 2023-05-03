package ch08.sec02;

public class Television implements RemoteControl {
	//필드
	private int volume;
	
	// 중요. 추상메소드는 반드시 오버라이드해서 구현을 해야한다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 볼륨의 크기를 0~10 사이를 유지시킴
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 TV 볼륨: " + volume);
	}

}
