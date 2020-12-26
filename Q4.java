import java.util.Scanner;
class Q4
{
    int a;
    void option()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose from 1 and 2");
        a=sc.nextInt();
        
    }
    void calc()
    {
        switch(a)
        {
            case 1:
            double P,r,n;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter Principal");
            P=s.nextDouble();
            System.out.println("Enter Rate of Interest");
            r=s.nextDouble();
            System.out.println("Enter time period in years");
            n=s.nextDouble();
            double A=P*Math.pow((1+(r/100)),n);
            System.out.println("Amount="+A);
            break;  
        
            case 2:
            double P1,r1,n1;
            Scanner sca=new Scanner(System.in);
            System.out.println("Enter Principal");
            P1=sca.nextDouble();
            System.out.println("Enter Rate of Interest");
            r1=sca.nextDouble();
            System.out.println("Enter time period in months");
            n1=sca.nextDouble();
            double A1=P1*n1+(P1*n1*(n1+1)*r1)/2400;
            System.out.println("Amount="+A1);
            break;
        
        default:
        System.out.println("ERROR");
    }
}
public static void main()
    {
        Q4 ob=new Q4();
        ob.option();
        ob.calc();
    }
}
