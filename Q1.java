import java.util.Scanner;
class Q1
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No. of rows");
        n=sc.nextInt();
    }
    void generate()
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(" "+count);
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Q1 o=new Q1();
        o.input();
        o.generate();
    }
}
