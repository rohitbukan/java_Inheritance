abstract class Shape{
	abstract void draw();{
		
	}
}
class Tringle extends Shape{
	void draw() {
		System.out.println("Tringle Draw");
	}
	
}
class Polygon extends Shape{
	void draw() {
		System.out.println("Polygon Draw");
	}
	
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle Draw");
	}
	
}
public class Inheritance_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape arr[]= new Shape[3];
		arr[0]=new Tringle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++) {
			arr[i].draw();
		}

	}

}
