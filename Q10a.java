import java.util.Scanner;
class Q10a
{
    int  n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        n=sc.nextInt();
    }
    void generate()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+" ");
            for(int j=1;j<=i;j++)
            {
                
                if(j%2==0)
                {
                    System.out.print("#"+" ");
                }
                else
                {
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Q10a obj=new Q10a();
        obj.input();
        obj.generate();
    }
}
