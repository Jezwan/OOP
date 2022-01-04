import java.util.*;
class Box{

double width, height, length;
Box(double w, double h, double l)
{
width = w;
height = h;
length = l;
}

double volume()
{
return width*height*length;
}

}
class paraconst{
public static void main(String args[])
{
Box mybox1=new Box(10, 20, 15);
Box mybox2=new Box(3, 6, 2);
double vol;
vol=mybox1.volume();
System.out.println("Volume is: "+vol);
vol=mybox2.volume();
System.out.println("Volume is: "+vol);
}
}
