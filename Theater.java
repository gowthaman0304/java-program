class Theater
{
public static void main(String[] args)
{

Theater raja=new Theater();
  
int balance=raja.bookticket(200);
}

int bookticket(int amount)
{
int ticketprice=120;
int balance=amount-ticketprice;
System.out.println("afterbookingticket"+balance); 
return balance;
}

}
