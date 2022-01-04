import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.print("Enter the String ");
String original, reverse="";
original=Sc.nextLine();
int length=original.length(), i;
for(i=length-1; i>=0; i--)
reverse=reverse+original.charAt(i);
if(original.equals(reverse))
System.out.println("The String is a Palindrome");
else 
System.out.print("Not a Palindrome");
}
}
