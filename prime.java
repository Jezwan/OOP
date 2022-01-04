import java.util.*;
class prime
{
public static void main(String args[])
{
System.out.print("Enter the limit ");
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt(), i, j, count;
System.out.print("The prime numbers are ");
for(i=1; i<=n; i++)
{
count=0;
for(j=1; j<=i; j++)
if (i%j==0)
count=count+1;
if (count==2)
System.out.print(i+" ");
}
}
}

