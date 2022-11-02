//1  3	5	7	9
//0	 2  4	6	8
//3	 6	9	12	15
//25  20  15  10  5
public class WhileLoop {
public static void main(String[] args) {
	WhileLoop obj = new WhileLoop();
	obj.count();
	obj.count1();
	obj.count2();
	obj.count3();
}
public void count()
{
int no=1;

while(no<=9) 
{
System.out.println(no+"");
	no=no+2;
}
}
public void count1()
{
int no=0;
while(no<=8)
{
System.out.println(no+"");	
no=no+2;
}
}
public void count2()
{
int no=3;
while(no<=15)
{
System.out.println(no+"");	
no=no+3;
}
}

public void count3()
{
int no=25;
while(no>=5)
{
System.out.println(no+"");	
no=no-5;
}
}
}
