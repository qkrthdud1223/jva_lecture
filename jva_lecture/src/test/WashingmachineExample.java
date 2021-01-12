package test;

public class WashingmachineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Washingmachine w1 = new Washingmachine();
		
	
		System.out.println("제작회사:" + w1.company);
		System.out.println("모델명:" + w1.model);
		System.out.println("---------------------");
		
		
		if(ps == 1) {
		 int result = w1.turnOn(); //전원
		 
		 if(result == 1) {
			 w1.aaa("power on");
		 }else {
			 w1.aaa("call as center");
		 }
		
		 w1.choicewash(); //애벌세탁, 본세탁 

		 //물온도설정
		
		 w1.settime(5);
		 
		 
		
		 boolean timeout = w1.lefttime();
		 
		 if(timeout) {	
			w1.run();
		 }
		
		System.out.println("---------");
		
		w1.settime2(5);
		
		boolean timeout2 = w1.lefttime2();  // 오버로드 를 잘 모르셨서 
		if(timeout2) {	
			w1.run2();
		}
		
		
		//탈수,건조
		
		w1.turnOff();
		}

	}
}
