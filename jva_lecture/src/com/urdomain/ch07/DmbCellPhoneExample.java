package com.urdomain.ch07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü����
		DmbCellPhone dmbCellPhone = new DmbCellPhone ("�ڹ���", "����", 10);
		
		//CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��" + dmbCellPhone.model);
		System.out.println("����" + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä��" + dmbCellPhone.channel);
		
		//CellPhone���κ�ó ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		//DmbCellPHone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel1Dmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
