abstract class Shape
{    public abstract void numberOfSides();
}
class Trapezoid extends Shape
{    public void numberOfSides()
    {    System.out.println("Number of Sides:"+4);
    }
}class Hexagon extends Shape
{    public void numberOfSides()
    {    System.out.println("Number of Sides:"+6);
    }
}class Triangle extends Shape
{    public void numberOfSides()
    {    System.out.println("Number of Sides:"+3);
    }
}