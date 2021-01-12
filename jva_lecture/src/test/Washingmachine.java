package test;

public class Washingmachine {
	String company = "LG";
	String model = "DRUM1234";
	String wash = "세탁";
	String rinse ="헹굼";
	//String spin = "탈수";
	//String dry = "건조";
	
	int time;
	int watertem;

	// 생성자 만들어 본다.
	
	
	public void aaa(String str) {
		System.out.println(str);
	}
	
	public int turnOn() {
		// 본연의 기능 수행
		
		// 그리고 아쉬워서 상태 출력
		aaa("Power on!!!")
		return 1;
	}
	
	
	public int randomnum() {
		int eee = (int)(Math.random()*2) + 1;
		return eee;
	}
	
	
	pulic todo() {
		asdfasdf
	}
	
	public void choicewash(eee) {
		  
		switch(eee) {
			case 1:
				aaa("애벌세탁을 시작합니다.");
	//			System.out.println("애벌세탁을 시작합니다.");
				break;
				
			case 2:
				System.out.println("본세탁을을 시작합니다.");
				break;
			
			default:
	//			pass
				break;
			}
		}
	
	public void setwater(int watertem) {
		this.watertem = watertem;
	}
	public void watertem() {
		for(int i=40; i>=90; i+=10 );
		System.out.println("물온도를 설정해주세요. :");
		
		
	
		
	}
	
	public void settime(int time) {
		this.time = time;
	}
		public boolean lefttime() {
			if(time==0) {
				System.out.println(wash + "중 문을 열 수 없습니다.");
				return false;
			}
			System.out.println(wash + "을 시작합니다");
			return true;
		}
	public void run() {
		while(true) {
			if(time>0) {
				System.out.println(time + "분 남았습니다");
				time -= 1;
			}else {
				System.out.println(wash + "이 완료되었습니다");
				return;
			}
		}
	}

	
	public void settime2(int time) {
		this.time = time;
	}
		public boolean lefttime2() {
			if(time==0) {
				System.out.println(rinse + " 중 문을 열 수 없습니다.");
				return false;
			}
			System.out.println(rinse + "을 시작합니다");
			return true;
		}
	
		public void run2() {
		while(true) {
			if(time>0) {
				System.out.println(time + "분 남았습니다");
				time -= 1;
			}else {
				System.out.println(rinse+ "이 완료되었습니다");
				return;
			}
		}
	}
	public void turnOff() {
		System.out.println("전원을 종료합니다.");
		}
	
	}




