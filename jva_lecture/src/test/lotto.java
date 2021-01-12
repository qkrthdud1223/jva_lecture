package test;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		
		for(int i = 0; i<6; i++ ) {
			lotto[i] = (int) (Math.random() * 45) +1 ;
		}
		for(int i = 0; i<lotto.length; i++ ) {
		System.out.println(lotto[i]);
		}
	}

}
