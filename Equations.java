
public class Equations {
	public static void main(String[] args) {
		double x=6,y=20,z=13;
		int equation1,equation2,equation3;
		
		System.out.println("Find Out Equations, given that: x=6, y=20, z=13"); 
		
		equation1 = (int)(2*(Math.pow(x, 2))) + (int)Math.pow(y,2);
		System.out.println("2x^2 + y^2 = " + equation1); 
		
		equation2 = (int)(3*x) + (int)y - (int)(3*Math.pow(z,2));
		System.out.println("3x + y - 3z^2 = " + equation2); 
		
		equation3 = (int)(2*x) - (int)(2*y) + (int)(5*Math.pow(z,2));
		System.out.println("2x - 2y + 5z^2 = " + equation3); 
	}
}
