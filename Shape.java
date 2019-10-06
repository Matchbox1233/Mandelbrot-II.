public abstract class Shape {

	protected int width;
	protected int height;

	public abstract double kerület();

	public abstract double terület();

	public Shape(int w, int h) {
		width = w;
		height = h;
	}

}