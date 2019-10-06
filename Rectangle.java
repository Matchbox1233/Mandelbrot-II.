public class Rectangle extends Shape {
	@Override
	public double kerület() {
		return height * width;
	}
	@Override
	public double terület() {
		return 2 * (height + width);
	}

	public Rectangle(int w, int h) {
		super(w, h);
	}

}