package javavariablesdemo;

public class Triangle {
	
	double base = 5;
	double height= 4;
	static String material = "paper";
	

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		
		
		System.out.println("Triangle base="+triangle1.base );
		System.out.println("Triangle height"+triangle1.height);
		System.out.println("Triangle material is:" + Triangle.material);
		
		
		
	}
}
		
	


