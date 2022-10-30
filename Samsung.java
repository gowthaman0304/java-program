class Samsung extends FactoryDemo
{
static int price=5000;


public static void main(String[] args)
{

Samsung sam=new Samsung();
sam.call(60);
sam.browse();
sam.sendmessage();
sam.receivecall();
sam.verifyFingerPrint();
sam.providePattern();
System.out.println(sam.price);


FactoryDemo fd =new Samsung();
System.out.println(fd.isoriginalpiece);

}

int call (int seconds)
{
return seconds;

}
void sendmessage()
{
System.out.println("sending messages");
}
void receivecall()
{
System.out.println("received calls");
}
void verifyFingerPrint()
{
System.out.println("finger print verify");
}
void providePattern()
{
System.out.println("pattern provided");
}


} 
