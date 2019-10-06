

public class Main
{
    public static void main(String[] args) 
    {
        Shape r = new Rectangle(5, 4);
        Shape c = new Circle(40);
        Shape s = new Square(30);
        System.out.println(r.kerület() + " " + r.terület());
        System.out.println(c.kerület() + " " + c.terület());
        System.out.println(s.kerület() + " " + s.terület());
            
    }
}