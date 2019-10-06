public class Square extends Rectangle {
	@Override
	public double kerület() {
		return 4 * width;
	}
	@Override
	public double terület() {
		return width * width;
	}

	public Square(int a) {
		super(a, a);
	}

}