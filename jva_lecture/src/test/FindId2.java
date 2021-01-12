package test;

public class FindId2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String [] user = {"psy876", "psy876@gmail.com","박소영" };
	      
	      

      String email = "psy876@gmail.com";
      String name = "박소영";
      
      if((email == user[1]) && (name == user[2] )) {
    	 System.out.print(" 당신의 아이디는 " + user[0] + "입니다.");
    			  
    	 

      }else {
         System.out.println("정보가 없습니다.");
         
         
      }
   }
}
	

