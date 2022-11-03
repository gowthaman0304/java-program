public class Loop_program 
{
public static void main(String[] args) {
Loop_program obj = new Loop_program();
obj.adition();
obj.multiples_of_4_and_9();
obj.multiples_of_5_or_8();
}
private void multiples_of_4_and_9() {
	int no=1;
	while(no<=40)
	{
	   if(no%4==0 && no%9==0)	
	   {
		   System.out.println(no);
	   }
		no=no+1;
	}}
	private void multiples_of_5_or_8() {
		int no=1;
		while(no<=50)
		{
		   if(no%4==0 || no%9==0)	
		   {
			   System.out.print(no+"   ");
		   }
			no=no+1;
		}
}
void adition()
{
    int sum=0;
    int no=1;
    while(no<=10)
    {
    	sum=sum+no;
        no=no+1;
    }
    System.out.println("Adition of first n numbers" +sum);
}
}
