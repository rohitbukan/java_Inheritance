class base1{
	int num=10;

	base1(int num){
		this.num=num;
		System.out.println(num);
		System.out.println("Inside Parameterized Constructor");
	}
	
}
class sub1 extends base1
{
	int num1=11;
	int num2=12;
	sub1(){
		super(13);
		System.out.println("Inside Sub1 default constructor");
	}
	sub1(int num1){
		super(14);
		this.num1=num1;
		System.out.println(num1);
		System.out.println("Inside Parameterized of Sub1");
		
	}
	sub1(int num1,int num2){
		super(15);
		this.num1=num1;
		this.num2=num2;
		System.out.println(num1+" "+num2);
		System.out.println("Inside To Parameterized of Sub1");
		
	
	
}
public class Inheritance_8 {

	public static void main (String []args)
	 {
		 sub1 s = new sub1(40,80);
		 
	 }
	 
	}

}
