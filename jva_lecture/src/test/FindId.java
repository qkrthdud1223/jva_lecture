package test;

public class FindId {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
      String [] user = {"psy876", "psy876@gmail.com","�ڼҿ�" };
      
      
//	      String id = "psy876";
      String email = "psy876@gmail.com";
      String name = "�ڼҿ�";
      
      if((email == user[1]) && (name == user[2] )) {
//	         System.out.println(" You just found out your Id.");
         System.out.print(" Your Id is " + user[0] + "�Դϴ�.");
//	         System.out.print(user[0]);
      }else {
         System.out.println("I can't find your Id.");
      }
   }
}
//psy876

//ps**76

