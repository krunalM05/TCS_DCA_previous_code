   /* find minimum number of ways to exchange money with set of coins
   ex: set {1,2,3} and sumofRupee=4 then ways are {1111},{112},{22},{13} 4 ways*/

   import java.io.*;
   import java.util.*;
   
   public class CoinExchange 
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
   {
    dp[i][0]=1;
   }

   for(int i=0;i<=sum;i++)
   {
    if(i%2==0)
    dp[0][i]=1;
    else
        dp[0][i]=0;
   }

   for(int i=1;i<n;i++)
   {
    for(int j=1;j<=sum;j++)
    {
        if(coins[i]>j)
            dp[i][j]=dp[i-1][j];
        else
            dp[i][j]=dp[i-1][j]+dp[i][j-coins[i]];
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

    System.out.println("Total Ways of exchange "+sum+" rupee are: "+dp[n-1][sum]); 
   }
   }
   
   