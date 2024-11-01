package com.amalraj1.maventraining;


public class Fact {
	
	int number;
	int myfactorial;
	
	
	Fact(int number){
		this.number =number;

		
	}
	
	
	public int numFactorial() {
		 int myfactorial = 1;
	        for (int i = 1; i <= number; i++) {
	            myfactorial *= i;
	        }
	        return myfactorial;		
	}
void display() {
	int result= numFactorial();
	
	System.out.println(result);
		
}
public static void main(String[] args) {
	
	Fact f1= new Fact(5);
	f1.display();
	

}
}
