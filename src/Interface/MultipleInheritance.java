package Interface;

interface Printable{  
	void print();  
}  
interface Showable{  
	void show();  
}  

public class MultipleInheritance implements Printable, Showable {

	public void print() {
		System.out.println("Print called");
	}
	
	public void show() {
		System.out.println("Show called");
	}
	
	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();  
		obj.print();  
		obj.show();  
	}

}
