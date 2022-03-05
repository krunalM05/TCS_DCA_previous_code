import java.io.*;
import java.util.*;

public class StringInOtherString 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();
int count=0;
int index=0;
for(int i=0;i<str2.length();i++)
{
    for(int j=index;j<str1.length();)
    {
        
        if(str2.charAt(i)==str1.charAt(j))
        {
            index=j;
            count++;
            break;
        }
        else
            j++;
    }
}
if(count==str2.length())
    System.out.println("WON");
else
    System.out.println("LOSS");

}
}
