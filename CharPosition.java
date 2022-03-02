/* correct position character count*/

import java.io.*;
import java.util.*;

public class CharPosition 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine().toLowerCase();
int c=0;
for(int i=0;i<str.length();i++)
{
    char chr = str.charAt(i);
    if((chr-'a')==i)
        c=c+1;
}
System.out.println(c);
}
}
