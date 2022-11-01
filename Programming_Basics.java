class Programming_Basics
{
public static void main(String[] args)
{
Programming_Basics pb = new Programming_Basics(); 
pb.calculate_amount(); 
pb.security_count(1024); 
pb.dosai_count(8); 
}
public void dosai_count(int dosai)
{
int count = 3; 
while(count>=1)
{
dosai = dosai + dosai/2; 
count = count -1; 
}
System.out.println("Total no. of dosais is "+ dosai); 
}
public void security_count(int beats)
{
int security = 0; 
while(beats>1)
{
beats = beats/2; 
System.out.println("security gets "+ beats ); 
security = security + 1; 
}
System.out.println("No. of Securities is "+ security); 

}
public void calculate_amount()
{
int amount = 0; 
int day = 1; 
while(day<=10)
{
amount = amount + day; 
day = day +1;
}
System.out.println(amount); 
}
}
