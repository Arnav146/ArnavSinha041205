import java.util.Scanner;
class lastDig
{
   int[] Array;
   
    lastDig(int arrSize)
     {
        Array = new int[8];
    }
    
    void init()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 8 no.s ");
       for(int i=0; i<= Array.length-1; i++)
       {
          Array[i] = sc.nextInt();
        }
        
    }
    
    void compute()
    {
       for(int i=0; i<=Array.length-1; i++)
       {
          if(Array[i] %10 == 3)
          {
             System.out.println(Array[i]);
            }
        }
    }
    
    public static void main()
    {
       lastDig obj = new lastDig(8);
       obj.init();
       obj.compute();
    }
}
