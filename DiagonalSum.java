import java.io.*;
import java.util.*;

public class DiagonalSum 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
Integer[][] mat = new Integer[n][n];
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	mat[i][j] = sc.nextInt();
}
Integer ls=0,rs=0,i=0,j=0;
while(i!=n && j!=n)
{
 ls+=mat[i][j];
 i++;
 j++;
}

i=0;j=n-1;
while(i!=n && j>=0)
{
 rs+=mat[i][j];
 i++;
 j--;
}
System.out.println(Math.abs(ls-rs));
System.out.println(ls+" "+ rs);
}
}
