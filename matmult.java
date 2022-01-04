import java.util.*;
class matmult{
public static void main(String args[])
{
Scanner Sc=new Scanner(System.in);
System.out.print("Enter the no of rows of Mat A - m1: ");
int m1=Sc.nextInt();
System.out.print("Enter the no of colomns of Mat A- n1: ");
int n1=Sc.nextInt();
System.out.print("Enter the no of rows of Mat B - m2: ");
int m2=Sc.nextInt();
System.out.print("Enter the no of colomns of Mat B - n2: ");
int n2=Sc.nextInt();
int x=n1;

if (n1!=m2)
{
System.out.print("Multiplication not possible");
}

else
{

int A[][]=new int [m1][n1];
int B[][]=new int [m2][n2];
int C[][]=new int [m1][n2];

System.out.print("Read Mat A: ");
for (int i=0; i<m1; i++)
for (int j=0; j<n1; j++)
{
System.out.println("A["+i+"]["+j+"] = ");
A[i][j]=Sc.nextInt();
}

System.out.print("Read Mat B: ");
for (int i=0; i<m2; i++)
for (int j=0; j<n2; j++)
{
System.out.println("B["+i+"]["+j+"] = ");
B[i][j]=Sc.nextInt();
}

for (int i=0; i<m1; i++)
for (int j=0; j<n2; j++)
{
C[i][j]=0;

for (int k=0; k<x; k++)
C[i][j] = C[i][j] + A[i][k]*B[k][j];

}

System.out.println();
System.out.println("\n\nMat A: \n");
for (int i=0; i<m1; i++)
{
if (i!=0)
System.out.println();
for (int j=0; j<n1; j++)
System.out.print(A[i][j]+"  ");
}

System.out.println();
System.out.println("\n\nMat B: \n");
for (int i=0; i<m2; i++)
{
if (i!=0)
System.out.println();
for (int j=0; j<n2; j++)
System.out.print(B[i][j]+"  ");
}

System.out.println();
System.out.println("\n\nMat C: \n");
for (int i=0; i<m1; i++)
{
if (i!=0)
System.out.println();
for (int j=0; j<n2; j++)
System.out.print(C[i][j]+"  ");
}

}
}
}





































