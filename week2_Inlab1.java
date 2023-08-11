abstract  class car
{
String regno;
car(String regno)
{
this.regno=regno;
}
void fillTank()
{
System.out.println("tank is full");
}
abstract void steering(String direction);
abstract void  braking(int force);
}
class maruthi extends car
{
maruthi(String regno)
{
super(regno);
}
void steering(String direction)
{
System.out.println("mdirection="+direction);
}
void  braking(int force)
{
System.out.println("mforce="+force);
}
}
class santro extends car
{
santro(String regno)
{
super(regno);
}
void steering(String direction)
{
System.out.println("direction="+direction);
}
void  braking(int force)
{
System.out.println("force="+force);
}
}

class week2_Inlab1{
public static void main(String args[])
{
maruthi m=new maruthi("AP16BZ5557");
m.fillTank();
m.steering("farward");
m.braking(60);
santro s=new santro("AP16BC8667");
s.fillTank();
s.steering("backward");
s.braking(90);
}
}




