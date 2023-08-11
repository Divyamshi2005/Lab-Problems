/*write a java program to define an interface called "vehicle" with abstract methods changeGear(int),speedup(int).you have to implement two classes "car" and "bike " which define code for abstract methods of the interface vehicle.*/
import java.io.*;

interface vehicle
{
void changeGear(int a);
void speedUp(int b);
}
class car implements vehicle
{
public void changeGear(int a)
{
System.out.println("change gear of car: "+a);
}
public void speedUp(int b)
{
System.out.println("speed up of car: "+b);
}
}
class bike implements vehicle
{
public void changeGear(int a)
{
System.out.println("change gear of bike: "+a);
}
public void speedUp(int b)
{
System.out.println("speed up of bike: "+b);
}
}
class week2_Postlab2
{
public static void main(String args[])
{
car c=new car();
c.changeGear(2);
c.speedUp(120);
bike bi=new bike();
bi.changeGear(4);
bi.speedUp(120);
}
}