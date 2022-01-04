import java.util.*;
class sumavg{
public static void main(String args[])
{
double nums[]={10.1,10.2,11.1,11.3};
double sum=0, avg=0;
for (int i=0; i<4; i++)
	sum=sum+nums[i];
System.out.println("Sum is: "+sum);
avg=sum/4;
System.out.println("Average is: "+avg);
}
}
