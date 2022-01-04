import java.util.*;
class frequency{
public static void main(String args[])
{
System.out.print("Enter the String: ");
Scanner Sc=new Scanner(System.in);
String str=Sc.nextLine();
System.out.print("Enter a char: ");
char character=Sc.nextLine().charAt(0);
int count=0;

for (int i=0; i<str.length(); i++)
	if (character==str.charAt(i))
		count=count+1;
System.out.print("frequency of given char: "+count+"\n");

}
}
