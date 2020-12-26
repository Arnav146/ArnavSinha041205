import java.util.Scanner;
class temp
{
   double[] Array;
   String name;
   
   temp(int arrSize)
   {
      Array = new double[arrSize];
    }
    
   void input()
   { 
      for(int i=0; i<=Array.length-1; i++)
      {
      Scanner sc = new Scanner(System.in);
      System.out.println("input name of city");
      name = sc.nextLine();
      System.out.println("input temp of city");
      Array[i] = sc.nextDouble();
    }
}

void display()
    {
      for(int i=0; i<= Array.length-1; i++)
      {
         System.out.println(Array[i]);
        }
    }
    
    void compute()
    {
       double temp;
       for(int i=0; i<= Array.length-2; i++)
       {
          for(int j=0; j<=Array.length-2; j++)
          
             if(Array[j] > Array[j+1]) 
             {
                temp = Array[j];
                Array[j] = Array[j+1];
                Array[j+1] = temp;
            }
            System.out.print("Temp= " + (i+1) + " --->");
            display();
        }
    }
    
    public static void main()
    {
       temp obj = new temp(5);
       obj.input();
       obj.display();
       obj.compute();
    }
}
