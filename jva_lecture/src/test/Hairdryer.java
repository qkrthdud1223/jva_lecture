package test;

public class Hairdryer {
	
	String company = "유닉스";
	String model = "DRY1234";
	String hotwind = "뜨거운 바람";
	//String coldwind = "차가운 바람";	
	int level;
	int temperature ;
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int hotlevel() {
		return level;
	}
	
	void run() {
		for(int i=1; i<=3; i+=1 ) {
			level = i;
			System.out.println(level + "단계 입니다.");
		}
	}
	int hottem() {
		return temperature;
	}
	
	void run2() {
		for(int j=30; j<=70; j+=10) {
			temperature = j;
				if(temperature >=60) {
					System.out.println("현재 온도는" + temperature + "도 입니다. 곧 사용이 중지됩니다" );
				if(temperature >=70) {
					System.out.println("현재 온도는" + temperature + "도입니다. 사용을 중지합니다.");
					
				}
					
				}
			}
		
		
	}
	
}	
	
	
	
	
