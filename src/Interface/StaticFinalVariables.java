package Interface;
//Java 8

interface Drawable3{
	int var1 = 20;
	final int var2 = 30;
	static int var3 = 40;
	final static int var4 = 50;
	
	void draw();
	//static int cube(int x){return x*x*x;}  
}  
class Rectangle3 implements Drawable3{  
	public void draw(){System.out.println("drawing rectangle");}  
}

public class StaticFinalVariables {

	public static void main(String[] args) {
		Drawable d=new Rectangle();  
		d.draw();  
		//System.out.println(Drawable.cube(3));  
	}

}
