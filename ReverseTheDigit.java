/*Reverse the digit of given number

ex: 123456789==876543210
*/

import java.io.*;
import java.util.*;

public class ReverseTheDigit 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int newNum= solveIt(num);
System.out.println(newNum);
}

public static int solveIt(int num)
{
    int newNum=0;
    int power=0;
    while(num>0)
    {
        int digit = num%10;
        newNum+=(9-digit)*Math.pow(10, power++);
        num=num/10;
    }

    return newNum;
}
}
