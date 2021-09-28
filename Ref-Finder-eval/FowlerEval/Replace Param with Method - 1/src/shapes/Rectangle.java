package shapes;

public class Rectangle extends Quadrilateral implements Equiangular {
	private int height;
	private int width;

	public double calcArea() {
		return height*width;
	}
	
	public double calDiagSquare(){
		int hsq = height * height;
		int wsq = square(width);
		
		int ans = plus(hsq,wsq);
		
		return ans;
	}
	
	public int square(int x){
		return x*x;
	}
	
	public int plus(int a, int b){
		return a + b;
	}
}
