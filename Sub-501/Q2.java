/*
* Write a java program to accept n names of cities from user and 
* display them in descending order. 
*/

class Q2{
	public static void main(String args[])
	{
		String temp;
		for(int i=0 ; i<args.length ; i++)
		{
			for(int j=i+1 ; j<args.length ; j++)
			{
				if(args[i].toLowerCase().compareTo(args[j].toLowerCase())>0)
				// In this if condition, args[i] is made lowercase
				// and then compared to lowercased args[j].
				{
					temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}
			}
		}
		System.out.println("The sorted list is:");
		for(int i=0 ; i<args.length ; i++)
		{
			System.out.println(args[i]);
		}
	}
}

/*
* D:\Submission\JAVA\>javac Q2.java
* D:\Submission\JAVA\>java Q2 amravati pune Nagpur
* The sorted list is:
* amravati
* Nagpur
* pune
* ================ READY ================
*/
