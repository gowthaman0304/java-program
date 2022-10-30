package tamilnadu2.chennai;

class CommonmanInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonmanInChennai man = new CommonmanInChennai();
man.goBydiesalVehicle();
man.goBybicycle();
}

public void goBydiesalVehicle()
{
System.out.println("only diesal vehicle");
}

public void goBybicycle()
{
System.out.println("only bicycle");
}

}
