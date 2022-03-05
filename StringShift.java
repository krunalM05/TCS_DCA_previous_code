import java.io.*;
import java.util.*;

public class StringShift 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

String frShift = str.substring(1,str.length())+str.substring(0,1);
System.out.println(frShift);
String backShift = str.substring(str.length()-1)+str.substring(0,str.length()-1);
System.out.println(backShift);
if(frShift.equalsIgnoreCase(backShift))
    System.out.println(1);
else
    System.out.println(0);
}
}
