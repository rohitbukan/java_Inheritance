class Parent{
	void disp() {
		System.out.println("In Parent class Display");
	}
	Parent(){
		System.out.println("In Parent class Constructor 1");
	}
	
}
class Son extends Parent{
	void disp1() {
	System.out.println("In Son Display");
	}
	Son(){
		System.out.println("In Son class Constructor");
	}
	
}
class Doughter extends Parent{
	void disp2() {
	System.out.println("In  Doughter Display");
	}
	Doughter(){
		System.out.println("In Doughter class Constructor");
	}
	
}
public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son c1=new Son();
		Doughter c2=new Doughter();
		c1.disp();
		c1.disp1();
		c2.disp();
		c2.disp2();

	}

}
