/*
* Define an abstract class Shape with abstract methods area() and volume().
* Write a java program to calculate area and volume of Cone and Cylinder. 	
*/

class Q15{
	public static void main(String args[])
	{
		Cone c = new Cone(11.0, 56.98);
		Cylinder cyl = new Cylinder(11.0, 56.98);
	}
}

abstract class Shape
{
	double h, r, a, vol;
	abstract void area();
	abstract void volume();
}

class Cone extends Shape
{
	
	Cone()
	{
		h=0.0; 
		r=0.0;
		area();
		volume();
	}
	Cone(double h, double r)
	{
		this.h=h;
		this.r=r;
		area();
		volume();
	}
	void area()
	{
		a=3.14*r*(r+Math.sqrt(h*h+r*r));
		System.out.println("The area of cone is: "+a+"cm^2");
	}
	void volume()
	{
		vol= 3.14*r*r*h/3;
		System.out.println("The volume of cone is: "+vol+"cm^3");
	}
}

class Cylinder extends Shape
{
	Cylinder()
	{
		h=0.0; 
		r=0.0;
		area();
		volume();
	}
	Cylinder(double h, double r)
	{
		this.h=h;
		this.r=r;
		area();
		volume();
	}
	void area()
	{
		a=2*3.14*r*(r+h);
		
		System.out.println("The area of cylinder is: "+a+"cm^2");
	}
	void volume()
	{
		vol=3.14*r*r*h;
		
		System.out.println("The volume of cylinder is: "+vol+"cm^3");
	}
}