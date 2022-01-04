import java.util.*;
class greatnum{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
int i, n, max=0;
int a[]=new int[10];
System.out.print("Enter the limit: ");
n=Sc.nextInt();
System.out.print("Enter the array elements: \n\n");

for (i=0; i<n; i++)
{
	a[i]=Sc.nextInt();
	System.out.println();
}

System.out.println("Array elememts are: ");
for (i=0; i<n; i++)
	System.out.print(a[i]+"  ");

for (i=0; i<n; i++)
	if (a[i]>max)
		max=a[i];

System.out.println("\n\nGreatest number is: "+max);
System.out.print("\n");
}
}
