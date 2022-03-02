import java.io.*;
import java.util.*;

public class NumberProblem2 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str=sc.nextLine();

//using replace

for(int i=0;i<str.length();i++)
{
    if(str.charAt(i)=='7')
        str=str.replace("7","");

    if(str.charAt(i)=='5' && str.charAt(i+1)=='6')
    {
        str=str.replace("56","");
    }
}
System.out.println(str);
}
}
