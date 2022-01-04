class primex{
public static void main(String args[])
{
int n=23,i,j,count;
System.out.print("the prime numbers are");
for(i=1;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
if(i%j==0)
count=count+1;
if(count==2)
System.out.print(i+" ");
}
}
}
