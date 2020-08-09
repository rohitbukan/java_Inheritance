interface A{
	void disp1(); 
	
}
interface B extends A{
	void disp2();
	
}
class C implements B{
	public void disp1() {
		System.out.println("In Disp1 ");
	}
	public void disp2() {
		System.out.println("In Disp2");
	}
	
}
public class Inheritance_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1=new C();
		c1.disp1();
		c1.disp2();
	}

}
