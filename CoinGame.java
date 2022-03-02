/*Problem Statement
Find the minimum number of coins required to form any value between 1 to N,both inclusive.Cumulative value of coins should not exceed N. Coin denominations are 1 Rupee, 2 Rupee and 5 Rupee.Let’s Understand the problem using the following example. Consider the value of N is 13, then the minimum number of coins required to formulate any value between 1 and 13, is 6. One 5 Rupee, three 2 Rupee and two 1 Rupee coins are required to realize any value between 1 and 13. Hence this is the answer.However, if one takes two 5 Rupee coins, one 2 rupee coin and two 1 rupee coin, then too all values between 1 and 13 are achieved. But since the cumulative value of all coins equals 14, i.e., exceeds 13, this is not the answer.

Input Format:
A single integer value.
 

Output Format:
Four space separated integer values.
1st – Total number of coins.
2nd – number of 5 Rupee coins.
3rd – number of 2 Rupee coins.
4th – number of 1 Rupee coins.
 

Constraints:
0 < n < 1000
Refer the sample output for formatting

Sample Input

    13

Sample Output

   6 1 3 2

Explanation

The minimum number of coins required is 6 with in it:
minimum number of 5 Rupee coins = 1
minimum number of 2 Rupee coins = 3
minimum number of 1 Rupee coins = 2*/

import java.io.*;
import java.util.*;

public class CoinGame 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
int NumOf5RsCoin=0,NumOf2RsCoin=0,NumOf1RsCoin=0;
NumOf5RsCoin=(num-4)/5;

if(num<9 && num%2==0)
	NumOf1RsCoin=2;
else
	NumOf1RsCoin=1;
if(num>=9 && num%2!=0)
	NumOf1RsCoin=2;
else
	NumOf1RsCoin=1;

NumOf2RsCoin=(num-((5*NumOf5RsCoin)+(1*NumOf1RsCoin)))/2;

System.out.println("Sum of Total conin required="+(NumOf5RsCoin+NumOf2RsCoin+NumOf1RsCoin));
System.out.println("5Rs Coins="+NumOf5RsCoin);
System.out.println("2Rs Coins="+NumOf2RsCoin);
System.out.println("1Rs Coins="+NumOf1RsCoin);

}
}
