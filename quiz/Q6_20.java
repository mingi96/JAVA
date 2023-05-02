package quiz;

public class Q6_20 {
	public static boolean isNumber(String str) {
		//null이거나 빈문자열 이면 false 반환
		if(str == null || str.equals(""))
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			//System.out.println(ch);
			if(ch < '0' || ch > '9') { //ch가 0~9사이의 숫자가 아니면
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

}
