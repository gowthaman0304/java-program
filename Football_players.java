class Football_players
{
String name,place;
int age;
double hight;

Football_players(String name,int age,String place,double hight )
{
this.name=name;
this.age=age;
this.place=place;
this.hight=hight;
}

Football_players(String name,int age,String place)
{
this.name=name;
this.age=age;
this.place=place;
}

Football_players(String name,int age)
{
this.name=name;
this.age=age;
}

Football_players(String name)
{
this.name=name;
}

Football_players()
{

}

public static void main(String[] args)
{

Football_players player1=new Football_players("Messi",35,"Argentina",157.7);
Football_players player2=new Football_players("Ronaldo",38,"Portucal",182.4);
Football_players player3=new Football_players("Neymar",30,"Brasil");
Football_players player4=new Football_players("Haland",21);
Football_players player5=new Football_players("Pogba");
Football_players guest=new Football_players();

player1.info();
player2.info();
player3.info();
player4.info();
player5.info();
guest.info();
}

void info()
{
System.out.println("Player_Name:"    +   name  +   ",Age:"   +   age +   ",Place:" +   place    +",Hight:"  +   hight);
}

}
