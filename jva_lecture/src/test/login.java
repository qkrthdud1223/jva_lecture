package test;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Login1 loign = new login();
			
			String getAccount = "young";
			String getPassword = "1234";
			int resultlogin = 0;
			resultlogin = ("young", 123);
				
	}
	
	public int newAccount(String id, String pw) {
			String[] db = {"young", "1234"};
			int result = 0;
			if (id == db[0] && pw == db[1] ) {
				result = 1;
			} else {
				result = 0;
			}
			return result; // 반환형 변수 또는 값
		}
	}


