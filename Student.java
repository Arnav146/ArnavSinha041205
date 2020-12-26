import java.util.Scanner;
class Student
{
    String name;
    int roll_no;
    double total_marks,percentage;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name of the student");
        name=sc.next();
        System.out.println("Roll no. of the student");
        roll_no=sc.nextInt();
        System.out.println("Marks of 5 subjects out of 100 scored by the student");
        total_marks=sc.nextDouble();
    }
    void calc()
    {
        percentage=(total_marks/500)*100;
        System.out.println("Percentage= "+percentage+"%"); 
        if(percentage>=90)
        System.out.println("Science with Computers");
        else if((percentage>=80)&&(percentage<=89))
        System.out.println("Science without Computers");
        else if((percentage>=70)&&(percentage<=79))
        System.out.println("Commerce with Maths");
        else if((percentage>=60)&&(percentage<=69))
        System.out.println("Commerce without Maths");
    }
    public static void main()
    {
        Student ob=new Student();
        ob.input();
        ob.calc();
    }
}
