package test;

public class Hairdryer {
	
	String company = "���н�";
	String model = "DRY1234";
	String hotwind = "�߰ſ� �ٶ�";
	//String coldwind = "������ �ٶ�";	
	int level;
	int temperature ;
	
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	int hotlevel() {
		return level;
	}
	
	void run() {
		for(int i=1; i<=3; i+=1 ) {
			level = i;
			System.out.println(level + "�ܰ� �Դϴ�.");
		}
	}
	int hottem() {
		return temperature;
	}
	
	void run2() {
		for(int j=30; j<=70; j+=10) {
			temperature = j;
				if(temperature >=60) {
					System.out.println("���� �µ���" + temperature + "�� �Դϴ�. �� ����� �����˴ϴ�" );
				if(temperature >=70) {
					System.out.println("���� �µ���" + temperature + "���Դϴ�. ����� �����մϴ�.");
					
				}
					
				}
			}
		
		
	}
	
}	
	
	
	
	
