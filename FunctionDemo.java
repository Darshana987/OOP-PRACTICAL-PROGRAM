
class Calculator
{
    int add(int a, int b)
    {
        return a+b;

    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    double add(double a, double b)
    {
        return a+b;
    }

}
class Student
{
    String name;
    int age;
    
    Student()
    {
        name = "Unknown";
        age= 1;    
    }
    Student(String n, int a){
        name = n;
        age = 3;
    }
    Student(Student s)
    {
        this.name = s.name;
        this.age = s.age;      
    }
    void display()
    {
        System.out.println("Name: "+ name+ "Age: "+ age );
    }
    Student getStudents()
    {
        return this;
    }
}
public class FunctionDemo {
    public static void main(String args[])
    {
        Calculator calc = new Calculator();
        System.out.println("Add two integers :" + calc.add(10, 20));
        System.out.println("Add three integers:" + calc.add(7,9,8));
        System.out.println("Add two Doubles:"+ calc.add(0.55, 10.9));


        Student s1= new Student();
        Student s2= new Student("Darshana",66);
        Student s3= new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        Student s4 = s2.getStudents();
        System.out.println("Students s4 details (reference to s2:)");
        s4 .display();
        
    }
}