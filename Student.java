public class Student
{
   int roll;
   String name;
  //constructor to initialize roll number and name of the student
  Student(int rollNo, String sName)
  { 
    roll = rollNo;
    name = sName;
  }
  //copy constructor
  Student(Student student)
  {
    System.out.println("\n---Copy Constructor Invoked---");
    roll = student.roll;
    name = student.name;
  }
  //method to return roll number
  int printRoll()
  {
    return roll;
  }
//Method to return name of the student
  String printName()
  {
    return name;
  }
  //class to create student object and print roll number and name of the student
  public static void main(String[] args)
  {
    Student student1 = new Student(5013, "Gowtham");
    System.out.println("Roll number of the first student: "+ student1.printRoll());
    System.out.println("Name of the first student: "+ student1.printName());
    
//passing the parameter to the copy constructor
    Student student2 = new Student(student1);
    System.out.println("\nRoll number of the second student: "+ student2.printRoll());
    System.out.println("Name of the second student: "+ student2.printName());
  }
}
