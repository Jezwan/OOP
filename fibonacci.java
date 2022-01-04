class fibonacci{
public static void main(String args[])
{
int num1=0,num2=1,i,sum=0,n=5;
System.out.println("enter the limit:"+n);
System.out.println("fibinocci series");
System.out.println(num1);
System.out.println(num2);
sum=num1+num2;
for(i=2;i<=n;i++)
{
System.out.println(sum);
num1=num2;
num2=sum;
sum=num1+num2;
}
}
}
