package quiz;

public class Q6_22_Account {
	public class Account {
		public static final int MIN_BALANCE = 0;
		public static final int MAX_BALANCE = 1000000;
		private int balance;

		public int getBalance() {
			return balance;
		}
		
		public void setBalance(int balance) {
			
			//0~100사이가 아닌 잔고가 매개변수로 들어오면 메소드를 끝낸다.
			if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
				return;
			}
			
			this.balance = balance;
		}

	}
}