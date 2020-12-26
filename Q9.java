import java.util.Scanner;
class Q9
{
    void init()
    {
        int sum=2-4+6-8+10-12+14-16+18-20;
        int sum1=0;
        int n=20;
        for(int i=2;i<=n;i=i+2)
        {
            if(i/4>=1)
            {
                sum1-=sum1;
            }
            else
            {
                sum1+=sum1;
            }
            
        }
        System.out.println("Sum of the series 1="+sum+"\n"+"Sum of the series 1="+sum1);
        //second way does not work though it is correct. 
    }
    int x;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
        x=sc.nextInt();
    }
    
    void init2()
    {
        double sum2=0;
        for(int j=2;j<=20;j+=3)
        {
            sum2=sum2+(x/j);
        }
        System.out.println("Sum of the series 2="+sum2);
    }
    public static void main()
    {
        Q9 ob=new Q9();
        ob.init();
        ob.input();
        ob.init2();
    }
}
