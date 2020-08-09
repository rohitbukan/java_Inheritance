class Top1{
	public void disp1() {
		System.out.println("In Top1 Display method");
	}
}
class Bottom1 extends Top1{
	public void disp1() {
		System.out.println("In Bottom1 Display Method");
	}
	
}
class Bottom2 extends Top1{
	public void disp1() {
		System.out.println("In Bottom2 Display Method");
	}
	
}
class Bottom3 extends Top1{
	public void disp1() {
		System.out.println("In Bottom3 Display Method");
	}	
}
public class Inheritance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top1 t1=new Bottom3();
		Top1 t2=new Bottom2();
		Top1 t3=new Bottom1();
		t1.disp1();
		t2.disp1();
		t3.disp1();

	}

}
