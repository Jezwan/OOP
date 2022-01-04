import java.util.*;
class Box{
int length, height, width;

Box()
{
System.out.print("Constructor\n");
width=10;
length=10;
height=10;
}

int volume()
{
return width*length*height;
}

}

class constructor{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
int vol;
vol=mybox1.volume();
System.out.println("Volume is "+vol);
vol=mybox2.volume();
System.out.println("Volume is "+vol);
}
}
