package com.urdomain.ch07;

public class SupersonicAirplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			//Airplane ��ü�� fly() �޼ҵ� ȣ��
			super.fly();
		}
	}
}
