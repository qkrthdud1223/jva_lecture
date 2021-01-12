package test;

public class Login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] user = {"psy876", "1234" };
		
		String newId = "psy876";
		String newPW = "1234";
		
		if((newId == user[0]) && (newPW == user[1])) {
			System.out.println("Success!");
		}else {
			System.out.println("Fail!");
		}
	}

}
