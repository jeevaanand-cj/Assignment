package MyProjects;
import MyProjects.shape;

class Circle implements shape
{
	
    int r=0;
    double pi=3.14,ar = 0;
    @Override
    public void input()
    {
    	System.out.println("enter r values for circle: ");
    	r=s.nextInt();
    	
    }
    @Override
    public void area()
    {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
    }
}
class Rectangle extends Circle
{
	
    int l = 0, b = 0;
    double ar;
    @Override
    public void input()
    {
        super.input();
        System.out.println("enter the l and b values for Rectangle: ");
        l = s.nextInt();
        b = s.nextInt();
        
    }
    @Override
    public void area()
    {
        super.area();
        ar = l * b;
        System.out.println("Area of rectangle:"+ar);
       
    }
}
class Triangle extends Rectangle{
	
	int b=1,h=1;
	double area;

    public void input()
    {
    	    super.input();
    		System.out.println("enter the b and h values for Triangle: ");
        b = s.nextInt();
        h = s.nextInt();
        
    }

    public void area()
    {
    	super.area();
        area =(b*h)/2;
        System.out.println("Area of Triangle:"+area);
        s.close();
    }
    
    
}
class ShapeMainclass
{
    public static void main(String[] args)
    {
    	
    	Triangle obj = new Triangle();
        obj.input();
        obj.area();
        
    }
}