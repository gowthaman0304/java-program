class Parrot implements Birds
{
public static void main(String[] args)
{
Parrot obj=new Parrot();
obj.sound();
obj.fly();

Birds par =new Parrot(); 
par.sound();
par.fly();
par.sleep();
par.eat();

System.out.println(Birds.foods);
System.out.println(Birds.fruits_count);
}

public void sleep()
{
System.out.println("parrot is sleeping");  
}

public void eat()
{
System.out.println("parrot is eating fruits");   
}


public void sound()
{
System.out.println("kee kee kee");
}

public void fly()
{
System.out.println("parrot is flying");
}

}
