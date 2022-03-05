import java.io.*;
import java.util.*;

public class IsPalindromPossible 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int arr[] = new int[str.length()];
for(int i=0;i<str.length();i++)
{
    int c=0;
    for(int j=0;j<str.length();j++)
    {
        if(str.charAt(i)==str.charAt(j))
            c=c+1;
    }
    arr[i]=c;
}

int flag=0;
for(int i=0;i<arr.length;i++)
{
    if(arr[i]%2==0)
        continue;
    else
        flag=flag+1;
}

if(flag>1)
    System.out.println("Palindrom not possible");
else
    System.out.println("palindrom Posiible");
}
}
