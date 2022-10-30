abstract class SmartPhone
{


public SmartPhone()
{
System.out.println("Smartphone under development");
}

abstract int call(int seconds);

abstract void sendmessage();

abstract void receivecall();


void browse()
{
System.out.println("SmartPhone browsing");
}



}
