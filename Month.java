import java.util.Scanner;

class Month
{
    public static void getDate(int d, String m)
    {
         int[] days = { 31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };
         String[] month = { "January", "February", "March",
             "April", "May", "June", "July",
             "August", "September", "October",
             "November", "December" };
         int count = 183;
         int current_month=0;

         for(int i = 0; i < 12; i++)
         {
          if (month[i].equalsIgnoreCase(m))
          {
           current_month = i;
           System.out.println(month[i]);
          }
         }
          
          System.out.println(current_month);
         // current_month+=1;
         int current_date = d;
         int x=days[current_month]-current_date;
         count=count-x;
         int sum=0;
        while(true)
        {
          if(sum>=count)
            break;
          sum=sum+days[current_month];
          current_month+=1;
        }
        current_month=current_month%12;
        System.out.println(x + " " +month[current_month]);
    }
    public static void main(String args[])
    {
         int D;
         String M;
         Scanner sc=new Scanner(System.in);
         D=sc.nextInt();
         M=sc.next();
         getDate(D, M);
    }
}