package test;

public class Washingmachine {
	String company = "LG";
	String model = "DRUM1234";
	String wash = "��Ź";
	String rinse ="���";
	//String spin = "Ż��";
	//String dry = "����";
	
	int time;
	int watertem;

	// ������ ����� ����.
	
	
	public void aaa(String str) {
		System.out.println(str);
	}
	
	public int turnOn() {
		// ������ ��� ����
		
		// �׸��� �ƽ����� ���� ���
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
				aaa("�ֹ���Ź�� �����մϴ�.");
	//			System.out.println("�ֹ���Ź�� �����մϴ�.");
				break;
				
			case 2:
				System.out.println("����Ź���� �����մϴ�.");
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
		System.out.println("���µ��� �������ּ���. :");
		
		
	
		
	}
	
	public void settime(int time) {
		this.time = time;
	}
		public boolean lefttime() {
			if(time==0) {
				System.out.println(wash + "�� ���� �� �� �����ϴ�.");
				return false;
			}
			System.out.println(wash + "�� �����մϴ�");
			return true;
		}
	public void run() {
		while(true) {
			if(time>0) {
				System.out.println(time + "�� ���ҽ��ϴ�");
				time -= 1;
			}else {
				System.out.println(wash + "�� �Ϸ�Ǿ����ϴ�");
				return;
			}
		}
	}

	
	public void settime2(int time) {
		this.time = time;
	}
		public boolean lefttime2() {
			if(time==0) {
				System.out.println(rinse + " �� ���� �� �� �����ϴ�.");
				return false;
			}
			System.out.println(rinse + "�� �����մϴ�");
			return true;
		}
	
		public void run2() {
		while(true) {
			if(time>0) {
				System.out.println(time + "�� ���ҽ��ϴ�");
				time -= 1;
			}else {
				System.out.println(rinse+ "�� �Ϸ�Ǿ����ϴ�");
				return;
			}
		}
	}
	public void turnOff() {
		System.out.println("������ �����մϴ�.");
		}
	
	}




