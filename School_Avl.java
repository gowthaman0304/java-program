class School_Avl
{  
int rollno;  
String name;  
float fee;  

School_Avl(int rollno,String name,float fee)
{  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  

void display()
{
System.out.println(rollno+" "+name+" "+fee);
}  

//}

//class Students_Avl 
//{
public static void main(String[] args)
{

School_Avl stud1=new School_Avl(003,"Akash",38000f);
School_Avl stud2=new School_Avl(004,"Arunkumar",10000f);

stud1.display();
stud2.display();

}

} 

