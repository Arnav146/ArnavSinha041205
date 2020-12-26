import java.util.Scanner;
class average
{
   double[] Array;
   
     average(int arrSize)
     {
        Array = new double[10];
    }
    
    void init()
    {
     Scanner sc = new Scanner(System.in);
       System.out.println("input 10 nos");
       for(int i=0; i<= Array.length-1; i++)
       {
          Array[i] = sc.nextInt();
        }
    }
    
    void compute()
    {
      double avg = 0;
      for(int i=0; i<=Array.length-1; i++)
      {
        avg += Array[i];
    }
        avg = avg/Array.length;
        
        for(int i =0; i<=Array.length-1; i++)
        
           if(Array[i] > avg)
           {
              System.out.println(Array[i]);
            }
            
        }
        
        public static void main()
        {
           average obj = new average(10);
           obj.init();
           obj.compute();
        }
    }
