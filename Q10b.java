import java.util.Scanner;
class Q10b
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        n=sc.nextInt();
    }
    void generate()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-(i-1);j++)
            {
               System.out.print(" "+(n-(j-1)));
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Q10b ob=new Q10b();
        ob.input();
        ob.generate();
    }
}    
