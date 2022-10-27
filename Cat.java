class Cat extends Animal
{
public static void main(String[] args)
{
Animal objc=new Cat();
objc.sound();
objc.running();

Cat cat =new Cat();
cat.eating();

}
void sound()
{
System.out.println("cat Miaow Miaow");
}
void running()
{
System.out.println("running slow" );
}

void eating()
{
System.out.println("cat eating fish and milk");

}

}
