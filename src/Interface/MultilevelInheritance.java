package Interface;

interface Printable2 {  
	void print();  
}  
interface Showable2 extends Printable2 {  
	void show();  
}

public class MultilevelInheritance implements Showable2 {

	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}
	
	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();  
		obj.print();  
		obj.show(); 
	}

}
