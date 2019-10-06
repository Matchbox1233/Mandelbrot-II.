import java.lang.Math;

public class Circle extends Shape {
	@Override
	public double kerület() {
		return 2 * height * Math.PI;
	}
	@Override
	public double terület() {
		return height * height * Math.PI;
	}

	public Circle(int r) {
		super(r, r);
	}

}