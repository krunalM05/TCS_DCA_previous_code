import java.io.*;
import java.util.*;

public class Football 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
int[] arr = new int[26];
for(int i=0;i<26;i++)
arr[i]=0;
for(int i=0; i< n*(n-1)/2;i++)
{
	String temp = sc.nextLine();

	char home = temp.charAt(0);
	char away = temp.charAt(2);
   
	String score1="";
	String score2="";

	for(int j = 4; temp.charAt(j)!='-'; j++)
	{
		score1+=temp.charAt(j);
	} 

	for(int j = temp.length()-1; temp.charAt(j)!='-'; j--)
	{
		score2+=temp.charAt(j);
	}

	
	int x = Integer.parseInt(score1);
	int y = Integer.parseInt(score2);

	if(x>y)
	{
		arr[home-'A']+=3;
	}
	else if(x==y)
	{
		arr[home-'A']+=1;
		arr[away-'A']+=1;
	}
	else
	{
		arr[away-'A']+=3;
	}

}
int max=Integer.MIN_VALUE;
	int index=-1;
	for(int k=0; k<26; k++)
	{
		if(arr[k]>max)
		{
			max=arr[k];
			index=k;
		}
	}
System.out.println((char)(index+'A')+"\n"+max);
}
}
