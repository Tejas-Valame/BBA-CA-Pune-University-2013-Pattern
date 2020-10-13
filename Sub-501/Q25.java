/*
* Define an Employee class with suitable attributes having getSalary() method,
* which returns salary withdrawn by a particular employee. Write a class Manager which
* extends a class Employee, override the getSalary() method, which will return
* salary of manager by adding traveling allowance, house rent allowance etc	
*/

class Q25{
	public static void main(String args[])
	{
		Employee e = new Employee(1, "Tejas");
		Manager m=new Manager();
		e.calSalary(12,65.0);
		e.getSalary();
		m.calSalary(12,65.0,5,15);
		m.getSalary();
	}
	
}
class Employee
{
	int eno;
	String name;
	double sal, rate, hr;
	Employee()
	{
		eno=0;
		sal=0;
		name="Employee";
	}
	Employee(int eno, String name)
	{
		this.eno=eno;
		this.name=name;
	}
	void calSalary(double rate, double hr)
	{
		this.rate=rate;
		this.hr=hr;
		sal=rate*hr;
	}
	void getSalary()
	{
		System.out.println("The salary of "+name+" is "+sal+"Rs");
	}
}
class Manager extends Employee
{
	double ta, hra;
	Manager()
	{
		eno=0;
		sal=0;
		name="Manager";
	}
	void calSalary(double rate, double hr, double ta, double hra)
	{
		this.rate=rate;
		this.hr=hr;
		this.ta = ta;
		this.hra=hra;
		sal=rate*hr+ta+hra;
	}
}