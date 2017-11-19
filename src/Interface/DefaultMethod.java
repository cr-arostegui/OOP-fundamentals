package Interface;
//Java 8

interface Drawable2{  
	void draw();  
	//default void msg(){System.out.println("default method");}  
}

class Rectangle2 implements Drawable2{  
	public void draw(){System.out.println("drawing rectangle");}  
}  

public class DefaultMethod {

	public static void main(String[] args) {
		Drawable d=new Rectangle();  
		d.draw();  
		//d.msg();
	}

}
