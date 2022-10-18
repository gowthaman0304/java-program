class Mobile extends Telephone
{

int price =15000;

String name ="Mobile";

public void sms()
{
System.out.println("Messaging facility");

}

public static void main(String[] args)
{

Mobile samsung =new Mobile();

System.out.println(samsung.price);

System.out.println(samsung.name);

samsung.sms();

Telephone bsnl =new Telephone();

System.out.println(bsnl.name);
System.out.println(bsnl.price);

bsnl.call();
bsnl.receive_call();

}


}
