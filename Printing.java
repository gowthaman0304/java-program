public class Printing {
public static void main(String[] args) {
	Printing pt=new Printing();
    pt.printing_Square();
	pt.printing_cube();
	//pt. printing_power();
	pt.printing();
}
private void printing_Square() {
	int num=1;
	while(num<=10)
	{
	int square=num*num;
	System.out.println("The value of "+num +" square is " + square);
		num=num+1;
	}
}
private void printing_cube() {
	int num=1;
	while(num<=4)
	{
	int cube=num*num*num;
	System.out.println("The value of "+num +" cube is " + cube);
		num=num+1;
	}
}


private void printing_power() {
	int num=1;
	while(num<=4)
	{
	int power=num*num;
	System.out.println(power);
		num=num+1;
	   }  
}

private void printing() 
{
	int num=1;
	int num2=10;
	while(num<=4 && num2>=7)
	{

	System.out.print(num+"*"+num2 +"  ");
		num=num+1;
		num2=num2-1;
	   }  
}
}
