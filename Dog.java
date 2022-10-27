 class Dog extends Animal
{
   void sound()
   {
	System.out.println("bow bow");
   }
   public static void main(String args[])
   {
	Animal obj = new Dog();
	obj.sound();
    obj.running();

    Dog dog=new Dog();
    dog.eating();
   }
  
void eating()
{
System.out.println("Pedigree");

}
void running()
{
System.out.println("running fast");
} 
}
