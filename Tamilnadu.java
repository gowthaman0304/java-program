class Tamilnadu extends SouthIndia
{
static String capital="Chennai";

public static void main(String[] args)
{
Tamilnadu tn =new Tamilnadu();
tn.speakLanguage();
tn.eat();
tn.dress();

System.out.println(capital);

SouthIndia si= new Tamilnadu();
si.cultivate();
si.livingstyle();


India ind = new Tamilnadu();
System.out.println(ind.capital);

}

public void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}

public void livingstyle()
{
System.out.println("Above Average development");
}

public void speakLanguage()
{
System.out.println("Tamil");
}

public void eat()
{
System.out.println("Rice");
}

public void dress()
{
System.out.println("Vetti sattai");
}

}
