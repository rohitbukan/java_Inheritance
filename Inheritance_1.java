class Base{
	void disp() {
		System.out.println("In Base class Display");
	}
	Base(){
		System.out.println("In Base class Constructor");
	}
	
}
class Chield extends Base{
	void disp0() {
	System.out.println("In Base chield Display");
	}
	Chield(){
		System.out.println("In Chield class Constructor");
	}
	
}
class Chield_1 extends Chield{
	void disp1() {
		
	System.out.println("In Chield_1 class Display");
	}
	Chield_1(){
		System.out.println("In Chield_1class Constructor");
	}
	
}
class Chield_2 extends Chield_1{
	void disp2() {
	System.out.println("In Chield_2 class Display");
	}
	Chield_2(){
		System.out.println("In Chield_2 class Constructor");
	}
	
}
public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chield_2 c1=new Chield_2();
		c1.disp();
		c1.disp0();
		c1.disp1();
		c1.disp2();

	}

}
