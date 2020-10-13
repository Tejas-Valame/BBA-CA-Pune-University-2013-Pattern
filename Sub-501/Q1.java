/*
* Write a java program to read the characters from a file, 
* if a character is alphabet then reverse its case, if not then display 
* its category on the Screen. (Whether it is Digit or Space) [30 marks]
*/
import java.io.*;

class Q1{
	public static void main(String args[]) throws Exception
	{
		FileReader fr;
		int i, digit=0, space=0;
		char ch=' ';
		fr = new FileReader(args[0]);
		while(true)
		{
			
			i = fr.read();
			if(i==-1) break;
			ch = (char)i;
			if(Character.isLowerCase(ch)) ch=Character.toUpperCase(ch);
			else if(Character.isUpperCase(ch)) ch=Character.toLowerCase(ch);
			else if(Character.isDigit(ch))digit++;
			else if(Character.isWhitespace(ch))space++;
			System.out.print(ch);
		}
		System.out.print("\nTotal digits: "+digit+"\tTotal Space: "+space);
	}
}