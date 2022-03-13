/* find minimum number of coins needed to aquire the given sum of rupee
ex: if coins are {1 2 5 6} and sumOfRupee 11 then minimum coins needed are 5 and 6 which is 2 coins*/

import java.io.*;
import java.util.*;

public class MinimumCoinsNeeded 
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
   System.out.print("Enter n value of Biased coins: ");
   int n=sc.nextInt();
   int[] coins=new int[n];
   System.out.print("Enter coins: ");
   for(int i=0;i<n;i++)
        coins[i]=sc.nextInt();
    System.out.print("enter Rupee value: ");
    int sum=sc.nextInt();
    int[][] dp=new int[n][sum+1];

    for(int i=0;i<n;i++)
        dp[i][0]=0;

    for(int i=0;i<=sum;i++)
        dp[0][i]=i;

    for(int i=1;i<n;i++)
    {
        for(int j=1;j<=sum;j++)
        {
            if(coins[i]>j)
            {
                dp[i][j]=dp[i-1][j];
            }
            else
            {
                dp[i][j]=Math.min(dp[i-1][j], 1+dp[i][j-coins[i]]);
            }
        }
    }
for(int i=0; i<n;i++)
    {
        for(int j=0;j<=sum;j++)
        {
            System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    System.out.print("Minimum coins needed are: "+dp[n-1][sum]);
}
}
