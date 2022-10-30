class ActorSivakumar implements Actor
{
static String address="coimbatore";


ActorSivakumar(int age,String carbrand)
{

System.out.println("sivakumar age is"  +age);
System.out.println("sivakumar car brand is"  +carbrand);
}

ActorSivakumar()
{
}

public static void main(String[] args)
{
ActorSivakumar as = new ActorSivakumar(65,"Audi Car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println(as.address);

Actor ac=new ActorSivakumar();
System.out.println(ac.makeupRequired);
System.out.println(ac.address);


}

public void act()
{
System.out.println("he is a good actor");
}

public void dance()
{
System.out.println("dancing");
}

public void sing()
{
System.out.println("singing");
}

public void speaking()
{
System.out.println("speaking");
}
}
