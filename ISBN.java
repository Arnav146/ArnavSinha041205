import java.util.Scanner;
public class ISBN
{
    int isbn_num,l,sum;
   
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        isbn_num=n;
    }
   void check()
   {
       for(int i =10;i>0;i--)
       {
           l=isbn_num%10;
           sum=sum+(l*i);
           isbn_num/=10;
        }
        if(sum%11==0)
        {
           System.out.println("It is a valid ISBN");
        }
        else
        {
            System.out.println("It is an invalid ISBN");
        }
    }
    public static void main()
    {
        ISBN obj= new ISBN();
        obj.getData();
        obj.check();
        
       }
}