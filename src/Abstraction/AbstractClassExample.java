package Abstraction;

import java.util.Date;

abstract class Bank{
	private String currentDate;
	
	{
		this.currentDate = new Date().toString();
	}
	
	abstract int getRateOfInterest();
	
	String getCurrentDate() {
		return this.currentDate;
	}
}    
class SBI extends Bank{    
	int getRateOfInterest(){return 7;}    
}    
class PNB extends Bank{    
	int getRateOfInterest(){return 8;}    
}

public class AbstractClassExample {

	public static void main(String[] args) {
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
		System.out.println(b.getCurrentDate());
	}

}
