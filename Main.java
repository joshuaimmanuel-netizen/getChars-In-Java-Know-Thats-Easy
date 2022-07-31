// Java program to demonstrate
// working of getChars() method
import java.lang.*;
class Main {
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("joshua immanuel");

		char[] destArray = new char[15];
		try {
			str.getChars(0, 6, destArray, 0);
			System.out.println(destArray);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
}



//public void getChars(int srhStartIndex, 
//int srhEndIndex, char[] destArray, int destStartIndex)     
//Parameters:
//srhStartIndex : Index of the first character in the string to copy. 
//srhEndIndex : Index after the last character in the string to copy.
//destArray : Destination array where chars will get copied.
//destStartIndex : Index in the array starting from where the chars
 //                will be pushed into the array.
//Return: It does not return any value.
