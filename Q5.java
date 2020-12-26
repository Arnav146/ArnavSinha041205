import java.util.Scanner;
class Q5
{
    int n;
    int a;
    void option()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Choose from 1 and 2");
        a=s.nextInt();
        
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of rows");
        n=sc.nextInt();
    }
    void generate()
    {
        if(a==1)
        {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    else if(a==2)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-(i-1);j++)
            {
                
                System.out.print(" "+"5");
            }
            System.out.println();
        }
    }
    else
    System.out.println("ERROR");
}
public static void main()
{
    Q5 ob=new Q5();
    ob.option();
    ob.input();
    ob.generate();
}
}
