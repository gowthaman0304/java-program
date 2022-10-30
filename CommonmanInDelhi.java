package india.newdelhi;
import tamilnadu2.chennai.TrafficRules;

class CommonmanInDelhi implements  TrafficRulesDelhi,TrafficRules
{

public static void main(String[] args)
{
CommonmanInDelhi man2=new CommonmanInDelhi();
man2.dontgoBydiesalVehicle();
man2.goBybicycle();
man2.goBydiesalVehicle();

}

public void dontgoBydiesalVehicle()
{
System.out.println("Diesal Vehicles are prohibited");
}

public void goBybicycle()
{
System.out.println("Bicycles Allowded");
}

public void goBydiesalVehicle()
{
System.out.println("only diesal vehicle");
}
}
