class Vehicle{
	public void start()
	{
		System.out.println("Vehicle start");
	}
}
class fourwheeler extends Vehicle{
	public void start(){
		System.out.println("FourWheeler Start");
		
	}
	
}
public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fourwheeler f=new fourwheeler();
		f.start();

	}

}
