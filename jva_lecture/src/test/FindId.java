package test;

public class FindId {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
      String [] user = {"psy876", "psy876@gmail.com","박소영" };
      
      
//	      String id = "psy876";
      String email = "psy876@gmail.com";
      String name = "박소영";
      
      if((email == user[1]) && (name == user[2] )) {
//	         System.out.println(" You just found out your Id.");
         System.out.print(" Your Id is " + user[0] + "입니다.");
//	         System.out.print(user[0]);
      }else {
         System.out.println("I can't find your Id.");
      }
   }
}
//psy876

//ps**76

