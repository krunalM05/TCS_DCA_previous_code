import java.io.*;
import java.util.*;

public class NumberProblem3 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String numstr = sc.nextLine();
char[] arr=numstr.toCharArray();
char p;
for(int i=0; i<arr.length;i++)
{
    p=(char)('9'-arr[i]+48);
    arr[i]=p;
}
System.out.println(String.valueOf(arr));
}
}
