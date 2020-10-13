/*
* Define a class Student with attributes rollno and name. 
* Define default and parameterized constructor. Override the toString() method. 
* Keep the count of Objects created. Create objects using parameterized constructor and 
* Display the object count after each object is created. 	
*/

class Q5{
	public static void main(String args[])
	{
		Student s1;
		for(int i=0; i<4; i++) s1=new Student();
	}
}

class Student{
	static int count=0;
	int rollno;
	String name;
	Student()
	{
		rollno=0;
		name="Student";
		System.out.println("Object count: "+(++count));
	}
	Student(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		System.out.println("Object count: "+(++count));
	}
}