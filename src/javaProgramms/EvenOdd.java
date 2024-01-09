package javaProgramms;

public class EvenOdd {
	
	//To check a given number is odd or even
	
	public void checkEvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Its a even number");
		}else {
			System.out.println("Its a odd number");
		}
		
		
	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		
		e.checkEvenOdd(40);
		
		// TODO Auto-generated method stub

	}

}
