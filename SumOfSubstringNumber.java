/* sum of all substring of given number
ex: 1234 then 1+2+3+4+12+23+34+123+234+1234=1670
*/

import java.io.*;
import java.util.*;

public class SumOfSubstringNumber 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
String num = sc.nextLine();
int sum=0;

for(int i=0;i<num.length();i++)
{
    for(int j=i+1;j<=num.length();j++)
    {
       sum+=Integer.parseInt(num.substring(i,j));
    }
}

System.out.println(sum);
}
}
