class Parent1{
	void Disp() {
		System.out.println("Inside Parent class");
	}
}
interface Parent2{
	void Disp1(); 
	
}
class Chield extends Parent1 implements Parent2
{
	void Disp2() {
		System.out.println("Inside Chield Class");
	}
	public void Disp1() {
		System.out.println("Inside Chield interface");
	}
	Chield(){
		System.out.println("Inside Chiel Constructor");
	}
}

public class Interface_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chield c=new Chield();
		c.Disp();
		c.Disp1();
		c.Disp2();

	}

}
