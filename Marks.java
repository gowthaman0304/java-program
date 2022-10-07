class Marks
{

public static void main(String[] args)
{

Marks mark=new Marks();

mark.add(83,63,88,89,94);
mark.add(157,113,78,123,88,88);
mark.cgp(6.8f);
}

void add(int tamil,int english,int maths,int scince,int social)
{
System.out.println(tamil+english+maths+scince+social);      
}
void add(int tamil,int english,int maths,int physics,int chemistry,int biologoy)
{
System.out.println(tamil+english+maths+physics+chemistry+biologoy);
}

void cgp(float sem)
{
System.out.println(sem);
}









}
