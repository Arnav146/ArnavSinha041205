import java.util.*;
public class bubble_sort
{
       void compute()
          {
               Scanner sc=new Scanner(System.in);
               String name[]=new String[20],t;
               System.out.println("Enter the names ");
               for(int i=0;i<name.length;i++)
               {
                  System.out.print("m["+i+"] :");
                  name[i]=sc.nextLine();
               }
               for(int i=0;i<name.length-1;i++)
               {
               for(int j=i+1;j<name.length;j++)
               if(name[i].compareTo(name[j])<0)
               {
                 t=name[i];
                 name[i]=name[j];
                 name[j]=t;
               }
               }
                System.out.println("Sorted array= ");
               for(int i=0;i<name.length;i++)
               System.out.println(name[i]);
      }
               public static void main()
           {
              bubble_sort obj=new bubble_sort();
              obj.compute();
           
      }
}
