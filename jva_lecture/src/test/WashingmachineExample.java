package test;

public class WashingmachineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Washingmachine w1 = new Washingmachine();
		
	
		System.out.println("����ȸ��:" + w1.company);
		System.out.println("�𵨸�:" + w1.model);
		System.out.println("---------------------");
		
		
		if(ps == 1) {
		 int result = w1.turnOn(); //����
		 
		 if(result == 1) {
			 w1.aaa("power on");
		 }else {
			 w1.aaa("call as center");
		 }
		
		 w1.choicewash(); //�ֹ���Ź, ����Ź 

		 //���µ�����
		
		 w1.settime(5);
		 
		 
		
		 boolean timeout = w1.lefttime();
		 
		 if(timeout) {	
			w1.run();
		 }
		
		System.out.println("---------");
		
		w1.settime2(5);
		
		boolean timeout2 = w1.lefttime2();  // �����ε� �� �� �𸣼̼� 
		if(timeout2) {	
			w1.run2();
		}
		
		
		//Ż��,����
		
		w1.turnOff();
		}

	}
}
